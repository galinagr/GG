package module3.homework.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY");
        Date date = dateFormat.parse("01-01-2016");
        Student student1 = new Student("Jack", "Pitt", 101);
        Student student2 = new Student("Jack", "Pitt", 18, 101, new Course[]{Student.getCoursesTaken()[0]});
        Student student3 = new Student("Jack", "Pitt", 18, 122, new Course[]{Student.getCoursesTaken()[4]});
        Course course1 = new Course(date, "Nick");
        Course course2 = new Course("Jack", 10, "Nickolson");
        Course course3 = new Course("Jack", 15, "Nickolson");
        CollegeStudent collegeStudent1 = new CollegeStudent("Nick", "Pitt", 123);
        CollegeStudent collegeStudent2 = new CollegeStudent("Pitt", "Nick", 22, 123, new Course[]{Student.getCoursesTaken()[0]});
        CollegeStudent collegeStudent3 = new CollegeStudent("Pitt", "Nick", 23, 101, new Course[]{Student.getCoursesTaken()[1]}, "KPI", 1212, 10);
        CollegeStudent collegeStudent4 = new CollegeStudent("Pitt", "Nick", 22, 101, new Course[]{Student.getCoursesTaken()[3]}, "KPI", 1212, 10);
        CollegeStudent collegeStudent5 = new CollegeStudent("Pitt", "Nick", 22, 123, new Course[]{Student.getCoursesTaken()[5]});
        SpecialStudent specialStudent1 = new SpecialStudent("Nick", "Nick", 101, 15, new Course[]{Student.getCoursesTaken()[0]});
        SpecialStudent specialStudent2 = new SpecialStudent("Nick", "Nick", 101, 15);
        SpecialStudent specialStudent3 = new SpecialStudent("Petrov", "Oleg", 23, 121, new Course[]{Student.getCoursesTaken()[1]}, "KPI", 1212, 121);
        SpecialStudent specialStudent4 = new SpecialStudent("Petrov", "Oleg", 23, 124, new Course[]{Student.getCoursesTaken()[2]}, "KPI", 1212, 121);
    }
}

