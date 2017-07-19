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
 * 引数、戻り値1
 * @author MAZHENHUA
 * 課題：引数が１つのメソッドを作成してください。
 * メソッドの中の処理は、３人分のプロフィール（項目は戻り値2と同様）を作成し、
 * 引数として渡された値と同じIDを持つ人物のプロフィールを返却する様にしてください。
 * それ以降は課題「戻り値2」と同じ処理にしてください。
 */
public class challengeMethodFourOne extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    void peopleprofile(String id,String name,String date,String address,PrintWriter pw){
        pw.print(id+name+date+address);   
    }
    String id(String id){
        return "ID:"+id;   
    }
    String na(String name){
        return "名前:"+name;   
    }
    String da(String date){
        return "生年月日:"+date;   
    }
    String ad(String address){
        return "住所:"+address;   
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        peopleprofile(id("00001<br>"),na("田中 こころ<br>"),da("1990/01/01<br>"),ad("東京都江戸川区平井1-9-1<br><br>"),out);
        peopleprofile(id("00002<br>"),na("坂本　愛<br>"),da("1979/01/01<br>"),ad("東京都文京区水道橋1-13-4<br><br>"),out);
        peopleprofile(id("00003<br>"),na("後藤　太郎<br>"),da("1985/01/01<br>"),ad("東京都江東区上野2-23-1<br><br>"),out);
        
            
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
