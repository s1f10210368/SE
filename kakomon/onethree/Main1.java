package onethree;

public class Main1 {
    public static void main(String[] args) {
        Queue.getInstance().enqueue("INIAD");
        Queue.getInstance().enqueue("TOYO");
        Queue.getInstance().enqueue("University");
        System.out.println(Queue.getInstance().getSize());
        System.out.println(Queue.getInstance().dequeue());
        System.out.println(Queue.getInstance().dequeue());
        System.out.println(Queue.getInstance().dequeue());
        System.out.println(Queue.getInstance().getSize());
    }
}
