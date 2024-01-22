package midexam.four;

/*
 * 燃費を表す double 型のスタティック・フィールド EFFICIENCY をもつ。このフィールドの値は 22.5（km/L）であり、変更することができない。このフィールドは、どのクラスからもアクセスすることができる。
メーカーを表す String 型のインスタンス・フィールド manufacturer をもつ。このフィールドは、コンストラクタ以外で変更することはできない。
燃料の量を表す double 型のインスタンス・フィールド fuel をもつ。
コンストラクタ Vehicle(String manufacturer, double fuel) をもつ。 引数の値は、対応するインスタンス・フィールドに設定される。
インスタンス・メソッド String getManufacturer() は、メーカー名を返す。
インスタンス・メソッド double getDistance() は、現在の燃料での走行可能距離を返す。走行可能距離は燃費と燃料の量から計算される。
全てのインスタンス・フィールドは、サブクラスからアクセスすることができる。
コンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */

public class Vehicle {
    public final double EFFICIENCY = 22.5;
    protected final String manufacturer;
    protected double fuel;

    public Vehicle(String manufacturer, double fuel){
        this.manufacturer = manufacturer;
        this.fuel = fuel;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getDistance(){
        return EFFICIENCY * fuel;
    }

}
