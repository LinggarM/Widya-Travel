<?php
    $id = $_GET['id'];
    // connect database
    require_once('db_login.php');
    $db = new mysqli($db_host, $db_username, $db_password, $db_database);
    if ($db->connect_errno){
        die ("Could not connect to the database: <br />". $db->connect_error);
    }
    $query = " DELETE FROM drivers WHERE id_driver=".$id." ";
    // Execute the query
    $result = $db->query( $query );
    if (!$result){
        die ("Could not query the database: <br />". $db->error);
    }else{
        echo 'Data has been deleted.<br /><br />';
        echo '<a href="driver.php">Back to drivers data</a>';
        $db->close();
        exit;
    }
    $db->close();
?>