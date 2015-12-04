<!DOCTYPE html>
<html>
 <head>
  <title>Virtual Scorekeeper</title>
<style>
body {
    background-image: url("background.jpg");
    background-repeat: no-repeat;
    background-position: centre centre;
    max-width: 100%;
    max-height: 100%;
    background-size: cover;
}
a {
color: white;
    text-align:center;
    padding-left: 10%;
    padding-right: 10%;
    font-size: 200%;
    text-decoration: none;
}

a:link {
    text-decoration: none;
}

a:visited {
    text-decoration: none;
}

a:hover {
    text-decoration: none;
    font-size: 225%;
}

a:active {
    text-decoration: none;
font-size: 225%;
}
#header {
color:white;
text-align:center;
padding-top:0px;
font-size: 250%
}
#teamrankings {
line-height:30px;
height:20px;
width:100%;
float:left;
padding:5px;
position: fixed;
top: 30%;
left: 10%;
}
#playerrankings {
line-height:30px;
height:20px;
width:500px;
float:right;
padding:5px;
position: fixed;
top: 30%;
right: 10%;
}
#adminlogin {
color:whitesmoke;
line-height:30px;
height:150px;
width:225px;
float:right;
padding:0px;
position: fixed;
bottom: 0px;
right: 0px;

    font-size: 1em;
    border-radius: 10px;
}



</style>
      
 </head>

<body>

    
<div id="header">
<h1>Virtual Scorekeeper</h1>
</div>


<div id="teamrankings">
<a href="http://localhost:8888/teamrankings.php"> <strong> View Team Rankings </strong> </a>

</div>

<div id="playerrankings">

<a href="http://localhost:8888/playerrankings.php"> <strong> View Player Rankings </strong> </a>
</div>

<div id="adminlogin">

        <?php
$user = $_POST['Username'];
$pass = $_POST['Password'];

if($user == "shane"
&& $pass == "mcshane")
{
        include("adminpage.php");
}
else
{
    if(isset($_POST))
    {?>

            <form method="POST" action="index.php">
            Please enter Admin Username:<br>
<input type="text" name="Username">
<br> 
            Please enter Admin Password:<br>
<input type="password" name="Password"> <br> 
            <input type="submit" name="submit" value="Go"></input>
            </form>
    <?}
}
?>
  
  </div>      

       
    
</body>
</html>