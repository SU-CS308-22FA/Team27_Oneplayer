<?php
$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "proje";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
if(isset($_POST['submit'])) {
    $iduser = "7";
    $user_id = "8";
    $username = $_POST['name'];
    $user_mail_adress = $_POST['email'];
    $user_password = $_POST['password'];


    $mysql = "INSERT INTO user (iduser, user_id, user_name, user_mail_address, user_password)
VALUES ('$iduser', '$user_id', '$username', '$user_mail_adress', '$user_password')";

    if ($conn->query($mysql) === TRUE) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $mysql . "<br>" . $conn->error;
    }
}
?>