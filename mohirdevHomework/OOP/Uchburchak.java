package mohirdevHomework.OOP;

public class Uchburchak {

    private Integer a_tomon;
    private Integer b_tomon;
    private Integer c_tomon;

    @Override
    public String toString() {
        return String.format(
                "a_tomon: %d b_tomon: %d c_tomon: %d ",
                a_tomon, b_tomon, c_tomon
        );
    }
}
