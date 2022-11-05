package com.cs308.oneplayer.controller;

import com.cs308.oneplayer.model.user;
import com.cs308.oneplayer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;
    private user user;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/signup")
    public String signupForm(Model model){
        model.addAttribute("user", new user());
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute user user, Model model) {
        model.addAttribute("user", user);
        userRepository.save(user);
        return "signup_result";
    }

    @GetMapping("/login")
    public String loginForm(Model model){
        model.addAttribute("user", new user());
        return "login";
    }
    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute user user, Model model){
        model.addAttribute("user", user);
        user logggedUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if(logggedUser != null){
            userProfile(logggedUser,model);
            return "user_profile";
        }else{
            return "login";
        }
    }
    @GetMapping("/user_profile")
    public String userProfile(@ModelAttribute user user, Model model){
        model.addAttribute("user", user);
        return "user_profile";
    }
    @PostMapping(value = "/user_profile", params = "submit")
    public String userProfileSubmit(@ModelAttribute user user, Model model){
        userRepository.save(user);
        return "Done";
    }
    @PostMapping(value = "/user_profile", params = "delete")
    public String userProfileDelete(@ModelAttribute user user, Model model){
        userRepository.deleteById(user.getId());
        return "Done";
    }

}
