import java.util.Scanner;
interface PaymentGateway 
{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Credit card payment logic
    }
}
class PayPalPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    
    }
}
class UpiPayment implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) 
{
        System.out.println("Processing UPI payment of $" + amount);
       
    }
}

// Main class to test the payment gateway
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payment Processing System");
        
        // Select payment method
        System.out.println("Select payment method: 1. Credit Card 2. PayPal 3. UPI");
        int choice = scanner.nextInt();

        System.out.println("Enter the amount to be paid:");
        double amount = scanner.nextDouble();

        PaymentGateway payment;

        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;
            case 2:
                payment = new PayPalPayment();
                break;
            case 3:
                payment = new UpiPayment();
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
                scanner.close();
                return;
        }

        payment.processPayment(amount);
        System.out.println("Payment successful!");

        scanner.close();
    }
}

