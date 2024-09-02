# Truck Management App
This app helps to store and manage data of trucks 

## How to run
### First create a DataBase (truckmgt) and table (truck) using the below reference:

create database truckmgt;<br>
use truckmgt;<br>
create table truck(<br>
	id int primary key auto_increment,<br>
        name varchar(40),<br>
        model varchar(40), <br>   
        capacity int,<br>
        driver_name varchar(20)<br>
);

Don't forget to clone the pom.xml file as it contains information of project and configuration information for the maven to build the project.
Maven reads the pom. xml file, then executes the goal.
Then clone this repository.

### All set 👍

