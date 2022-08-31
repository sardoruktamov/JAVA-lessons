package fileLesson;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private String birthDay;

    public Student(String firstName, String lastName, Integer age, String birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
