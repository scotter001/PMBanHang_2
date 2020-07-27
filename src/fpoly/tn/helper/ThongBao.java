/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.tn.helper;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Business Logic Layer
 * @author CuongNP
 */
public class ThongBao {
        
    //Hàm thông báo đơn giản
    public static void ThongBaoDonGian(String Title, String Content){
        JOptionPane.showMessageDialog(new JFrame(), 
                Content, Title, JOptionPane.INFORMATION_MESSAGE );
    }
}
