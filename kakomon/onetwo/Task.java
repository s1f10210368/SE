package onetwo;

public class Task {
    protected final int id;  // final をつけると変更ができなくなる
    protected final String title;  // protected をつけるとパッケージ内の他クラスやそのクラスを継承したサブクラスからアクセスすることができる
    protected final String description;
    private static int count = 1;

    public Task(String title, String description){  // どのクラスからもアクセスできる = public
        this.id = count++;
        this.title = title;
        this.description = description;
    }

    public String describe(){
        return String.format("[%s] %s: %s", id, title, description);
    }
}
