<?php
$db_servername = "localhost";
$db_username = "root";
$db_password = "root";

// Create connection
$conn = new mysqli($db_servername, $db_username, $db_password);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
?>php -
