/*
 * 以下の要件を満たす public なクラス Product を宣言しなさい。

インスタンスの固有IDを表す int 型のインスタンス・フィールド id をもつ。これは、インスタンスが生成される都度、1から順に連番で割り当てられる。
名称を表す String 型のインスタンス・フィールド name をもつ。
重量を表す double 型のインスタンス・フィールド weight をもつ。
コンストラクタ Product(String name, double weight) をもつ。引数の値は、対応するインスタンス・フィールドに設定される。
インスタンス・メソッド void print() は、実行例に示すような文字列を標準出力に表示する。
スタティック・メソッド int count() は、インスタンスの個数を返す。
このクラスで宣言された全てのフィールドは、他のクラスからアクセスすることができない。
このクラスで宣言された全てのインスタンスフィールドは、コンストラクタ以外で変更することはできない。
このクラスで宣言された全てのコンストラクタ、メソッドは、どのクラスからもアクセスすることができる。
 */

public class Product {
    private final int id;
    private final String name;
    private final double weight;
    private final int count = 1;

    public Product(String name, double weight){
        this.name = name;
        this.weight = weight;
        this.id = count;
        count += 1;
    }

    void print(){
        System.out.printf("No %d: %s (weight: %f)\n", id, name, weight);
    }

    int count(){
        return count - 1;
    }
}
