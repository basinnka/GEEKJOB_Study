/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge013;

/**
 * クラスの継承
 * @author MAZHENHUA
 * 課題「クラスの作成」で作成したクラスを継承し、以下の機能を持つクラスを作成してください。
 * 1. ２つの変数の中身をクリアするパブリックなメソッド
 */
public class Challenge01302 {
    class student{
        public String name;
        public int age;
        
        public void setstudent(){
            this.name="田中";
            this.age=28;
            System.out.print(name+age);
        }   
    }
    class syougakusei extends student{
        public void clear(){
            this.name="";
            this.age=0;
            
        }
    }
}
