package onetwo;

public class Main3 {
    public static void main(String args[]) {
        TaskList tl = new TaskList();
        Task t1 = new Task("Task A", "Task detail A.");
        Bug b2 = new Bug("Bug B", "Bug detail B.");
        b2.close();
        tl.addTask(t1);
        tl.addTask(b2);
        tl.print();
    }
}