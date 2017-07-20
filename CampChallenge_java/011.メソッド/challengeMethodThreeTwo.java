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
import java.util.HashMap;

/**
 *
 * @author MAZHENHUA
 */
public class challengeMethodThreeTwo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*課題:
     *1. 戻り値として、人物のID、名前、生年月日、住所を配列にして返却するメソッドを作成してください。
     *2. 作成したメソッドを呼び出し、戻り値のID以外を表示してください。
     */
    
    //配列を作成
    /*
    String Id1(String id1,String name1,String date1,String address1){
        return "ID:"+id1+"名前:"+name1+"生年月日:"+date1+"住所:"+address1;   
    }
    String Id2(String id2,String name2,String date2,String address2){
        return "ID:"+id2+"名前:"+name2+"生年月日:"+date2+"住所:"+address2;   
    }
    String Id3(String id3,String name3,String date3,String address3){
        return "ID:"+id3+"名前:"+name3+"生年月日:"+date3+"住所:"+address3;   
    }
    */
    
    String [] Profile1 ={"ID1","NAME1","DATE1","ADDRESS1"};
    int user1 (PrintWriter pw){
        pw.print("ID:"+Profile1[0]+"<br>");
        pw.print("名前:"+Profile1[1]+"<br>");
        pw.print("生年月日:"+Profile1[2]+"<br>");
        pw.print("住所:"+Profile1[3]+"<br>");
        return 1;
    }
     String [] Profile2 ={"ID2","NAME2","DATE2","ADDRESS2"};
    int user2 (PrintWriter pw){
        pw.print("ID:"+Profile2[0]+"<br>");
        pw.print("名前:"+Profile2[1]+"<br>");
        pw.print("生年月日:"+Profile2[2]+"<br>");
        pw.print("住所:"+Profile2[3]+"<br>");
        return 2;
    }
     String [] Profile3 ={"ID3","NAME3","DATE3","ADDRESS3"};
    int user3 (PrintWriter pw){
        pw.println("ID:"+Profile3[0]+"<br>");
        pw.println("名前:"+Profile3[1]+"<br>");
        pw.println("生年月日:"+Profile3[2]+"<br>");
        pw.println("住所:"+Profile3[3]+"<br>");
        return 3;
    }
    
    
        
        
   
   
   
   
   
   
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int User=3;
        switch (User){
            case 1:
                user1(out);
                break;
            case 2:
                user2(out);
                break;
            case 3:
                user3(out);
                break;
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
