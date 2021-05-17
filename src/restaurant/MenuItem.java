package restaurant;
import java.time.LocalDateTime;

public class MenuItem {
    private double price;
    private String category;
    private String lastUpdated;
    private String description;

    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public String getDescription() {
        return description;
    }

    public void setCategory(String inputCategory) {this.category = inputCategory;}
    public void setPrice(double inputPrice) {
        this.price = inputPrice;
    }
    public void setLastUpdated(String inputDate) {this.lastUpdated = inputDate;}
    public void setDescription(String inputDescription) {this.description = inputDescription;}
}

