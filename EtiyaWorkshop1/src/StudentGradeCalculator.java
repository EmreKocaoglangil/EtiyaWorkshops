import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Öğrenci sayısını giriniz:");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine(); // Önceki nextInt() çağrısından gelen new line karakterini tüketmek için

        for(int i = 0; i < ogrenciSayisi; i++){
            System.out.println("Lütfen " + (i + 1) + ". öğrencinin adını ve soyadını giriniz:");
            String isimSoyisim = scanner.nextLine();
            int toplamNot = 0;
            for (int k = 1; k <= 3; k++) {
                System.out.println("Lütfen " + k + ". sınav sonucunuzu giriniz:");
                int grade = scanner.nextInt();
                toplamNot += grade;
            }
            double ortalama = (double) toplamNot / 3;
            System.out.println("Öğrenci " + isimSoyisim + ", Not Ortalaması: " + ortalama);
            if (i < ogrenciSayisi - 1) {
                scanner.nextLine(); // Sıradaki öğrenciye geçmek için kullanılan new line karakterini tüketmek için
            }
        }

        scanner.close();
    }
}
