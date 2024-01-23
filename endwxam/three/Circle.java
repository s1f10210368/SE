package endwxam.three;

import java.lang.Math;

public class Circle extends Shape {
    Circle(double size){
        super(size);
    }

    public double area(){
        return Math.PI * size * size;
    }

}

