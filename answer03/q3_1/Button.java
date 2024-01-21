public class Button {
    String label;
    boolean pressed = false;
    static int numPressed = 0;
    Button(String label) {
       this.label = label;
    }
    Button() {
        this("Untitled");
    }
    void press() {
        if(! this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }
    void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }
}