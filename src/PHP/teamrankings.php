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

    #nav{
    list-style:none;
    margin-bottom:10px;
    float:left; /* Clear floats */
    width:80px;
    position:relative;
    z-index:5;  
    left: -30px;
    top: -20px;
}
#nav li{
    float:left;
    margin-right:10px;
    position:relative;
}
#nav a{
    display:block;
    padding:5px;
    color:#fff;
    background:#333;
    text-decoration:none;
}
#nav a:hover{
    color:#fff;
    background:#6b0c36;
    text-decoration:underline;
}

/*--- DROPDOWN ---*/
#nav ul{
    background:black; /* Adding a background makes the dropdown work properly in IE7+. Make this as close to your page's background as possible (i.e. white page == white background). */
    background:rgba(255,255,255,0); /* But! Let's make the background fully transparent where we can, we don't actually want to see it if we can help it... */
    list-style:none;
    position:absolute;
    left:-9999px; /* Hide off-screen when not needed (this is more accessible than display:none;) */
}
#nav ul li{
    padding-top:1px; /* Introducing a padding between the li and the a give the illusion spaced items */
    float:none;
}
#nav ul a{
    white-space:nowrap; /* Stop text wrapping and creating multi-line dropdown items */
}
#nav li:hover ul{ /* Display the dropdown on hover */
    left:-40px; /* Bring back on-screen when needed */
    
}
#nav li:hover a{ /* These create persistent hover states, meaning the top-most link stays 'hovered' even when your cursor has moved down the list. */
    background-color: dimgray;
    text-decoration:underline;
}
#nav li:hover ul a{ /* The persistent hover state does however create a global style for links even before they're hovered. Here we undo these effects. */
    text-decoration:none;
}
#nav li:hover ul li a:hover{ /* Here we define the most explicit hover states--what happens when you hover each individual link. */
    background:#333;
}
   

</style>
 </head>

<body>

    <div id="header">
        <a id="title" href="http://localhost:8888/index.php"> <strong> Virtual Scorekeeper </strong>  </a>
    </div>
    
    <div id="subtitle">
       <h2>  Team Statistics   </h2>
    </div>
    
   
<ul id="nav"> 
    <li>
        <a href="#">Sort By</a>
        <ul>
            <li><a href="#">Wins</a></li>
            <li><a href="#">Goals Scored</a></li>
            <li><a href="#"> Yellow Cards</a></li>
            <li><a href="#"> Red Cards</a></li>
            <li><a href="#"> Penalties</a></li>
        </ul>
    </li>  
</ul>

</body>
</html>