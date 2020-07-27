/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.tn.dal;

import fpoly.tn.dto.NhanVien;
import fpoly.tn.helper.ChuyenDoi;
import fpoly.tn.helper.sqlHelper;
import java.sql.*;

/**
 * Data Access Layer
 *
 * @author CuongNP
 */
public class DALNhanVien {

    public static ResultSet Login(String TenDangNhap, String MatKhau) {
        String sql = "Select * from NhanVien "
                + " where TenDangNhap = ? and MatKhau = ?";

        return sqlHelper.executeQuery(sql, TenDangNhap, MatKhau);
    }

    public static void Them(NhanVien nv) {
        String sql = "Set DateFormat DMY INSERT INTO [dbo].[NhanVien] "
                + "   ([TenNhanVien],[DiaChi],[SoDienThoai],[GioiTinh],"
                + "  [ChucVu],[NgaySinh],[NgayVaoLam],[TenDangNhap],[MatKhau]) "
                + "  VALUES(?, ?, ?, ?, ?, ? ,? , ?, ?)";
        
        sqlHelper.executeUpdate(sql, 
                nv.getTenNhanVien(), 
                nv.getDiaChi(),
                nv.getSoDienThoai(),
                nv.isGioiTinh(),
                nv.getChucVu(),
                ChuyenDoi.LayNgayString(nv.getNgaySinh()),
                ChuyenDoi.LayNgayString(nv.getNgayVaoLam()),
                nv.getTenDangNhap(),
                nv.getMatKhau()
            );
    }

}
