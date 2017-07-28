/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.io.*;


/**
 * ファイルの書き出しと保存
 * @author MAZHENHUA
 * 課題：ファイルに自己紹介を書き出し、保存してください。
 */
public class Challenge01508 {
    public static void main(String []args) throws IOException{
        //ファイルオープン
        File zs =new File("test.txt");
        //FileWriterを作成
        FileWriter fw;
        fw= new FileWriter(zs);
        //書き込み
        fw.write("自己紹介");
        
        //クローズ
        fw.close();
    }
    
}
