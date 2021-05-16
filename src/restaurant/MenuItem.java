package restaurant;
import java.time.LocalDateTime;

public class MenuItem {
    private double price;
    private String category;
    private String lastUpdated;

    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setCategory(String inputCategory) {this.category = inputCategory;}
    public void setPrice(double inputPrice) {
        this.price = inputPrice;
    }
    public void setLastUpdated(String inputDate) {this.lastUpdated = inputDate;}
}

