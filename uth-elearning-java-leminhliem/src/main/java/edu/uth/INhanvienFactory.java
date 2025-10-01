package edu.uth;

public interface INhanvienFactory {
    public Nhanvien createNhanvien(String LoaiNV, String maso, String hoten, double luongCB);
    public Nhanvien createNhanvien(String LoaiNV);
} 
