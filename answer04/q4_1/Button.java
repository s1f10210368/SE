public class Button {
    public final String label;
    private boolean pressed = false;
    private static int numPressed = 0;
    public Button(String label) {
       this.label = label;
    }
    public Button() {
        this("Untitled");
    }
    public void press() {
        if(! this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }
    public void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }
    public boolean isPressed() {
        return pressed;
    }
    public static int getNumPressed() {
        return numPressed;
    }
}