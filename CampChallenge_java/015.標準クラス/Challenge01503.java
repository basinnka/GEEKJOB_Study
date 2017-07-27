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
 * 課題：2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。
 */
public class Challenge01503 {
    public static void main(String []args){
        Calendar c =Calendar.getInstance();
        c.set(2016,11,4,10,0,0);
        Date d =new Date(c.getTimeInMillis());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(sdf.format(d));
    }
    
}
