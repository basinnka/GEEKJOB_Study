/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge011;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MAZHENHUA
 */
/*
 *課題「ユーザー定義メソッドの作成」で定義したメソッドを拡張します。
 *メソッドへ戻り値を追加し、　true(boolean)　を返却するように修正してください。
 *また、メソッドの呼び出し側で戻り値を評価し、trueなら「この処理は正しく実行できました」、
 *そうでないなら「正しく実行できませんでした」と表示してください。
 */




public class challengeMethodThreeOne extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //自己紹介を表示のメソッド
        boolean MyProfile(PrintWriter pw){
                pw.print("私の名前は馬振華です。<br>");
                pw.print("生年月日：19890311<br>");
                pw.print("好きな音楽は民謡です。趣味は卓球をすることです。<br><br>");
                return true;
            }
        
        
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int i=0;
        while(i<10){
           //ユーザー定義メソッドの呼び出し
           MyProfile(out);
           i++;
        }
        boolean MyProfile =true;
        if(MyProfile){
            out.print("この処理は正しく実行できました");
        }else{
            out.print("正しく実行できませんでした");
        }    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
