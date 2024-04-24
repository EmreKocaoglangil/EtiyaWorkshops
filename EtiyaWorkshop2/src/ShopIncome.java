public class ShopIncome {
    public static void main(String[] args) {
       // Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak
       // tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.
        String [] urunler = {"Telefon","Bilgisayar","Tablet","Televizyon"};
        double [] fiyatlar = {30000, 40000, 10000, 20000};
        int [] satismiktari = {5,15,8,10};
        double satisgeliri = 0;
        for(int i = 0; i< urunler.length; i++){
            double gelir = satismiktari[i]*fiyatlar[i];
            satisgeliri+=gelir;
            System.out.println(urunler[i] + " " + satismiktari[i]+" kez satıldı ve "+gelir+ " gelir elde edildi.");

        }
        System.out.println("Toplam Satış Geliri: "+satisgeliri);
    }
}