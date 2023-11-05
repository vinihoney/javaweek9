package automationtest;
/* 5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop.  */
public class ArrayList_Q5 {
    public static void main(String[] args) {

        String sname[] = {"Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman","Rest Assured"};
       int i;
        for (i = 1; i <=sname.length; ++i) {
            System.out.println(sname[i]);
        }
    }
}