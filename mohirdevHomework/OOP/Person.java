package mohirdevHomework.OOP;

import java.text.DateFormat;

public class Person {

    private String firstname;
    private String lastname;
    private Integer age;
    private DateFormat birthday;
    private String email;

    @Override
    public String toString() {
        return String.format(
                "Ismi: %s Familyasi: %d Yoshi: %f Tug`ilgan sana: %s  E-pochtas: %s",
                firstname, firstname, age, birthday, email
        );
    }
}
