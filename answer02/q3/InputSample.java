import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sbuf = new StringBuffer();
        for(;;) {
            String str = scanner.nextLine();
            if(str.length() == 0) {
                break;
            }
            sbuf.append(str);
            sbuf.append('\n');
        }
        scanner.close();
        String result = sbuf.toString();
        System.out.printf(result);
    }
}
