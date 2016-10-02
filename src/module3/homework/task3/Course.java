package module3.homework.task3;

import java.util.Date;


class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }
}
