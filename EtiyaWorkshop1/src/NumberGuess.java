import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random= new Random();
        int randomNumber = random.nextInt(10)+1;
        int guess = 0;
        System.out.println(randomNumber);
        while(randomNumber != guess){
            System.out.println("1 ile 10 arasında sayı tahmin ediniz");
            guess = scanner.nextInt();
        }
        System.out.println("Doğru Sayıyı Buldunuz !"+"Secilen Sayi"+randomNumber);
        scanner.close();
    }
}
