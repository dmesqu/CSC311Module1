public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "yellow", 7, "diesel");
        Car c1 = new Car(v1, "Volkswagen");
        c1.honk();
        c1.displayInfo();
    }
}