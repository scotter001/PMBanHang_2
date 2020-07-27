/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.tn.bll;

import fpoly.tn.dal.DALNhanVien;
import fpoly.tn.dto.NhanVien;
import fpoly.tn.helper.ThongBao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongNP
 */
public class BLLNhanVien {
    //Hàm kiểm tra thông tin đăng nhập
    public static boolean KiemTraThongTin(String TenDangNhap, String MatKhau){
        
        if(TenDangNhap.isBlank() || MatKhau.isBlank()){
            ThongBao.ThongBaoDonGian("Thông báo", "Bạn chưa nhập đủ thông tin");
            
            return false;
        }
        
        if(TenDangNhap.length() < 5){
            ThongBao.ThongBaoDonGian("Thông báo", "Tên tối thiểu 5 kí tự");
            
            return false;
        }
        
        if(MatKhau.length() < 5){
            ThongBao.ThongBaoDonGian("Thông báo", "Mật khẩu tối thiểu 5 kí tự");
            
            return false;
        }
        
        return true;
    }
    
    public static String DangNhap(String TenDangNhap, String MatKhau){
        try {
            ResultSet rs = DALNhanVien.Login(TenDangNhap, MatKhau);
            
            if(rs.next()){
                return TenDangNhap;
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi SQL đăng nhập");
        }
        return "";
    }
    
    public static boolean KiemTraNhaVien(NhanVien nv){
        if(nv.getTenNhanVien().isBlank()){
            ThongBao.ThongBaoDonGian("Thông báo", "Bạn chưa nhập Tên nhân viên!");
            return false;
        }
        if(nv.getTenNhanVien().length() < 6){
            ThongBao.ThongBaoDonGian("Thông báo", "Tên nhân viên tối thiểu 6 kí tự!");
            return false;
        }        
        return true; //Kiểm tra OK
    }
    //Hàm thêm nhân viên
    public static void Them(NhanVien nv){
        //Gọi hàm kiểm tra tính hợp lệ các thông tin của nhân viên
        boolean kiemTra = KiemTraNhaVien(nv);
        //Nếu kiểm tra ok thì thực hiện gọi hàm thêm NhanVien từ DAL
        if(kiemTra){
            DALNhanVien.Them(nv);
        }        
    }
}
