package Interface;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv){
        this.cardNumber = cardNumber;
        this.expiryDate =expiryDate;
        this.cvv = cvv;
    }
    public void pay(double amount){
        System.out.println("Kart Bilgileri \n" +"Kart Numarası: "+cardNumber +"\n"
        +"Bitis Tarihi: "+ expiryDate +"\n" + "CVV: "+ cvv +" olan kart ile "+ amount+
                " TL ödeme yapıldı.");
    }
}
