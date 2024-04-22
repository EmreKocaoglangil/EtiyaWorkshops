public class DoWhile {
    public static void main(String[] args) {

        //Bu örnekte, döngü bloğu en az bir kez çalıştırılır ve ardından koşul
        // kontrol edilir. Eğer koşul sağlanıyorsa döngü devam eder.
        int i = 1;
        do {
            System.out.println("i'nin değeri: " + i);
            i++;
        } while (i <= 5);
        //Bu örnekte, koşul döngü bloğunun başında kontrol edilir.
        // Eğer koşul sağlanıyorsa döngü çalışır, aksi halde çalışmaz.
        int k = 1;
        while (k <= 5) {
            System.out.println("k'nin değeri: " + k);
            k++;
        }
    }
}
