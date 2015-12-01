<!DOCTYPE html>
<html>
 <head>
  <title>Virtual Scorekeeper</title>
<style>
body {
    background-image: url("http://www.footballhdwallpapers.net/uploads/content/green-football-stadium-hd-wallpapers-1080p-hd-wallpapers.jpg");
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
color:black;
line-height:30px;
height:20px;
width:200px;
float:right;
padding:0px;
position: fixed;
bottom: 275px;
right: 50px;
}



</style>
       <META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
  <META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
 </head>

<body>

    
<div id="header">
<h1>Virtual Scorekeeper</h1>
</div>


<div id="teamrankings">
<a href="http://localhost:8888/Page2a.php"> <strong> View Team Rankings </strong> </a>

</div>

<div id="playerrankings">

<a href="http://localhost:8888/Page2a.php"> <strong> View Player Rankings </strong> </a>
</div>

<div id="adminlogin">
<h1>Admin Login</h1>
<style>
    input { border: 1px solid black; }
  </style>
  <form method="post">
    <font color="red"><?php echo $error_msg; ?></font><br />
<?php if (USE_USERNAME) echo 'Username:<br /><input type="input" name="access_login" /><br />Password:<br />'; ?>
    <input type="password" name="access_password" /><p></p><input type="submit" name="Submit" value="Submit" />
  </form>
  <br />
  <a style="font-size:9px" href="http://localhost:8888/page3.php" title="Download Webpage Password Protect">Powered by Password Protect</a>
</div>
</body>
</html>