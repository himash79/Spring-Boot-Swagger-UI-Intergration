# Spring-Boot-Swagger-UI-Intergration
Build Restful web services utilizing Spring boot and initiate Document UI for end user using Swagger UI.

## Requirements

01) Java 1.8
02) Maven 3.8
03) MySQL

## Project setup

01) Clone the project

		git clone https://github.com/himash79/Spring-Boot-Swagger-UI-Intergration.git

02) Create MySQL Database

		Create database import attached query data file.

03) Clean and build the project using maven

		open command line (CMD) in project directory and execute 'mvn clean install'
		
04) Open project using intelij / eclipse

05) Set up database configurations in application.properties file
		
		spring.datasource.url = Develper database URL
		spring.datasource.username = Developer database username
		spring.datasource.password = Developer database password
		
06) Monitor webservice swagger documentation.

    http://localhost:[port]/swagger-ui.html#/
