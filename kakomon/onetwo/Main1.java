package onetwo;
public class Main1 {
    public static void main(String args[]) {
        Task t1 = new Task("Task A", "Task detail A.");
        Task t2 = new Task("Task B", "Task detail B.");
        System.out.println(t1.describe());
        System.out.println(t2.describe());
    }
}
