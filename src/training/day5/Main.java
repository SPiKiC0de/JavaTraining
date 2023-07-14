package training.day5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printPersonInformation(List<Person> people) {
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student:" + student.getName() + ", ID:" + student.getID()+", Number in class:"+student.getNumberInClass());
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Teacher:" + teacher.getName() + ", ID:" + teacher.getID()+", School:"+teacher.getSchool()+", Subject:" +teacher.getSubject());
            }
        }
    }

    public static Student findStudentWithHighestGrade(List<Person> people, String subject) {
        Student studentWithHighestGrade = null;
        double highestGrade = 0.0;
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.hasGradeForSubject(subject)) {
                    double grade = student.getHighestGrade();
                    if (grade > highestGrade) {
                        studentWithHighestGrade = student;
                        highestGrade = grade;
                    }
                }
            }
        }
        return studentWithHighestGrade;

    }

    public static Student findStudentWithLowestGrade(List<Person> people, String subject) {
        Student studentWithLowestGrade = null;
        double lowestGrade = Double.MAX_VALUE;
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.hasGradeForSubject(subject)) {
                    double grade = student.getLowestGrade();
                    if (grade < lowestGrade) {
                        studentWithLowestGrade = student;
                        lowestGrade = grade;
                    }
                }
            }
        }
        return studentWithLowestGrade;

    }

    public static double calculateAverageSalary(List<Person> people) {
        double totalSalary = 0.0;
        int teacherCount = 0;
        for (Person person : people) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                totalSalary += teacher.getSalary();
                teacherCount++;
            }
        }
        if (teacherCount > 0) {
            return totalSalary / teacherCount;
        }
        return 0.0;

    }

    public static double calculateAverageClassGrade(List<Person> people) {
        double totalGrade = 0.0;
        int studentCount = 0;

        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                totalGrade += student.getAverageGrade();
                studentCount++;
            }
        }

        if (studentCount > 0) {
            return Math.round((totalGrade / studentCount) * 100.0) / 100.0;
        } else {
            return 0.0;

        }
    }

    public static Teacher teacherWithHighestGrades(List<Person> people) {
        Teacher teacherWithHighestGrades = null;
        double highestGrade = 0.0;
        for (Person person : people) {
              if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                List<String> subjects = teacher.getSubjects();
                for (String subject : subjects) {
                    for (Person p : people) {
                        if (p instanceof Student) {
                            Student student = (Student) p;
                            if (student.getHighestGrade() > highestGrade && student.getHighestGradeSubject().equals(subject)) {
                                teacherWithHighestGrades = teacher;
                                highestGrade = student.getHighestGrade();
                            }
                        }
                    }
                }
            }
        }
        return teacherWithHighestGrades;

    }

    public static void main(String []args){
        List<Person> people = new ArrayList<>();

        Student student1 = new Student("Ivan","Male",1001,"Class a",1);
        student1.addGrade("Math",4.00);
        student1.addGrade("Math",5.70);
        student1.addGrade("Science",3.60);
        student1.addGrade("Science",2.00);

        Student student2 = new Student("Ivanka","Female",1002,"Class b",2);
        student2.addGrade("Math",3.80);
        student2.addGrade("Math",4.00);
        student2.addGrade("Science",5.40);
        student2.addGrade("Science",6.00);

        List<String> subjectTeacher1 = new ArrayList<>();
        subjectTeacher1.add("Science");
        Teacher teacher1 = new Teacher("Sergei", "Male", 2001,subjectTeacher1, 4700.0,"PGEE");

        List<String> subjectTeacher2 = new ArrayList<>();
        subjectTeacher2.add("Math");
        Teacher teacher2 = new Teacher("Hristina", "Female", 2002, subjectTeacher2, 4500.0,"PGEE");

        people.add(student1);
        people.add(student2);
        people.add(teacher1);
        people.add(teacher2);

        printPersonInformation(people);

        System.out.println("-----------------Statistics of the people-----------------");

        String subject = "Science";
        Student studentWithHighestGrade = findStudentWithHighestGrade(people, subject);
        if (studentWithHighestGrade != null) {
            System.out.println("Student with the highest grade in " + subject + ": " + studentWithHighestGrade.getName());
        } else {
            System.out.println("No student found with grades in " + subject);
        }

        String subject2 = "Math";
        Student studentWithLowestGrade = findStudentWithLowestGrade(people, subject2);

        if (studentWithLowestGrade != null) {
            System.out.println("Student with the lowest grade in " + subject2 + ": " + studentWithLowestGrade.getName());
        } else {
            System.out.println("No student found with grades in " + subject2);
        }

        double averageSalary = calculateAverageSalary(people);
        System.out.println("Average Salary:" + averageSalary);

        double averageGrade = student1.getAverageGrade();
        System.out.println("Average Grade of " + student1.getName() + ":" + averageGrade);

        double averageGrade1 = student2.getAverageGrade();
        System.out.println("Average Grade of " + student2.getName() + ":" + averageGrade1);

        double averageClassGrade = calculateAverageClassGrade(people);
        System.out.println("Average Grade of the whole Class:" + averageClassGrade);

        System.out.println("Subject with the highest grade for " + student1.getName() + ":" + student1.getHighestGradeSubject());
        System.out.println("Subject with the highest grade for " + student2.getName() + ":" + student2.getHighestGradeSubject());


        Teacher teacherWithHighestGrades = teacherWithHighestGrades(people);
        if (teacherWithHighestGrades != null) {
            System.out.println("Teacher signing the highest grades:" + teacherWithHighestGrades.getName());
        } else {
            System.out.println("No teacher found with signed grades");
        }

    }
}