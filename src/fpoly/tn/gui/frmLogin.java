/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.tn.gui;

import fpoly.tn.bll.BLLNhanVien;

import fpoly.tn.helper.ThongBao;

/**
 *
 * @author CuongNP
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDangNhap = new javax.swing.JPanel();
        lblTenDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDangNhap.setBackground(new java.awt.Color(102, 0, 0));
        pnlDangNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin đăng nhập", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("UTM Avo", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblTenDangNhap.setBackground(new java.awt.Color(204, 255, 102));
        lblTenDangNhap.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(255, 255, 153));
        lblTenDangNhap.setText("Tên đăng nhập");

        txtTenDangNhap.setText("admin");

        lblMatKhau.setBackground(new java.awt.Color(204, 255, 102));
        lblMatKhau.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(255, 255, 153));
        lblMatKhau.setText("Mật khẩu");

        txtMatKhau.setText("admin");

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(102, 0, 0));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(102, 0, 0));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDangNhapLayout = new javax.swing.GroupLayout(pnlDangNhap);
        pnlDangNhap.setLayout(pnlDangNhapLayout);
        pnlDangNhapLayout.setHorizontalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMatKhau)
                    .addComponent(lblTenDangNhap))
                .addGap(26, 26, 26)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlDangNhapLayout.setVerticalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDangNhap)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau))
                .addGap(34, 34, 34)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
       
        String TenDangNhap = txtTenDangNhap.getText();
        String MatKhau = String.valueOf(txtMatKhau.getPassword());
        boolean kt = BLLNhanVien.KiemTraThongTin( TenDangNhap, MatKhau);
       
       if(kt){
           String Ten = BLLNhanVien.DangNhap(TenDangNhap, MatKhau);
           
           if(Ten.isEmpty()){
               ThongBao.ThongBaoDonGian("Thông báo", "Đăng nhập thất bại");
           }else{
               frmNhanVien frm = new frmNhanVien();
               frm.setVisible(true);
           }
       }
       
       
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        

    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JPanel pnlDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
