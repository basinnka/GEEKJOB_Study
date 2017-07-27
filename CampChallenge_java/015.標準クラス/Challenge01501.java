/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.util.Calendar;

/**
 * タイムスタンプの作成
 * @author MAZHENHUA
 * 課題；2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
 */
public class Challenge01501 {
    public static void main (String [] args){
        Calendar c =Calendar.getInstance();
        c.set(2016,01,01,00,00,00);
        System.out.print(c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+
         c.get(Calendar.DAY_OF_MONTH)+" "+c.get(Calendar.HOUR_OF_DAY)+":"+
         c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        
    }
}
