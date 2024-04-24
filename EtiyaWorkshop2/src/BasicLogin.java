import java.util.ArrayList;
import java.util.Scanner;

public class BasicLogin {
    public static void main(String[] args) {
        //Kullanıcının username, email, firstname, lastname ve password
        // bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.
        ArrayList<String[]> users = new ArrayList<>();

        users.add(new String[]{"user1","abc@gmail.com","emre","koca","pass123"});
        users.add(new String[]{"user2","xyz@gmail.com","talha","yıl","password123"});

        Scanner scanner= new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        for(String[] user: users){
            if(user[0].equals(username) && user[4].equals(password)){
                System.out.println("Giriş Başarılı !");
                break;
            }else
                System.out.println("ID veya Şifre Yanlış !");
                break;
        }
    }
}
