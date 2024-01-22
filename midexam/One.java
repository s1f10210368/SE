package midexam;

public class One {
    public static void main(String args[]){
        int result = 0;
        if (args.length > 0){
            for (String s : args) {
                int x = Integer.parseInt(s);
                result += x * x * x;
            }
            System.out.println(result);
        } else {
            System.out.println("please input numbers");
        }
    }
}
