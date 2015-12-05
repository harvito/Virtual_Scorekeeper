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
        height: 5px;
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

    #stopwatch {
        background-color: black;
        color: white;
       width: 200px;
        height: 10px;
        padding-left: 570px;
       
    }   

    #currenttime {
        color:white;
        text-align:left;
        padding-left: 10px;
        font-size: 100%;
        width: 100px;
        height: 20px;
    }
    #leftwrapper {
        
        width: 100px;
        height: 340px;
        margin-left: 200px;
        margin-top: 150px;
        color: white;
    }
    #rightwrapper {
    
        width: 100px;
        height: 340px;
        margin-right: 200px;
        margin-top: -350px;
        color: white;
        float: right;
    }
    
    #selecthome{
    list-style:none;
    margin-bottom:10px;
    float:left; /* Clear floats */
    width:140px;
    position:relative;
    z-index:5;  
    left: -10px;
    top: 10px;
}
    
    #selecthome li{
    float:left;
    margin-right:10px;
    position:relative;
}
#selecthome a{
    display:block;
    padding:5px;
    color:#fff;
    background:#333;
    text-decoration:none;
}
#selecthome a:hover{
    color:#fff;
    background:#6b0c36;
    text-decoration:underline;
}

/*--- DROPDOWN ---*/
#selecthome ul{
    background:black; /* Adding a background makes the dropdown work properly in IE7+. Make this as close to your page's background as possible (i.e. white page == white background). */
    background:rgba(255,255,255,0); /* But! Let's make the background fully transparent where we can, we don't actually want to see it if we can help it... */
    list-style:none;
    position:absolute;
    left:-9999px; /* Hide off-screen when not needed (this is more accessible than display:none;) */
}
#selecthome ul li{
    padding-top:1px; /* Introducing a padding between the li and the a give the illusion spaced items */
    float:none;
}
#selecthome ul a{
    white-space:nowrap; /* Stop text wrapping and creating multi-line dropdown items */
}
#selecthome li:hover ul{ /* Display the dropdown on hover */
    left:-40px; /* Bring back on-screen when needed */
    
}
#selecthome li:hover a{ /* These create persistent hover states, meaning the top-most link stays 'hovered' even when your cursor has moved down the list. */
    background-color: dimgray;
    text-decoration:underline;
}
#selecthome li:hover ul a{ /* The persistent hover state does however create a global style for links even before they're hovered. Here we undo these effects. */
    text-decoration:none;
}
#selecthome li:hover ul li a:hover{ /* Here we define the most explicit hover states--what happens when you hover each individual link. */
    background:#333;
}
    
    
       #selectaway{
    list-style:none;
    margin-bottom:10px;
    float:left; /* Clear floats */
    width:140px;
    position:relative;
    z-index:5;  
    right: -175px;
    top: 10px;
}
    
    #selectaway li{
    float:left;
    margin-right:10px;
    position:relative;
}
#selectaway a{
    display:block;
    padding:5px;
    color:#fff;
    background:#333;
    text-decoration:none;
}
#selectaway a:hover{
    color:#fff;
    background:#6b0c36;
    text-decoration:underline;
}

/*--- DROPDOWN ---*/
#selectaway ul{
    background:black; /* Adding a background makes the dropdown work properly in IE7+. Make this as close to your page's background as possible (i.e. white page == white background). */
    background:rgba(255,255,255,0); /* But! Let's make the background fully transparent where we can, we don't actually want to see it if we can help it... */
    list-style:none;
    position:absolute;
    left:-9999px; /* Hide off-screen when not needed (this is more accessible than display:none;) */
}
#selectaway ul li{
    padding-top:1px; /* Introducing a padding between the li and the a give the illusion spaced items */
    float:none;
}
#selectaway ul a{
    white-space:nowrap; /* Stop text wrapping and creating multi-line dropdown items */
}
#selectaway li:hover ul{ /* Display the dropdown on hover */
    left:-40px; /* Bring back on-screen when needed */
    
}
#selectaway li:hover a{ /* These create persistent hover states, meaning the top-most link stays 'hovered' even when your cursor has moved down the list. */
    background-color: dimgray;
    text-decoration:underline;
}
#selectaway li:hover ul a{ /* The persistent hover state does however create a global style for links even before they're hovered. Here we undo these effects. */
    text-decoration:none;
}
#selectaway li:hover ul li a:hover{ /* Here we define the most explicit hover states--what happens when you hover each individual link. */
    background:#333;
}
    
    
    
     #nav{
    list-style:none;
    margin-bottom:10px;
    float:left; /* Clear floats */
    width:140px;
    position:relative;
    z-index:5;  
    left: -10px;
    top: 80px;
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
   
         #nav1{
    list-style:none;
    margin-bottom:10px;
    float:left; /* Clear floats */
    width:140px;
    position:relative;
    z-index:5;  
    right: -900px;
    top: 80px;
}
#nav1 li{
    float:left;
    margin-right:10px;
    position:relative;
}
#nav1 a{
    display:block;
    padding:5px;
    color:#fff;
    background:#333;
    text-decoration:none;
}
#nav1 a:hover{
    color:#fff;
    background:#6b0c36;
    text-decoration:underline;
}

