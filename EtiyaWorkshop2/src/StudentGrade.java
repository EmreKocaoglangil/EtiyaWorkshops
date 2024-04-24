import java.util.ArrayList;

public class StudentGrade {
    public static void main(String[] args) {
       // Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli
        // not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.

        ArrayList<String[]> students = new ArrayList<>();
        students.add(new String[]{"Emre","Koca","80"});
        students.add(new String[]{"Fazıl","Yaban","30"});
        students.add(new String[]{"Alper","Göz","20"});
        students.add(new String[]{"Ecem","Demir","70"});
        students.add(new String[]{"Zafer","Kara","40"});
        ArrayList<String[]> studentsToRemove = new ArrayList<>();
        for(String[] student:students){
            int grade = Integer.parseInt(student[2]);
            if (grade < 50){
                studentsToRemove.add(student);

            }
        }
        students.removeAll(studentsToRemove);
        for(String[] student:studentsToRemove){
            System.out.println(student[0] +" " +student[1] +" isimli öğrenci "
                    +student[2]+" puan ile başarısız olmuştur.");
        }
    }
}
