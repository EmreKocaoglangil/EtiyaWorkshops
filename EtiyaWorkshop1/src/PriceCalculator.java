import java.util.Scanner;
public class PriceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç ürün almak istersiniz ?");
        int urunSayisi = scanner.nextInt();

        int temp = 0;
        for(int i = 1; i<= urunSayisi; i++){
            System.out.println(i+".ürünün fiyatı nedir ?");
            int urunFiyati = scanner.nextInt();
            temp+=urunFiyati;
        }
        System.out.println("Toplam alisveris tutari "+ temp +" TL");
    }
}
