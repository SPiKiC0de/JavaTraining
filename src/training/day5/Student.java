package training.day5;

import java.util.*;


class Student extends Person {
    private String classStudent;
    private int numberInClass;
    private List<String> subjects;
    private List<Double> grades;
    public Student(String name, String gender, int ID, String classStudent, int numberInClass) {
        super(name, gender, ID);
        this.classStudent = classStudent;
        this.numberInClass = numberInClass;
        this.subjects = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public int getnumberInClass() {
        return numberInClass;
    }
    public void addGrade(String subject, double grade) {
        if (grade >= 2.00 && grade <= 6.00) {
            subjects.add(subject);
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade should be between 2.00 and 6.00.");
        }
    }
    public double getHighestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        return Collections.max(grades);
    }
    public double getLowestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        return Collections.min(grades);
    }
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / grades.size();
        return Math.round(average * 100.0) / 100.0;
    }
    public static String getSubjectWithHighestGrade(Student student) {
        String highestSubject = null;
        double highestGrade = 0.0;

        for (int i = 0; i < student.subjects.size(); i++) {
            double grade = student.grades.get(i);
            if (grade > highestGrade) {
                highestGrade = grade;
                highestSubject = student.subjects.get(i);
            }
        }

        return highestSubject;
    }
    public String getHighestGradeSubject() {
        if (grades.isEmpty()) {
            return null;
        }
        int highestGradeIndex = grades.indexOf(getHighestGrade());
        return subjects.get(highestGradeIndex);
    }
    public boolean hasGradeForSubject(String subject) {
        return subjects.contains(subject);
    }
}

