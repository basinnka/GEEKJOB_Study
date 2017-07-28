/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.io.*;


/**
 * ファイルから読み出しと表示
 * @author MAZHENHUA
 * 課題：ファイルから自己紹介を読み出し、表示してください。
 */
public class Challenge01509 {
    public static void main(String []args) throws IOException{
        //ファイルオープン
        File zs =new File("test.txt");
        //FileWriterを作成
        FileWriter fw;
        fw= new FileWriter(zs);
        //書き込み
        fw.write("自己紹介");
        //読み出す
        FileReader fr=new FileReader(zs);
        System.out.print(fr);
        //クローズ
        fw.close();
    }
    
}
