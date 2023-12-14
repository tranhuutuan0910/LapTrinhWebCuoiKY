package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addKhoaHoc {
	public void addSubject(String idKhoaHoc, String tenKhoaHoc, String ngayBatDauKhoaHoc, String ngayKetThucKhoaHoc, String soLuongThamGia) throws ClassNotFoundException {
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
