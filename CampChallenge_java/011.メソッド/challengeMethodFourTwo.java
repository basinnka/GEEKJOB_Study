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
 * 引数、戻り値2
 * @author MAZHENHUA
 * 課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、
 * ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
 * この際、nullになっているデータはcontinueで飛ばしながら表示してください。
 */
public class challengeMethodFourTwo extends HttpServlet {

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
                 p[3]=null;
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
        for(int i=1;i<=3;i++){
            if(i==2){
                continue;
            }
        out.print("名前:"+peopleprof(i)[1]+"<br>"+"生年月日:"+peopleprof(i)[2]+"<br>"+"住所:"+peopleprof(i)[3]+"<br>");
        
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
