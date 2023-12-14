package com.java.be;

public class KhoaHoc {
	
	public String getidKhoaHoc() {
		return idKhoaHoc;
	}
	public void setIdKhoaHoc(String idKhoaHoc) {
		this.idKhoaHoc = idKhoaHoc;
	}
	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}
	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}
	public String getNgayBatDauKhoaHoc() {
		return ngayBatDauKhoaHoc;
	}
	public void setNgayBatDauKhoaHoc(String ngayBatDauKhoaHoc) {
		this.ngayBatDauKhoaHoc = ngayBatDauKhoaHoc;
	}
	public String getNgayKetThucKhoaHoc() {
		return ngayKetThucKhoaHoc;
	}
	public void setNgayKetThucKhoaHoc(String ngayKetThucKhoaHoc) {
		this.ngayKetThucKhoaHoc = ngayKetThucKhoaHoc;
	}
	public String getSoLuongThamGia() {
		return soLuongThamGia;
	}
	public void setSoLuongThamGia(String soLuongThamGia) {
		this.soLuongThamGia = soLuongThamGia;
	}
	public KhoaHoc(String idKhoaHoc, String tenKhoaHoc, String ngayBatDauKhoaHoc, String ngayKetThucKhoaHoc,
			String soLuongThamGia) {
		super();
		this.idKhoaHoc = idKhoaHoc;
		this.tenKhoaHoc = tenKhoaHoc;
		this.ngayBatDauKhoaHoc = ngayBatDauKhoaHoc;
		this.ngayKetThucKhoaHoc = ngayKetThucKhoaHoc;
		this.soLuongThamGia = soLuongThamGia;
	}
	String idKhoaHoc;
	String tenKhoaHoc;
	String ngayBatDauKhoaHoc;
    String ngayKetThucKhoaHoc;
    String soLuongThamGia;
	
	

}
