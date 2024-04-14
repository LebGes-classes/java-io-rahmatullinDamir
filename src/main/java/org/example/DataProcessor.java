package org.example;

import java.util.ArrayList;
import java.util.HashMap;
public class DataProcessor {
    private ArrayList<String> data;
    private final String delimeter = ";";
    ArrayList<Student> attendenceLog = new ArrayList<>();
    DataProcessor(ArrayList<String> data) {
        this.data = data;
    }
    public ArrayList<Student> updateData() {
        for (String sub : data) {
            String[] ud = sub.split(delimeter);
            HashMap<String, String> attendence = new HashMap<>();
            attendence.put(ud[4], ud[3]);
            Student student = new Student(new Subject(ud[0]), new Teacher(ud[1]), ud[2],
                    attendence);
            Student studentInAttendenceLog = isStudentInAttendenceLog(student);
            if (studentInAttendenceLog != null) {
                var oldAttendence = studentInAttendenceLog.getAttendance();
                oldAttendence.put(ud[4], ud[3]);
                student.setAttendance(oldAttendence);
                continue;
            }
            attendenceLog.add(student);
        }
        return attendenceLog;
    }
    public Student isStudentInAttendenceLog(Student student) {
        for(Student checkStudent: attendenceLog) {
            if (student.equals(checkStudent)) {
                return checkStudent;
            }
        }
        return null;
    }

}
