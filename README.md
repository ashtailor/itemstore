# ItemStore Management Project

##Project Overview
ItemStore  is a java spring boot application that exposes restful API to manage a collection of items.
The goal of this project is to practice:
- REST API design
- Controller and Service layer separation
- In-memory data handling without using a database

###Project Architecture
This application follows a layered architecture
1. Model layer- it represent data structure of an item.it contains field like name id,name,description,price,category.
2. Service layer- it contains all business logic.it manages items using memory list(arraylist)
3.Controller layer- it handles HTTP requests (GET, POST, DELETE). it calls service methods and return responses.


