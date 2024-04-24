import java.util.ArrayList;

public class Task {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String taskName) {
        tasks.add(taskName);
    }

    public static void updateTask(String taskName, boolean completed) {
        int index = tasks.indexOf(taskName);
        if (index != -1) {

            String task = tasks.get(index);
            if (completed) {
                task += " [x]"; // Görev tamamlandı işareti
                tasks.set(index, task);
            } else {
                task = task.replace(" [x]", ""); // Görev tamamlandı işareti kaldırılıyor
                tasks.set(index, task);
            }
            System.out.println("Task updated: " + task);
        } else {
            System.out.println("Task not found: " + taskName);
        }
    }

    public static void removeCompletedTasks() {
        ArrayList<String> incompleteTasks = new ArrayList<>();
        for (String task : tasks) {
            // Tamamlanmamış görevleri yeni bir liste olarak saklıyoruz
            if (!task.endsWith("[x]")) {
                incompleteTasks.add(task);
            }
        }
        tasks = incompleteTasks;
    }

    public static void printTasks() {
        for (String task : tasks) {
            System.out.println("Task: " + task);
        }
    }

    public static void main(String[] args) {
        // Örnek görevler ekleyelim
        addTask("Alışveriş yap");
        addTask("Raporu hazırla");
        addTask("Spor yap");

        // Görevlerin tamamlandığını işaretleyelim
        updateTask("Alışveriş yap", true);
        updateTask("Spor yap", true);

        // Tamamlanan görevleri kaldıralım
        removeCompletedTasks();

        // Güncel görev listesini yazdıralım
        printTasks();
    }
}