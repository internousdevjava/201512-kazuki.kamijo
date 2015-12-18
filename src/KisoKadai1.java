
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai1{
 public static void main(String[] args) {
  System.out.println("九九表");
  System.out.println("数字の範囲は1～100までです");
  while(true){
    try{
     System.out.println("xの数字を入力してください");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str1=br.readLine();
   int i=Integer.parseInt(str1);
     System.out.println("yの数字を入力してください");
   String str2=br.readLine();
   int i2=Integer.parseInt(str2);

   int max= 100;
   int x = i;
   int y = i2;

     if(x <=max){
      if(y <=max){
       if(x*y!=0){
        for(int a=1; a<=x; a++){
         for(int b=1; b<=y; b++){
        System.out.print(a*b +" ");
       }
         System.out.println("");
       }
     }else{
      System.out.println("0は入力できません");
     }
     }else{
      System.out.println(max + "以上は入力できません");
     }
     }else{
      System.out.println(max + "以上は入力できません");
     }
      while(true){
       try{
        System.out.println("1.続ける 2.終了");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
         String str3=br1.readLine();
         int i3=Integer.parseInt(str3);
         if(i3==2){
         System.out.println("九九表を終了します");
         System.exit(0);
         }else if(i3==1){
          break;
         }else{
          System.out.println("1か2を入力してください");
         }
         }catch(IOException e){
       }catch(NumberFormatException e){
        System.out.println("数字で入力してください");
       }
      }


    }catch(IOException e){
     }catch(NumberFormatException e){
      System.out.println("数字で入力してください");
     }
    }
  }
 }