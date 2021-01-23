package DataStructures.ComparatorAndComparator;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 9:57 AM
 **/

public class Laptop implements Comparable<Laptop> {


    String brand;
    int productId;
    int price;

    public Laptop(String brand, int productId, int price) {
        this.brand = brand;
        this.productId = productId;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Laptop laptop) {
        if (this.getPrice() > laptop.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
