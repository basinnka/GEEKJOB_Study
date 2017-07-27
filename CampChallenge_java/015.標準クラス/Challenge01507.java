/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge015;

/**
 * 文字の入れ替え
 * @author MAZHENHUA
 * 課題：以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
 */
public class Challenge01507 {
    public static void main(String []args){
        String a ="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String b =a.replace("I","い");
        System.out.println(b.replace("U","う"));
    }
    
}
