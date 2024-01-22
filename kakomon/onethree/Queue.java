package onethree;

public class Queue {
    private String array[] = new String[100];
    private int front = 0;
    private int rear = 0;
    // 以下の1行でロード時に一度だけ呼ばれるように変更
    private static final Queue instance = new Queue();
    
    // ここでコンストラクタ宣言
    private Queue(){
    }

    public static Queue getInstance() {
        return instance;
    }

    public int getSize() {
        return (rear - front + 100) % 100;
    }

    public void enqueue(String x) {
        if((rear + 1) % 100 == front) {
            return;
        }
        array[rear] = x;
        rear = (rear + 1) % 100;
    }

    public String dequeue() {
        if(rear == front) {
            return null;
        }
        String result = array[front];
        front = (front + 1) % 100;
        return result;
    }
}

/*
 * シングルトンへの変換
 * 1. インスタンスをprivateなスタティックフィールドとして宣言
 * 2. コンストラクタをprivate で宣言する
 * 3. インスタンスを取得するpublicなスタティックメソッドに変更
 * 
 * public class Queue {
    private String array[] = new String[100];
    private int front = 0;
    private int rear = 0;

    public Queue(){
    }

    public int getSize() {
        return (rear - front + 100) % 100;
    }

    public void enqueue(String x) {
        if((rear + 1) % 100 == front) {
            return;
        }
        array[rear] = x;
        rear = (rear + 1) % 100;
    }

    public String dequeue() {
        if(rear == front) {
            return null;
        }
        String result = array[front];
        front = (front + 1) % 100;
        return result;
    }
}

上記は変更前のもの
 */