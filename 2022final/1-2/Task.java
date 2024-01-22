public class Task {
    protected final int id;
    protected final String title;
    protected final String description;
    private static int count = 1;

    public Task(String title, String description){
        this.id = count++;
        this.title = title;
        this.description = description;
    }

    public String describe(){
        return String.format("[%s] %s: %s", id, title, description);
    }
}
