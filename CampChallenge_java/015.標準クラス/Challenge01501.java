/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.util.Date;

/**
 * タイムスタンプの作成
 * @author MAZHENHUA
 * 課題；2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
 */
public class Challenge01501 {
    public static void main (String [] args){
        Date td = new Date("2016/01/01 00:00:00");
        System.out.print(td);
        
    }
}
