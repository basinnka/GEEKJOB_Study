/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author MAZHENHUA
 */
public class ResultData implements Serializable {
    private Date d;
    private String luck;
    
    public ResultData (){}
    
    //return the d  変数dを返す
    public Date getD(){
        return d;
    }
    //param d the d to set　　変数dを設定する　
    public void setD(Date d){
        this.d=d;
    }
    //return the luck
    public String getLuck(){
        return luck;
    }
    //param luck the luck to set
    public void setLuck(String luck){
        this.luck=luck;
    }
}
