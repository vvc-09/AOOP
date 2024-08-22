package ridesharing;

public class RideSharingApp {
    public static void main(String[] args) {
        // Singleton for User Authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticate("JohnDoe");

        // Factory Method for creating vehicles
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle("Car");
        car.drive();

        Vehicle bike = vehicleFactory.createVehicle("Bike");
        bike.drive();

        // Abstract Factory for creating payment methods
        PaymentFactory paymentFactory = new CreditCardPaymentFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment(50.0);
    }
}