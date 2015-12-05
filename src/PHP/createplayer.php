<!DOCTYPE html>
<html>
 <head>
  <title>Virtual Scorekeeper</title>
<style>
body {
    background-image: url("background.jpg");
    background-repeat: no-repeat;
    background-position: centre centre;
        background-size: cover;
}
    #header {
        color:white;
        text-align:center;
        padding-top:0px;
        height: 10px;
    }
    #subtitle {
        color:white;
        text-align:left;
        padding-left: 10px;
        padding-top: 5px;
        font-size: 100%;   
    }
    #title {
        color: white;
        text-align:center;
        padding-left: 10%;
        padding-right: 10%;
        font-size: 200%;
        text-decoration: none;
    }

    #title:link {
        text-decoration: none;
    }

#title:visited {
    text-decoration: none;
}

#title:hover {
    text-decoration: none;
    font-size: 250%;
}

#title:active {
    text-decoration: none;
    font-size: 250%;
}

   #playerinfo {
color:whitesmoke;
line-height:30px;
height:150px;
width:225px;
float:right;
padding:0px;
position: fixed;
top: 90px;
left: 0px;
font-size: 1em;
border-radius: 10px;
}


</style>
 </head>

<body>

    <div id="header">
        <a id="title" href="http://localhost:8888/index.php"> <strong> Virtual Scorekeeper </strong>  </a>
    </div>
    
    <div id="playerinfo">

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
            Input Player Name:<br>
<input type="text" name="playername"><br> 
            Input Player Number:<br>
<input type="text" name="playernumber"> <br> 
            Input Player Height:<br>
<input type="text" name="playerheight"> <br> 
            Input Player Weight:<br>
<input type="text" name="playerheight"> <br> 
            Input Player Position:<br>
<input type="text" name="playerposition"> <br>
            Input Player Team:<br>
<input type="text" name="playerheight"> <br>         
            <input type="submit" name="submit" value="Go"></input>
            </form>
    <?}
}
?>
  
  </div>  
   


</body>
</html>