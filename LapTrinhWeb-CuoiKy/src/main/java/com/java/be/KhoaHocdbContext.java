package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KhoaHocdbContext {

   

    public KhoaHocdbContext() throws Exception {
        // Create dbConnect instance and obtain connection         
		Connection c = dbConnect.initializeDatabase();

        // Print connection status
        System.out.println("Ket Noi Thanh Cong");
    }

    public static void main(String[] args) throws Exception {
        KhoaHocdbContext context = new KhoaHocdbContext();
        List<KhoaHoc> khoaHocs = context.getAllKhoaHoc();
        
       
        for (KhoaHoc khoaHoc : khoaHocs) {
            System.out.println(khoaHoc);
        }
    }

    public List<KhoaHoc> getAllKhoaHoc() throws SQLException, ClassNotFoundException {
        List<KhoaHoc> khoaHocs = new ArrayList<>();        
        try  {
        
        	Connection c = dbConnect.initializeDatabase();
        	Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM KhoaHoc");

            while (resultSet.next()) {
                String idKhoaHoc = resultSet.getString("idKhoaHoc");
                String tenKhoaHoc = resultSet.getString("tenKhoaHoc");
                String ngayBatDauKhoaHoc = resultSet.getString("ngayBatDauKhoaHoc");
                String ngayKetThucKhoaHoc = resultSet.getString("ngayKetThucKhoaHoc");
                String soLuongThamGia = resultSet.getString("soLuongThamGia");

                // Create KhoaHoc object and add it to the list
                khoaHocs.add(new KhoaHoc(idKhoaHoc, tenKhoaHoc, ngayBatDauKhoaHoc, ngayKetThucKhoaHoc, soLuongThamGia));
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        return khoaHocs;
    }
  
public void addKhoaHoc(String idKhoaHoc, String tenKhoaHoc, String ngayBatDauKhoaHoc, String ngayKetThucKhoaHoc, String soLuongThamGia) throws ClassNotFoundException {
		try {
			Connection c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("INSERT INTO KhoaHoc (idKhoaHoc, tenKhoaHoc, ngayBatDauKhoaHoc, ngayKetThucKhoaHoc, soLuongThamGia) values (?, ?, ?, ?, ?)");
			pstm.setString(1, idKhoaHoc);
			pstm.setString(2, tenKhoaHoc);
			pstm.setString(3, ngayBatDauKhoaHoc);
			pstm.setString(4, ngayKetThucKhoaHoc);
			pstm.setString(5, soLuongThamGia);
			
			
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
