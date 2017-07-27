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
 * 現在の日時の表示
 * @author MAZHENHUA
 * 課題：現在の日時を「年-月-日 時:分:秒」で表示してください。
 */
public class Challenge01502 {
    public static void main(String []args){
        Date now =new Date();
        
        /*Calendar td=Calendar.getInstance();
         *System.out.print(td.get(Calendar.YEAR)+"-"+td.get(Calendar.MONTH)+"-"+
         *td.get(Calendar.DAY_OF_MONTH)+" "+td.get(Calendar.HOUR_OF_DAY)+":"+
         *td.get(Calendar.MINUTE)+":"+td.get(Calendar.SECOND));
         */
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(sdf.format(now));
    }
    
}
