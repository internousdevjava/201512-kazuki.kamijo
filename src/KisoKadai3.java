import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KisoKadai3{
	public static void main(String[] args) {

		while(true){
			System.out.println("場所を指定ください。指定がない場合、新規作成されます。");
			System.out.println("例→C:\\eclipse\\pleiades\\workspace\\KisoKadai\\out.txt");
			System.out.print("ここから入力できます:");
			try{
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	    	String str=br.readLine();
			File file=new File(str);

			if(file.exists()){

				if(file.isFile() && file.canRead()){
					System.out.println(" 1.追記か書き込み 2.読み取った内容を出力 3.終了");
			    	System.out.println("番号を入力してください");

			    	BufferedReader br1=new BufferedReader (new InputStreamReader(System.in));
			    	String str1=br1.readLine();
			    	int i=Integer.parseInt(str1);

			    	switch(i) {
			    	case 1:
			    		System.out.println("追記をします");
                         try{
                        	 boolean mode = false;
                        	 System.out.println("モード設定。1.追記 2.上書き 3.終了");
                        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
         				String str5 = br5.readLine();
         				switch (str5) {
         				case "1":mode=true;
         				 break;
         				case "2":mode=false;
         				 default:
         				 break;
         				 case "3":System.out.println("プログラムを終了します");
			    			System.exit(0);
         				}
         				FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
    					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
    					BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
    					String str6 = br6.readLine();
    					pw.println(str6);
    					pw.close();
    					System.out.println("出力が完了しました。");
                         }
                         catch (IOException ex) {
         					ex.printStackTrace();
         				}break;

			    	case 2:System.out.println("読み取った内容を出力します");
			    		try{
			    			BufferedReader br8 = new BufferedReader(new FileReader(file));
			    			String str8;
			    		      while((str8 = br8.readLine()) !=null){
			    		        System.out.print(str8);
			    		      }
			    		      br8.close();
			    		    }catch(FileNotFoundException e){
			    		      System.out.println(e);
			    		    }catch(IOException e){
			    		      System.out.println(e);
			    		    }break;
			    	case 3:System.out.println("プログラムを終了します");
			    			System.exit(0);
			    	}
				}

			}else {

					System.out.println("1.フォルダ作成 2.テキスト作成 3.終了");
			    	System.out.println("番号を入力してください");

			    	BufferedReader br1=new BufferedReader (new InputStreamReader(System.in));
			    	String str1=br1.readLine();
			    	int i=Integer.parseInt(str1);

			    	switch(i) {
			    	case 1:
			    		System.out.println("フォルダ新規作成");

			    		BufferedReader br3=new BufferedReader (new InputStreamReader(System.in));
                        String f2=br3.readLine();
                        File f = new File(f2);

                        if (!f.exists()) {
                            f.mkdirs();
                            System.out.println("フォルダを作成しました。");
                        }break;
			    	case 2:
			    		System.out.println("テキスト新規作成");
		            String filename = br.readLine();

		            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

		            try {
		                System.out.println("内容を入力 (ドットのみの行で終了):");

		                while (true) {

		                    String line = br.readLine();

		                    if (line.equals(".")) {

		                        break;
		                    }
		                    writer.write(line);
		                    writer.newLine();
		                }

		                System.out.println(filename + "に書き出しました。");
		            }
		            finally {
		                writer.close();

		            }break;

			    	case 3:
			    		System.out.println("プログラムを終了します");
			    		System.exit(0);
			    	}
				}
			}catch (IOException e){}
		}
		}
	}