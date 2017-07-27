/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * タイムスタンプの表示
 * @author MAZHENHUA
 * 課題：2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
 */
public class Challenge01504 {
    public static void main(String []args){
        Calendar c =Calendar.getInstance();
        c.set(2015,0,1,0,0,0);
        
        Calendar e =Calendar.getInstance();
        e.set(2015,11,31,23,59,59);
               
        long sa = e.getTimeInMillis()- c.getTimeInMillis();
        
        System.out.println(sa);
    }
    
}
