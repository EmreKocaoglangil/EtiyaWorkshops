public class StringMethods {
    public static void main(String[] args) {
        //length(): Bir String'in karakter uzunluğunu döndürür.
        String str = "Merhaba";
        int uzunluk = str.length();
        System.out.println("String uzunluğu: " + uzunluk); // Çıktı: 7


        //charAt(int index): Belirtilen indeksteki karakteri döndürür.
        String str1 = "Merhaba";
        char karakter = str1.charAt(2);
        System.out.println("2. indeksteki karakter: " + karakter); // Çıktı: r


        //toUpperCase(): Tüm karakterleri büyük harfe dönüştürür.
        String str2 = "merhaba";
        String buyukHarfli = str2.toUpperCase();
        System.out.println("Büyük harfli hali: " + buyukHarfli); // Çıktı: MERHABA


        //toLowerCase(): Tüm karakterleri küçük harfe dönüştürür.
        String str3 = "MERHABA";
        String kucukHarfli = str3.toLowerCase();
        System.out.println("Küçük harfli hali: " + kucukHarfli); // Çıktı: merhaba


        //substring(int beginIndex, int endIndex): Belirtilen aralıktaki alt dizeyi döndürür.
        String str4 = "Merhaba Dünya";
        String altDize = str4.substring(4, 10);
        System.out.println("Alt dize: " + altDize); // Çıktı: aba Dü


        //indexOf(String str): Belirtilen alt dizenin ilk indeksini döndürür. Bulunamazsa -1 döndürür.
        String str5 = "Merhaba Dünya";
        int indeks = str5.indexOf("Dünya");
        System.out.println("Dünya'nın indeksi: " + indeks); // Çıktı: 8


        //replace(CharSequence target, CharSequence replacement): Belirtilen karakter dizilerini birbirleriyle değiştirir.
        String str6 = "Merhaba Dünya";
        String yeniStr = str6.replace("Dünya", "Java");
        System.out.println("Yeni string: " + yeniStr); // Çıktı: Merhaba Java
    }
}
