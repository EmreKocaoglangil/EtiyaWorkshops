package Interface;

public class CashPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Nakit ödeme yapıldı " + amount);
    }
}
