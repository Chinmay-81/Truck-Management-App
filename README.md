# Truck Management App
This app helps to store and manage data of trucks 

## How to run
### First create a DataBase (truckmgt) and table (truck) using the below reference:

create database truckmgt;<br>
use truckmgt;<br>
create table truck(
	id int primary key auto_increment,
        name varchar(40),
        model varchar(40),   
        capacity int,
        driver_name varchar(20)
);

1.Don't forget to clone the pom.xml file as it contains information of project and configuration information for the maven to build the project.
Maven reads the pom. xml file, then executes the goal.<br>
2.Then clone this repository.

### All set 👍

