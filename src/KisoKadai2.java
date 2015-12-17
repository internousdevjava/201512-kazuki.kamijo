import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author user
 *
 */
public class KisoKadai2{

 /**
  * @param args
  * @return
  */

 public static void main(String[] args) {
  BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
  boolean b = true;
  System.out.println("□■数当てゲーム■□");
  System.out.println("1から100までの答えの数字を当てるゲームです");
  System.out.println("");
  System.out.println("数字を入力してください");
  while (b) {
   int i = (int)(Math.random() * 100) + 1;
   try {
    while (b) {
     try {
      String s = r.readLine();
      int ans = Integer.parseInt(s);
      if ( ans >= 101) {
       System.err.println("数字の範囲は1から100までです");continue;
      }
      int in = ans - i;
      if (in < 0) {
        System.out.println("正解はこの数字より大きいです");
       }
       else if (in > 0) {
        System.out.println("正解はこの数字より小さいです");
       }
       else {
       System.out.println("正解!!");
       break;
      }
     } catch (IOException e) {
      System.out.println(e);
     } catch (NumberFormatException e) {
      System.err.println("数字で入力してください");
     }
    }
    System.out.println("ゲームを続けますか？");
    System.out.println("y.続ける\tそれ以外:終わる");
    String s = r.readLine();
    if (s.equals("y")) {
     continue;
    } else {
     b = false;
    }
   } catch (IOException e) {
    System.out.println(e);
   }
  }
  System.out.println("お疲れ様でした");
 }
}



