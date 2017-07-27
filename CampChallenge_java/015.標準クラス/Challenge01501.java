/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.util.Date;
import java.util.Calendar;

/**
 * タイムスタンプの作成
 * @author MAZHENHUA
 * 課題；2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
 */
public class Challenge01501 {
    public static void main (String [] args){
        Calendar c =Calendar.getInstance();
        c.set(2016,0,1,00,00,00);
        Date a =c.getTime();
        
        System.out.println(a);
        
        /**
        * // カレンダーで特定の日付を作成1
        * // 今回は、2017/1/1
        * Calendar c1 = Calendar.getInstance();
        * c.set(2017, 0, 1);
        *
        * // カレンダーからタイムスタンプ(Long)を取得し、Dateに適用
        * // これにより、Dateの内部は2017/1/1に
        * Date d = new Date(c1.getTimeInMillis());
        *
        * System.out.print(d);
        */
    }
}
