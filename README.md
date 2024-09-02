
#How to run

First create a DataBase (truckmgt) and table (truck) using the below reference:
//================================================================================
create database truckmgt;
use truckmgt;
create table truck(
		id int primary key auto_increment,
        name varchar(40),
        model varchar(40),    
        capacity int,
        driver_name varchar(20)
);
//==================================================================================
Don't forget to clone the pom.xml file as it contains information of project and configuration information for the maven to build the project.
Maven reads the pom. xml file, then executes the goal.
Then clone this repository.

##All set 👍

