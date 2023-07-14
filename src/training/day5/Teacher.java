package training.day5;

import java.util.List;

public class Teacher extends Person{

        private List<String> subjects;

        private double salary;

        private String school;

        public Teacher(String name, String gender, int ID, List<String> subjects, double salary,String school) {
            super(name, gender, ID);
            this.subjects = subjects;
            this.salary = salary;
            this.school = school;
        }

        public String getSubject(){
            return subjects.toString();
        }

        public String getSchool(){
            return school;
        }

        public List<String> getSubjects() {
            return subjects;
        }

        public void setSubjects(List<String> subjects) {
            this.subjects = subjects;

        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;

        }

        @Override
        public String getName() {
            if (getGender().equals("Male")) {
                return "Mr." + super.getName();
            } else if (getGender().equals("Female")) {
                return "Ms." + super.getName();
            }
            return super.getName();

        }
}

