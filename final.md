# Milestone #6 - Final Delivery

## To-Do Date: Apr 14 at 11:59pm
**For your final submission, you will need to produce a video walk-through and overview of your project as well as complete a report (this can just be a .md file in your repo called final.md), detailing the following items (please provide some justification/details and not just a yes/no answer).   Please make it clear in your responses which item you are addressing.** 

**Please ensure that the report is merged to your main branch and submitted by the due date. Also, the branch for the current version of what you have built should be clearly indicated.**

## Video Walkthrough:

**For your final deliverable, you will need to produce a short video overview of your product walking through the features implemented (review what you committed to and ensure that you demo them).  This should be no more than 5-10 minutes.  For this, you only have to deploy the system on your local machine for this demo.   You can also choose to discuss the architecture of your system, the different components as well as how the system is built and deployed.  This can be posted on a private YouTube or equivalent channel (don't put the source video in your repo as it will be too large) and include the link in your final report.  Note: Thing is a key item in the final evaluation of your project.**

## Demonstration video
[https://youtu.be/Np1yJGCKN74](https://youtu.be/Np1yJGCKN74)

## General Development:

**What did your team build? Is it feature complete and running?**

As outlined in our previous milestones, our team has created a standalone iClicker clone application using Android Studio, which uses the Android Studio component panel for client UI, and Java to handle functionality which writes to .txt files by using read and write file input/output stream to function as our database. I can confirm that we have a functional version 2.0 release candidate that improves upon our original release with added feature branches that were implemented and merged. It is feature complete and we are able to successfully perform a full demonstration of the application since it is running. 

**How many of your initial requirements that your team set out to deliver did you actually deliver (a checklist/table would help to summarize)?  Were you able to deliver everything or are there things missing?  Did your initial requirements sufficiently capture the details needed for the project?**

Feature Checklist: 
- Fully implemented home page UI with login/logout screen and default logins for the professor and student view
- Separate Android Studio branches with working functionality for
- Professors to enter multiple questions with fields to add the question, multiple choice answers, and the correct answer selection [A, B, C, D, or E]
- New questions are written to the text file database and saved locally on device
- Once professor is done creating a question, they are shown the question, the answer options, and the correct answer on the "question summary activity page"
- If user is logged in as the student, they are presented with the same questions that professor had entered previously, which was pulled from text file database
- For each question, the student makes 1 selection from A, B, C, D, E and confirms selection.
- For each question, the student's answer is compared to correct selection from the database and provided with proper visual color feedback depending on if their answer was correct or incorrect.
- Once the student is done answering all questions, they are presented with a question summary page which shows their total score. 

For this second 2.0 release, we were able to complete each of the features we originally set out to complete as outlined above. Each feature was implemented on separate branches, tested, and then merged onto our main release branch. For simplicity and in order to demonstrate the functionality of our final application, we have decided to create two default logins, one for the Student view and one for the Professor view of the application. The multi question functionality of the application is functional and we also added a result screen for the student view with a score once they have answered every question. Additionally, we added error checking and toast messages in the event that fields such as username/password, or question entry fields are left empty which prompts the user to fill in these fields. Unfortunately, we were not able to fully implement the dockerized version of the application to support multi-device functionality, thus the app has remained as the standalone application version. 

**What is the architecture of the system?  What are the key components? What design patterns did you use in the implementation?  This needs to be sufficiently detailed so that the reader will have an understanding of what was built and what components were used/created.  You will need to reflect on what you planned to build vs what you built.**

The key components of the system are:

- Android client: This is the graphical user interface that the user interacts with. It is responsible for displaying the questions and choices to the user and storing the responses locally.
- File I/O: The application uses a read and write file input/output stream to function as our database, storing the questions and responses from the users locally.
- Network communication: Unfortunately, due to time constraints, the application does not use network communication since it is a standalone app. However, given more time this would have been easy to implement, since our File I/O is functioning as our local database. 
- As for the design patterns used in the implementation, we used the Model-View-Controller (MVC) pattern to separate the presentation logic from the business logic. The Model represents the data and the business logic, the View represents the graphical user interface, and the Controller handles the user input and updates the model and view accordingly.
- Overall, we were able to build a functional iClicker clone application with the key features we intended to include using a client-side model and the MVC design pattern.


**What degree and level of re-use was the team able to achieve and why?**

The team was able to achieve a moderate degree of re-use in the iClicker clone application. We were able to re-use some of the code and design from our previous milestones, particularly in the user interface and some of the functionality.

For example, we re-used the code for displaying questions and choices on the user interface, as well as the code for handling user input and updating the user interface. We also re-used some of the design patterns, such as the MVC pattern, which we used in our previous milestones. We are also able to re-use our existing code from our 1.0 release which only supported 1 question, in order to achieve our multi-question functionality in release 2.0. 

**How many tasks are left in the backlog?**

There are two tasks left in the backlog, while these tasks were not fully implemented due to time constraints, they could be easily implemented in a future release. Implementing dockerization would make it easier to deploy and scale the application, while adding the ability for professors to edit existing questions would make it more user-friendly and efficient for professors who need to make changes to their questions.

- Dockerization: Dockerization is the process of creating a container for an application that includes all of the necessary dependencies and settings to run the application on multiple devices.

- Ability for professors to edit existing questions: Currently, the iClicker clone application only allows professors to create new questions. The ability to edit existing questions would allow professors to modify questions that have already been created, rather than having to create new questions from scratch.

## CI/CD:

**What testing strategies did you implement?  Comment on their degree of automation and the tools used.    Would you (as a team) deal with testing differently in the future?  Make sure to ensure that your testing report is updated to reflect what's actually been done.**

The team implemented a number of testing strategies in the iClicker clone application, including unit testing, integration testing, and user acceptance testing. Unit testing was used to test individual components or functions of the application to ensure they were working as expected. This was done using JUnit. The degree of automation for unit testing was high, as the tests were automated. Integration testing was used to test how different components of the application worked together, such as the user interface and the file I/O system. These tests were also automated using JUnit. User acceptance testing was done manually by members of the team. We designed an initial paper prototype and asked volunteers to review it. The degree of automation for user acceptance testing was low, as it required manual testing and asking for feedback directly. We used this feedback to improve our paper prototype and then designed the android studio UI. 

**How did your branching workflow work for the team?  Were you successful in properly reviewing the code before merging as a team?**

As outlined above, each feature was implemented on separate branches, tested, and then merged onto our main release branch in order to produce a shippable product increment by the end of our sprint cycle. In order to keep track of features being developed, if they were still in progress, unit tested, and in order to keep track of who contributed what, we used a Kanban Board which was regularly updated. For communication we also set up a discord server to keep each other updated on the project timeline and held daily stand-up meetings to discuss which features we needed to prioritize and implement. 

**How would your project be deployed?  Is it docker ready and tested?  Provide a brief description of the level of dockerization you have implemented and what would be required to deploy.**

As outlined above, unfortunately our iClicker clone is not currently dockerized and the current 2.0 release is a standalone application. In a future release, if we were able to host our text file database in a docker container, our application could potentially support multiple devices. 

## Reflections (Comment on the following items as a team):

**How did your project management work for the team?  What was the hardest thing and what would you do the same/differently the next time you plan to complete a project like this?** 

Our team's main struggle was our commitments to other classes, full time jobs, and needing to prioritize studying for midterms in other classes before we were able to begin working on the project. Communication was good, since we had a dedicated discord server and held daily stand-ups. As the scrum leader, I (Jesse) had been ensuring that we stayed ahead of deadlines. When it comes to things we could have done differently, Darion and I would have liked to see a bit more contribution from our other teammates when it came to developing the first 1.0 release of the application, this was something that we had mentioned previously in Milestone 4. The way our KANBAN board was setup could have also been improved, during our Lab 7 - Planning and Process Review meeting with our TA, we received a 70% for our KANBAN board and were provided with better solutions to improve using GitHub projects in order to better keep track of the KANBAN board. If we were able to go back in time I believe that using GitHub projects from the start would have been a much better method to keep track of our progress timeline, feature implementation and project backlog. 

**Do you feel that your initial requirements were sufficiently detailed for this project?  Which requirements did you miss or overlook?**

One of the original feedback comments we received in Milestone 2 was minor issues which needed to be addressed regarding use cases and having stronger links between them and the requirements we originally outlined. One requirement we missed was regarding dockerization and supporting multiple android devices. However, aside from that I believe we were able to address this feedback in our later milestones and were able to successfully deploy a working standalone i-clicker clone application which meets the initial requirements we outlined in Milestone 2. 

**What did you miss in your initial planning for the project (beyond just the requirements)?**

During our initial planning, we did not discuss the specifics on how the multi question functionality would be implemented. This was easily resolved in a future daily standup where we discussed how it would function exactly in greater detail. This was the only significant detail missed in our initial planning.

**What process did you use (ie Scrum, Kanban..), how was it managed, and what was observed?**

For the development of our standalone application, testing, and pushing our first release, our team adopted the Agile Scrum methodology with role distinctions and an outlined sprint cycle for milestone 4 and 5. Additionally, in order to keep track of feature branches and unit testing, we used a KANBAN board to keep track of our project timeline and development process. 

**Agile Scrum Roles:**
- The Scrum Master: Jesse Lazzari
- Product Owner: Darion Pescada
- Delivery Team: All team members

**Milestone 4 Agile Scrum Sprint Cycle:** 
Normally, within Agile Scrum the sprint cycle is 2-4 weeks long however our team needs to speed up in order to be able to meet the March 26th deadline, thus our sprint cycle needed to be cut short to 3 days. The goal of this sprint is to produce a shippable product increment, that is a working release of our app.

**Milestone 5 Agile Scrum Sprint Cycle:** 
Similarly to the previous milestone, in order to be able to meet the April 3rd deadline, our sprint cycle needed to be cut short to 2 days. The goal of this sprint is to produce a shippable product increment that improves upon our first release and satisfies the remaining components we set out to deliver in our milestone 3 summary. 

**As a team, did you encounter issues with different team members developing with different IDEs?  In the future, would the team change anything in regard to the uniformity of development environments?**

Since the team all used VS Code, this issue was completely avoided. Additionally, since we used branching workflow, it was easy to test features individually before they were merged onto our main release branch. Thus, the team did not need to change anything in regard to the uniformity of development environments. 

**If you were to estimate the efforts required for this project again, what would you consider?  (Really I am asking the team to reflect on the difference between what you thought it would take to complete the project vs what it actually took to deliver it).**   

We were very confident going into the project with the impression we would be able to complete everything without any issues. Although we did not have any major issues to deal with during the project, it did take us much longer to implement the application than expected. For future projects, it would be a good idea to allocate more time for implementation in the case that something unexpected occurs or things simply take longer to do than what we originally thought.

**What did your team do that you feel is unique or something that the team is especially proud of (was there a big learning moment that the team had in terms of gaining knowledge of a new concept/process that was implemented).**

We believe the overall completion of the project was our biggest achievement since we successfully completed what we set out to do and are proud to have created a functional application. Nothing in particular about our project was overly complicated so we didn’t necessarily gain much knowledge in terms of coding. The major benefit for us was the experience we gained since this was one of the first large software projects for some of us. 
