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
    padding-top: 10%;
    padding-bottom: 10%;
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
    
#adminoptions {
color: white;
    text-align:center;
    padding-left: 20px;
    padding-right: 60px;
    padding-top: 10px;
    padding-bottom: 10px;
    font-size: 150%;
    text-decoration: none;
}

#adminoptions:link {
    text-decoration: none;
}

#adminoptions:visited {
    text-decoration: none;
}

#adminoptions:hover {
    text-decoration: none;
    font-size: 160%;
}

#adminoptions:active {
    text-decoration: none;
font-size: 160%;
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
    #adminactions {
        line-height:30px;
        height:110px;
        width:20%;
        float:left;
        padding:5px;
        position: fixed;
        bottom: 120px;
        left: 10px;
        right: 10%;
        color: white;
        
    }
    
    #title {
      
        width: 90px;
        font-size: 250%;
        padding-left: 20px;
        padding-bottom: 20px;
       
    }
    


</style>
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
 

</body>
</html>