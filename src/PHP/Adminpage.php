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
    font-size: 250%;
}

a:active {
    text-decoration: none;
    font-size: 250%;
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


    
    
    
<div id="adminactions";>
    <div id="title"> <strong> Admin Actions </strong>  </div>
    <a id="adminoptions" href="http://localhost:8888/Page2a.php"> <strong> Create Team </strong> </a>
    <a id="adminoptions" href="http://localhost:8888/Page2a.php"> <strong> Create Player </strong> </a>
    <a id="adminoptions" href="http://localhost:8888/live.php"> <strong> Live Score Input </strong> </a>
    <a id="adminoptions" href="http://localhost:8888/batch.php"> <strong> Batch Score Input </strong> </a>
    
    </div>   
    
    
    
    
    
    
    
</body>
</html>