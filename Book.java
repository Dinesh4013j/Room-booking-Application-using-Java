package room;

public class Book {

    private String name;
    private int age;
    private String gender;
    private int acrooms;
    private int nonacrooms;


    public Book(String name, int age, String gender,int acrooms,int nonacrooms) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.acrooms=acrooms;
        this.nonacrooms=nonacrooms;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;

    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAcrooms() {
        return acrooms;

    }
    public void setAcrooms(int acrooms) {
        this.acrooms = acrooms;
    }
    public int getNonacrooms() {
        return nonacrooms;
    }
    public void setNonacrooms(int nonacrooms) {
        this.nonacrooms = nonacrooms;
    }


}
