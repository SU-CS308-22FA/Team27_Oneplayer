package com.cs308.oneplayer.model;

// Importing required classes
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.*;

// Annotations
@Entity
@Table(name = "proje")

public class user {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fname")
  private String fname;

    @Column(name = "lname")
  private String lname;
    @Column(name = "email")
  private String email;
    @Column(name = "username")
  private String username;
    @Column(name = "password")
  private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getfname() {
        return fname;
    }

    public void setfname(String name) {
        this.fname = name;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String lastName) {
        this.lname = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}