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
    String[] peopleprof(int id){
    
        
        String p[]=new String[4];
        switch(id){
        case 1:
            String[] pf1={"1","田中","1994-04-13","東京都江戸川区平井1-39-5"};
            p=pf1;
            break;
            case 2:
            String[] pf2={"2","藤本","1988-11-19","東京都江戸川区小岩2-19-8"};
            p=pf2;
            break;
        case 3:
            String[] pf3={"3","木村","1992-07-22","東京都江戸川区亀戸1-9-3"};
            p=pf3;
            break;
        }
        return p;
    }
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("名前:"+peopleprof(1)[1]+"<br>"+"生年月日:"+peopleprof(1)[2]+"<br>"+"住所:"+peopleprof(1)[3]+"<br>");
        out.print("名前:"+peopleprof(2)[1]+"<br>"+"生年月日:"+peopleprof(2)[2]+"<br>"+"住所:"+peopleprof(2)[3]+"<br>");
        out.print("名前:"+peopleprof(3)[1]+"<br>"+"生年月日:"+peopleprof(3)[2]+"<br>"+"住所:"+peopleprof(3)[3]+"<br>");
        
            
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