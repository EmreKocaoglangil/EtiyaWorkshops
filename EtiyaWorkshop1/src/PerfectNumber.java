import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int totalNumber = 0;
        System.out.println("Lütfen işlem yapmak istediğiniz sayıyı giriniz.");
        Scanner scanner = new Scanner(System.in);
        int perfectNumber = scanner.nextInt();
        for(int n = 1; n < perfectNumber ; n++) {
            if ((perfectNumber % n) == 0) {
                totalNumber += n;
            }
        }
        if (perfectNumber == totalNumber)
            System.out.println(perfectNumber+" Mükemmel sayıdır.");
        else
            System.out.println(perfectNumber+" Mükemmel sayı değildir.");
    }
    }

