package homework_16.model;

public class Student {

    private int id;
    private  String firstName;
    private  String lastName;
    private int yearOfBirth;
    private String specialization;

    //constructor

    public Student(int id, String firstName, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //method to display student information
    public  String displayStudents(){
        return String.format("ID: %d, first name: %s, last name: %s, year of birth: %d, specialization: %s",id,
                firstName, lastName, yearOfBirth, specialization);
    }

    public void study(){
        System.out.println(lastName +" "+ firstName+ " studies " +specialization);
    }

    public void tookVacation(){
        System.out.println(firstName+ " "+ lastName+ " took a vacation");
    }

    public void passedExam(){
        System.out.println(firstName +" "+ lastName +" passed the exam");
    }

}
