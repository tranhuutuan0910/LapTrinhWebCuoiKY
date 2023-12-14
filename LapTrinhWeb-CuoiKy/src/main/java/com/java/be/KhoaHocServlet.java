package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class KhoaHocServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public KhoaHocServlet() {
        super();     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	     try {
	    	 KhoaHocdbContext khoaHocdbContext = new KhoaHocdbContext();
	    	 List<KhoaHoc> list = khoaHocdbContext.getAllKhoaHoc();
	    	 request.setAttribute("listKhoaHoc", list);
	    	 request.getRequestDispatcher("KhoaHocHienThi.jsp").forward(request, response);
			 System.out.println("Connected!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
