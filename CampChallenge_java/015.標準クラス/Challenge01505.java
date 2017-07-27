/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;

/**
 * バイト数と文字数の取得
 * @author MAZHENHUA
 * 課題：自分の氏名について、バイト数と文字数を取得して、表示してください。
 */
public class Challenge01505 {
    public static void main(String []args){
        String name="馬振華";
        System.out.println(name.getBytes().length);
        System.out.println(name.length());
    }
    
}
