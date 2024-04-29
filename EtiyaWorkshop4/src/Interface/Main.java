package Interface;

public class Main {
    public static void main(String[] args) {

        PaymentMethod[] paymentMethods = new PaymentMethod[2];
        paymentMethods[0] = new CashPayment();
        paymentMethods[1] = new CreditCardPayment("1234 5678 9012 3456", "12/25", "123");

        double totalPrice = 100.0;


        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(totalPrice);
            System.out.println();
        }
    }
}