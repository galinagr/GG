package module3.homework.task3;

import java.util.Date;

class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int age;
    private static Date date = new Date();
    private static Course firstCourse = new Course(date, "Math");
    private static Course secondCourse = new Course(date,"Phi");
    private static Course thirdCourse = new Course (date, "Psyc");
    private static Course forthCourse = new Course (date, "Lit");
    private static Course fifthCourse = new Course(date, "Prog");
    private static Course[] coursesTaken = {firstCourse, secondCourse, thirdCourse, forthCourse, fifthCourse};


    Student(String firstName, String lastName, int age, int group, Course[] coursesTaken) {
        this.lastName = lastName;
        Student.coursesTaken = coursesTaken;
        this.firstName = firstName;
        this.age = age;
        this.group = group;
    }

    Student(String lastName, String firstName, int group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    static Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public String getLastName() {

        return lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        Student.coursesTaken = coursesTaken;
    }
}
