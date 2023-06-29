# COSC 310 - Software Engineering
# Group JBAD - iClicker Clone
# Milestone #5

**Team members:** Jesse Lazzari, Bhavya Bhagchandani, Arsh Bhat, Darion Pescada

**Milestone #5 – Testing/R&R Report/Improved Release 2.0 (April 3) (10%)**

**Project Milestone Goals Summary:** 

For the development of our standalone application, testing, and pushing our improved release, we will be adding additional functionality to our application and have converted our Agile Scrum timeline into a KANBAN board. For this release we aim to improve home page UI, add multi question functionality with read/write capability to .txt file, add a proper login activity with functionality through the use of default logins for Student and Professor view, and add a question result screen for student view with summary and score

**Agile Scrum Roles:**
- The Scrum Master: Jesse Lazzari
- Product Owner: Darion Pescada
- Delivery Team: All team members

**Daily Standups:**
- During the first daily standup for this sprint Darion and I (Jesse), discussed which features we would like to implement, converted our project timeline into a proper KANBAN board and divided tasks amongst the team. 
- During our second daily standup we discussed the remaining features that needed to be implemented and tested. As well as update our Milestone 5 README. 

**Agile Scrum Sprint Cycle:**
Normally, within Agile Scrum the sprint cycle is 2-4 weeks long however our team needs to speed up in order to be able to meet the April 3rd  deadline, thus our sprint cycle needed to be cut short to 2 days. The goal of this sprint is to produce a shippable product increment that improves upon our first release and satisfies the remaining components we set out to deliver in our milestone 3 summary.

# KANBAN BOARD (UPDATED):

## 1. Highlight what tasks were done during this cycle (by owner)

| Task                                                             | In Progress | Unit Tested | Contributor(s)           | Done (Yes/No) |
|------------------------------------------------------------------|-------------|-------------|--------------------------|----------------|
| Created Milestone 4 summary, role assignment and Summary dashboard | No          | N/A         | Jesse and Darion         | Yes            |
| Designed UI interface paper prototype                            | No          | Yes         | Jesse and Darion         | Yes            |
| Tested and reviewed paper prototype                              | No          | Yes         | Bhavya and Arsh           | Yes            |
| Improved original paper prototype and digitized                  | No          | Yes         | Jesse                    | Yes            |
| Created new Android Studio project                               | No          | No          | Darion                   | Yes            |
| Designed Main Activity in android studio                         | No          | Yes         | Jesse and Darion         | Yes            |
| Designed Create Question Activity in android studio              | No          | Yes | Arsh and Bhavya | Yes |
| Designed Question Summary Activity in android studio             | No          | Yes | Arsh and Bhavya | Yes |
| Designed Answer Question Activity in android studio              | No          | Yes | Arsh and Bhavya | Yes |
| Designed Question Result Activity                                | No          | Yes | Arsh and Bhaya | Yes |
| Coded Student or Professor feature for Main Activity Screen      | No          | Yes | Darion        | No             |
| Added button functionality to navigate between activities        | No          | Yes         | Darion                   | Yes            |
| Added functionality for Create question view, and question summary view | No          | No          | Jesse                    | Yes            |
| Added error checking and ensured user control and flow (unable to continue without adding all new question text fields) | No | Yes | Darion | Yes |
| Added String bundles functionality to pass values between views. | No          | No          | Jesse                    | Yes            |
| Text file buffered writer implementation for standalone app implementation | No | No | Jesse | Yes |
| File input/output implementation                                  | No          | No          | Darion                   | Yes            |
| Programmed correct answer functionality for basic 1 question quiz.| No          | Yes         | Jesse and Darion         | Yes            |
| Added outline and unit tests for Login/Logout functionality for next release | No          | Login/logout features written by Bhavya and Arsh | Bhavya and Arsh | No |
| Updated KANBAN board with new tasks                               | No          | N/A         | Jesse                    | Yes            |
| Improve home page UI                                              | No          | N/A         | Jesse                    | Yes            |
| Added multi question functionality with read/write capability to .txt file | No          | Instrumental tests written by Bhavya and Arsh | Darion | Yes |
| Added login activity and functionality                            | No          | Yes | Arsh and Bhavya | Yes |
| Added default logins for Student and Professor view               | No          | Yes | Arsh and Bhavya | Yes |
| Added question result screen for student view with summary and score | No          | Yes | Darion | Yes |

## 2. Summary of the progress 
For this second release, we were able to complete each of the additional features as outlined above. Each feature was implemented on separate branches, tested and then merged onto our main release branch. For simplicity and in order to present our final application, we have decided to create two default logins, one for the Student view and one for the Professor view of the application. The multi question functionality of the application is functional and we also added a result screen for the student view with a score once they have answered every question. Additionally, we added error checking and toast messages in the event that fields such as username/password, or question entry fields are left empty which prompts the user to fill in these fields. 


## 3. Comments on the process;  how is the process you selected as a team working?  Does anything need to change?

So far the process has been good, our team's main struggle is our commitments to other classes, full time jobs, and needing to prioritize studying for midterms in other classes before we were able to begin working on the project. Communication has been good, since we have a dedicated discord server and hold daily standups. As the scrum leader, I have also been ensuring that we stay ahead of deadlines. For our next release, Darion and I would like to see more contribution from the rest of the team however this is something we've talked about already. 


## 4. If you have a release candidate (something that is working, even partially, make note of that (this could be on your master branch, or you might choose to branch from master onto a release branch.  

As we reach closer to our April 3rd deadline, I can confirm that we have a functional version 2.0 release candidate that improves upon our original release with added feature branches that were merged and implemented. At this moment in time with the current feature implementations we would be able to perform an improved full demonstration of the application as well.
