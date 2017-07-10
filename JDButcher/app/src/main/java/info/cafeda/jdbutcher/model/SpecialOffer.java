package info.cafeda.jdbutcher.model;

/**
 * Created by Vu Nguyen on 7/10/2017.
 */

public class SpecialOffer {
    private String text;
    private double minimumAmount;
    private double price;

    public double getMinimumAmount() {
        return minimumAmount;
    }

    public double getPrice() {
        return price;
    }

    public String getText() {
        return text;
    }
}
