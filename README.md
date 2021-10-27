# RevaCompany

## Description 

   RevaCompany is a scalable Java application that facilitates the management and productivities of employees via assigning tasks. 
    A manager can manage and assign tasks to their employees via a manager view while employees can view their assigned tasks and mark them as complete.

## Requirements
1. Data is stored in a database.
2. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects.
3. All input is received using the java.util.Scanner class.
4. All public service layer methods must have at least one JUnit test.
5. Log4j is implemented to log events to a file.

## Roles
- Admin: can assign managers and tasks to all employees
- Manager: can assign tasks to the employee they manage
- Basic_User: can view their tasks and mark them as complete 

## User Stories

* As a user, I can register and login.
* As a user, I can update my login information.
* As an admin, I can view all employees and their managers.
* As an admin, I can assign managers to employees.
* As a manager, I can view employees assigned to me.
* As the system, I will assign new employees to a predefined EnrollmentAdmin user.

* As a manager or as an admin, I can assign tasks with a due date to employees.
* As an employee, I can view all tasks assigned to me.
* As an employee, I can update the status to a task assigned to me.
