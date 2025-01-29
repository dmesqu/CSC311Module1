public class Car extends Vehicle {

    private String brand;

    public Car(Vehicle v1, String brand){
        super(v1.getNumberOfWheels(), v1.getColor(), v1.getEngineSize(), v1.getFuelType());
        this.brand=brand;
    }

    public void honk(){
        System.out.println("honk honk");
    }

    public void displayInfo(){
        System.out.println("Number of Wheels: " + super.getNumberOfWheels());
        System.out.println("Color: " + super.getColor());
        System.out.println("Engine Size: " + super.getEngineSize());
        System.out.println("Fuel Type: " + super.getFuelType());
        System.out.println("Brand: " + this.brand);
    }


}
