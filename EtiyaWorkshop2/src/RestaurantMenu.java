public class RestaurantMenu {
    public static void main(String[] args) {
        //Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik
        // derecelendirmelerini bir dizi ile tutan algoritma yazınız.
        String[] yemekler = {"Et Köfte", "Makarna", "Tavuk Şiş", "Pilav", "Salata"};
        double[] fiyatlar = {25.0, 20.0, 30.0, 10.0, 8.0};
        int[] populerlik = {5, 4, 5, 3, 4};

        // Menüyü ekrana yazdıralım
        System.out.println("Restoran Menüsü:");
        for (int i = 0; i < yemekler.length; i++) {
            System.out.println(yemekler[i] + "  " + fiyatlar[i] + " TL   Popülerlik: " + populerlik[i]);
        }
    }
}
