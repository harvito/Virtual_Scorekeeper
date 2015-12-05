We have organised our application in the following manner:

An umple model called "newModel" was run and compiled in eclipse to create the following 
classes that incapsulate the "MODEL" in our MVC:
Manager (Singleton)
Match
Infraction
Shot
Team
Player

In the "Controller" folder we have a controller class which is the "COntroller" in our MVC.
In other words, it includes all the functionality needed to link our Model to our View
In includes the following methods:
Create newMatch
Create newPlayer
Create newTeam
sortPlayers by: goals, red cards, yellow cards, other, and penalites
sortteams by: points, red cards, yellow cards, othher, penalties, and goals
Create an array of all teams and sort them
Create an array of all people and sort them
Create infractions
Create Shots

We also included an Xstream Persistence class and this classed is used in the controller 
when creating new objects such as players and adds the instance of manager to the XML

we also included a test for the persistence

We have an interface ready for the:
Web browser 
Andoid
Desktop

Unfortunaely we have not had time to link the function and methods in the controller 
to the view in our MVC.

However for the desktop application (MainGUIWindow class) we have partially
added functionality to the bottuns, tables and they can tested or viewed
when the application is run or seen in the source code

The browser interface is not connected to the controller, however in order to view the
interface/test it locally, you need an application that gives you acccess to a local PHP
server and mySQL server. Simply copy paste the files from the php foler located in 
team3/src/php into htDocs of MAMP/XAMP....
Go to the browser at http://localhost/8888/index.com and the home page shall show up
There is a simple php script to only allow access to admin functions for 
Username: shane
Password: mcshane
The admin options are then available granting you access to live/batch/editplayer/editteam

SUmmary:
we have a fully functioning:
COntroller and Model
and 3 Views (for each platform)
however controller is not yet connected to view.  