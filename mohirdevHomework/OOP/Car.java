package mohirdevHomework.OOP;

public class Car {

    private String color;
    private String model;
    private Integer price;
    private Boolean automatic;
    private Boolean mexanic;

    @Override
    public String toString() {
        return String.format(
                "Mashina rangi: %s modeli: %d narxi: %f avtomatmi?: %s  mexanikmi?: %s",
                color, model, price, automatic, mexanic
                );
    }
}
