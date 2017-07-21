/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge013;

/**
 * クラスの作成
 * @author MAZHENHUA
 * 課題：
 * 以下の機能を持つクラスを作成してください。
 *1. パブリックな２つの変数と、２つの変数に値を設定するパブリックなメソッドと、
 *２つの変数の中身をprintするパブリックなメソッド
 */
public class Challenge01301 {
    class student{
        public String name;
        public int age;
        
        public void setstudent(){
            this.name="田中";
            this.age=28;
            System.out.print(name);
            System.out.print(age);
        }
        
    }
    
}
