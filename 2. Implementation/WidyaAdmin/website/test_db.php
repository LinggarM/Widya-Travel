<html>
    <body>
            <?php
              // Include login information
              require_once('db_login.php');
  
              // Connect to the db
              $con = mysqli_connect($db_host, $db_username, $db_password, $db_database);
              if (mysqli_connect_errno()){
                  die ("Could not connect to the database: <br />". mysqli_connect_error( ));
              }

              // Get the test result
              $result = mysqli_query($con, "SELECT * FROM kota");
                while($data = mysqli_fetch_array($result)){
                    echo $data['nama_kota'].'<br/>';
                }
              mysqli_close($con);
            ?>
    </body>
</html>