/*--- DROPDOWN ---*/
#nav1 ul{
    background:black; /* Adding a background makes the dropdown work properly in IE7+. Make this as close to your page's background as possible (i.e. white page == white background). */
    background:rgba(255,255,255,0); /* But! Let's make the background fully transparent where we can, we don't actually want to see it if we can help it... */
    list-style:none;
    position:absolute;
    left:-9999px; /* Hide off-screen when not needed (this is more accessible than display:none;) */
}
#nav1 ul li{
    padding-top:1px; /* Introducing a padding between the li and the a give the illusion spaced items */
    float:none;
}
#nav1 ul a{
    white-space:nowrap; /* Stop text wrapping and creating multi-line dropdown items */
}
#nav1 li:hover ul{ /* Display the dropdown on hover */
    left:-40px; /* Bring back on-screen when needed */
    
}
#nav1 li:hover a{ /* These create persistent hover states, meaning the top-most link stays 'hovered' even when your cursor has moved down the list. */
    background-color: dimgray;
    text-decoration:underline;
}
#nav1 li:hover ul a{ /* The persistent hover state does however create a global style for links even before they're hovered. Here we undo these effects. */
    text-decoration:none;
}
#nav1 li:hover ul li a:hover{ /* Here we define the most explicit hover states--what happens when you hover each individual link. */
    background:#333;
}
   
    
</style>
     <meta charset="UTF-8">
 </head>

<body onload="show();">

    <div id="header">
        <a id="title" href="http://localhost:8888/index.php"> <strong> Virtual Scorekeeper </strong>  </a>
    </div>
    
    <div id="subtitle">
       <h2>  Live Score Input   </h2>
    </div>
    
   <div id="stopwatch">
        <div>Time: <span id="time"></span></div>
        <input type="button" value="start" onclick="start();">
        <input type="button" value="stop" onclick="stop();">
        <input type="button" value="reset" onclick="reset()">
    </div>
    
    <div id="currenttime">
        <button onclick="myFunction()">Get Time</button>
        <p id="demo"> </p>
    </div>

    <ul id="nav"> 
    <li>
        <a href="#">Home Players</a>
        <ul>
            <li><a href="#">Lou</a></li>
            <li><a href="#">Mike</a></li>
            <li><a href="#"> Ahmad</a></li>
            <li><a href="#"> Donald Trump</a></li>
            <li><a href="#"> Shane</a></li>
        </ul>
    </li>  
</ul>

     <ul id="nav1"> 
    <li>
        <a href="#">Away Players</a>
        <ul>
            <li><a href="#">Ricardo</a></li>
            <li><a href="#">Romero</a></li>
            <li><a href="#">Ronaldo</a></li>
            <li><a href="#">Ronaldinho</a></li>
            <li><a href="#">Roberto Carlos</a></li>
        </ul>
    </li>  
</ul>

    <ul id="selecthome"> 
    <li>
        <a href="#">Home Team</a>
        <ul>
            <li><a href="#">Manchester United</a></li>
            <li><a href="#">Barcelona</a></li>
            <li><a href="#">Chelsea</a></li>
            <li><a href="#">Real Madrid</a></li>
            <li><a href="#">Manchester City</a></li>
        </ul>
    </li>  
</ul>
    
    <ul id="selectaway"> 
    <li>
        <a href="#">Away Team</a>
        <ul>
            <li><a href="#">Spurs</a></li>
            <li><a href="#">Giants</a></li>
            <li><a href="#">Tigers</a></li>
            <li><a href="#">Leopards</a></li>
            <li><a href="#">Filthy Dogs</a></li>
        </ul>
    </li>  
