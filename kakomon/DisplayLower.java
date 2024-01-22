/*
 * 以下の要件を満たすpublicなクラス DisplayLower を宣言しなさい。

    実行すると、標準入力からの入力を受付け、入力された文字列を小文字にして表示する。
    空文字列がされると、終了する。
 */

import java.util.Scanner;
// Scannerを用いてユーザーからの入力を受け付ける

public class DisplayLower {
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      for (;;){
         String str = scanner.nextLine();
         if(str.length() == 0){
            break;
         }
         System.out.println(str.toLowerCase());
      }
      scanner.close();
   }
}