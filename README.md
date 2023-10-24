# TaskApp-Assignment

# Getting Started
## You can import the project into IntelliJ and start running the app
### Screenshots are in the Screenshots folder. To speed up testing, you can import the postman collection which is the Postman Export folder


Please create an empty Spring Boot project.

Add the following REST API endpoints

GET /tasks <- Returns all tasks
GET /tasks/:id <- Returns Task by ID

POST/tasks <- Creates a Task
PUT /tasks/:id <- Updates a Task by ID

Task model should include:

title: String
description: String
completed: Boolean
createDate: Date
completed: Date


Store the task data in memory for retrieval and updates, no database required

Please commit the code to a git platform of your choice (github/gitlab/bitbucket/etc) and share the link with us.

Team will pull and run the code to test the API so ensure Readme include all details required to start the project.