</ul>
    
    <div id="leftwrapper">
        <h3>Shot</h3>
        <div id="addshot">
            <button onclick="#">Missed Shot</button>
            <p id="demo"> </p>
        </div>
        <div id="addshotontarget">
            <button onclick="#">Shot on Target</button>
            <p id="demo"> </p>
        </div>
        <div id="addgoal">
            <button onclick="#">Goal</button>
            <p id="demo"> </p>
        </div>
        <h3>Infraction</h3>
        <div id="addfoul">
            <button onclick="#">Foul</button>
            <p id="demo"> </p>
        </div>
        <div id="addyellow">
            <button onclick="#">Yellow Card</button>
            <p id="demo"> </p>
        </div>
        <div id="addred">
            <button onclick="#">Red Card</button>
            <p id="demo"> </p>
        </div>
         <div id="addpenalty">
            <button onclick="#">Penalty</button>
            <p id="demo"> </p>
        </div>
    </div>
    
     <div id="rightwrapper">
        <h3>Shot</h3>
        <div id="addshot1">
            <button onclick="#">Missed Shot</button>
            <p id="demo"> </p>
        </div>
        <div id="addshotontarget1">
            <button onclick="#">Shot on Target</button>
            <p id="demo"> </p>
        </div>
        <div id="addgoal1">
            <button onclick="#">Goal</button>
            <p id="demo"> </p>
        </div>
        <h3>Infraction</h3>
        <div id="addfoul1">
            <button onclick="#">Foul</button>
            <p id="demo"> </p>
        </div>
        <div id="addyellow1">
            <button onclick="#">Yellow Card</button>
            <p id="demo"> </p>
        </div>
        <div id="addred1">
            <button onclick="#">Red Card</button>
            <p id="demo"> </p>
        </div>
         <div id="addpenalty1">
            <button onclick="#">Penalty</button>
            <p id="demo"> </p>
        </div>
    </div>
    
    
    
<script>
    
    //	Simple example of using private variables
//
//	To start the stopwatch:
//		obj.start();
//
//	To get the duration in milliseconds without pausing / resuming:
//		var	x = obj.time();
//
//	To pause the stopwatch:
//		var	x = obj.stop();	// Result is duration in milliseconds
//
//	To resume a paused stopwatch
//		var	x = obj.start();	// Result is duration in milliseconds
//
//	To reset a paused stopwatch
//		obj.stop();
//
var	clsStopwatch = function() {
		// Private vars
		var	startAt	= 0;	// Time of last start / resume. (0 if not running)
		var	lapTime	= 0;	// Time on the clock when last stopped in milliseconds

		var	now	= function() {
				return (new Date()).getTime(); 
			}; 
 
		// Public methods
		// Start or resume
		this.start = function() {
				startAt	= startAt ? startAt : now();
			};

		// Stop or pause
		this.stop = function() {
				// If running, update elapsed time otherwise keep it
				lapTime	= startAt ? lapTime + now() - startAt : lapTime;
				startAt	= 0; // Paused
			};

		// Reset
		this.reset = function() {
				lapTime = startAt = 0;
			};

		// Duration
		this.time = function() {
				return lapTime + (startAt ? now() - startAt : 0); 
			};
	};

var x = new clsStopwatch();
var $time;
var clocktimer;

function pad(num, size) {
	var s = "0000" + num;
	return s.substr(s.length - size);
}

function formatTime(time) {
	var h = m = s = 0;
	var newTime = '';

	h = Math.floor( time / (60 * 60 * 1000) );
	time = time % (60 * 60 * 1000);
	m = Math.floor( time / (60 * 1000) );
	time = time % (60 * 1000);
	s = Math.floor( time / 1000 );
	

	newTime = pad(h, 2) + ':' + pad(m, 2) + ':' + pad(s, 2);
	return newTime;
}

function show() {
	$time = document.getElementById('time');
	update();
}

function update() {
	$time.innerHTML = formatTime(x.time());
}

function start() {
	clocktimer = setInterval("update()", 1);
	x.start();
}

function stop() {
	x.stop();
	clearInterval(clocktimer);
}

function reset() {
	stop();
	x.reset();
	update();
}

    
function myFunction() {
    document.getElementById("demo").innerHTML = formatTime(x.time());
}     
    </script>
   

</body>
</html>