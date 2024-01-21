package sample1;

import sample1.pkg1.Programmer;
import sample1.pkg2.EngineeringStudent;
import sample1.pkg2.EngineeringTeacher;

public class Main {
    public static void main(String[] args) {
        EngineeringStudent st = new EngineeringStudent("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        checkSkill(st);
        EngineeringTeacher t = new EngineeringTeacher("1000", "Inoue", "Professor");
        System.out.printf(t.getProfile());
        checkSkill(t);
    }

    private static void checkSkill(Programmer p) {
        if(p.canWritePython()) {
            System.out.println("I can write Python.");
        }
        if(p.canWriteC()) {
            System.out.println("I can write C.");
        }
        if(p.canWriteJava()) {
            System.out.println("I can write Java.");
        }
    }
}