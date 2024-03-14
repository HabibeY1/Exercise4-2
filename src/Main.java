class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void sell(int quantityToSell) {
        if (quantityToSell <= this.quantity) {
            this.quantity -= quantityToSell;
        } else {
            System.out.println("there is no more to sell");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car car = new Car("Range Rover Sport ", "Range Rover", 2024, 120000, "Red", 18);


        System.out.println("Initial state:");
        System.out.println(car);


        car.sell(6);
        System.out.println("\nAfter selling 6 cars:");
        System.out.println(car);


        car.setColor("Red");
        car.setPrice(125000);
        car.delivery(8);


        System.out.println("\nFinal state after changes:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());


    }

    }