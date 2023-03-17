import java.math.BigDecimal;


public class Car {

    private String model, brand, color;
    private int quantiy, year;
    private BigDecimal price;

    public Car(String model, String brand, String color, int quantiy, int year, BigDecimal price) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.quantiy = quantiy;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void deliveryTo(Car otherCar, int numCar) {
        if (numCar <= 0) return;

        otherCar.setQuantiy(
            otherCar.getQuantiy() + numCar
        );
        quantiy -= numCar;
        System.out.println("Delivered "+numCar);
        System.out.println(toString());
    }
    public void sell(int numCar){
        quantiy -= numCar;
        BigDecimal sellPrice = price.multiply(new BigDecimal(numCar));
        System.out.println("Sold "+numCar+" cars ->" +sellPrice.toString());
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Car [model=" + model + ", brand=" + brand + ", color=" + color + ", quantiy=" + quantiy + ", year="
                + year + ", price=" + price + "]";
    }
    

}
