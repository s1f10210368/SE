package onetwo;

public class Main2 {
    public static void main(String args[]) {
        Bug b1 = new Bug("Bug A", "Bug detail A.");
        Bug b2 = new Bug("Bug B", "Bug detail B.");
        b1.close();
        System.out.println(b1.describe());
        System.out.println(b2.describe());
    }
}
