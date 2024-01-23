package onetwo;

public class Task {
    // ここから４行がフィールド
    protected final int id;  // final をつけると変更ができなくなる
    protected final String title;  // protected をつけるとパッケージ内の他クラスやそのクラスを継承したサブクラスからアクセスすることができる
    protected final String description;
    private static int count = 1;

    // ここから４ぎょうがコンストラクタ
    public Task(String title, String description){  // どのクラスからもアクセスできる = public
        this.id = count++;
        this.title = title;
        this.description = description;
    }

    // ここがメソッド
    public String describe(){
        return String.format("[%s] %s: %s", id, title, description);
    }
}
