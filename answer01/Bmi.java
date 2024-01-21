public class Bmi {
    public static void printRisk(int age, double h, double w) {
        double bmi = w / ((h / 100) * (h / 100));
        System.out.printf("Your BMI: %f\n", bmi);

        if(age < 45) {
            if(bmi < 22) {
                System.out.println("Your risk: Low");
            } else {
                System.out.println("Your risk: Medium");
            }
        } else {
            if(bmi < 22) {
                System.out.println("Your risk: Medium");
            } else {
                System.out.println("Your risk: High");
            }
        }
    }

    public static void main(String[] args) {
        int age = 30;
        double h = 170.0;
        double w = 70.0;

        printRisk(age, h, w);
    }
}

