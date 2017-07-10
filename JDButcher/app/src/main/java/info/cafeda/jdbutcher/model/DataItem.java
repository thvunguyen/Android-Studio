package info.cafeda.jdbutcher.model;

/**
 * Created by Vu Nguyen on 7/10/2017.
 */

public class DataItem {
    private String itemID;
    private String itemName;
    private String category;
    private double price;
    private SpecialOffer special;

    public DataItem(String id, String name, String category, double price, SpecialOffer special) {
        this.itemID = id;
        this.itemName = name;
        this.category = category;
        this.price = price;
        this.special = special;
    }

    public void setSpecial(SpecialOffer special) {
        this.special = special;
    }

    public double getPrice(double amount) {
        if (special != null) {
            if (amount >= special.getMinimumAmount())
                return special.getPrice();
        }
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public SpecialOffer getSpecial() {
        return special;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
