package training.day5;

public class Person {
    private String name;
    private String gender;
    private int ID;

    public Person(String name, String gender, int ID) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
