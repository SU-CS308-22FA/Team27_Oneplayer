<?php
if (isset($_POST['submit'])) {
    if (isset($_POST['name']) && isset($_POST['lastName']) &&
        isset($_POST['email']) && isset($_POST['username']) &&
        isset($_POST['password'])) {

        $name = $_POST['name'];
        $lastName = $_POST['lastName'];
        $email = $_POST['email'];
        $username = $_POST['username'];
        $password = $_POST['password'];

        $host = "localhost";
        $dbUsername = "root";
        $dbPassword = "root";
        $dbName = "proje";

        $conn = new mysqli($host, $dbUsername, $dbPassword, $dbName);

        if ($conn->connect_error) {
            die('Could not connect to the database.');
        }
        echo "Connection Complete";
    }
}