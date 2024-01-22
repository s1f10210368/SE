package onethreetwo;

public class Main2 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.addObserver(new MyObserver());
        q.enqueue("INIAD");
        q.enqueue("TOYO");
        q.enqueue("University");
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
