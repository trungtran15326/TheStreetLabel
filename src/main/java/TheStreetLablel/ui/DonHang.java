/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TheStreetLablel.ui;

import TheStreetLablel.controller.HoaDonController;
import TheStreetLablel.dao.impl.HoaDonChiTietDAOImpl;
import TheStreetLablel.dao.impl.HoaDonDAOImpl;
import TheStreetLablel.model.hoadon.HoaDon;
import TheStreetLablel.model.hoadon.HoaDonChiTiet;

import java.time.LocalDate;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class DonHang extends javax.swing.JPanel implements HoaDonController{

    /**
     * Creates new form DonHang
     */
    HoaDonDAOImpl dao = new HoaDonDAOImpl();
    HoaDonChiTietDAOImpl dao2 = new HoaDonChiTietDAOImpl();
    
    public DonHang() {
        initComponents();
        fillToTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDonChiTiet = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtTongSoLuongSP = new javax.swing.JTextField();
        txtTongSoTien = new javax.swing.JTextField();
        rdoDa = new javax.swing.JRadioButton();
        rdoChua = new javax.swing.JRadioButton();
        txtMaGiamGia = new javax.swing.JTextField();
        txtNhanVien = new javax.swing.JTextField();
        txtMaKhachHang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaHoaDonCT = new javax.swing.JTextField();
        txtNgayMua = new javax.swing.JTextField();
        txtMaHoaDon2 = new javax.swing.JTextField();
        txtMaSanPhamCT = new javax.swing.JTextField();
        btnThem2 = new javax.swing.JButton();
        btnSua2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        jbcNgayMua = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Đơn giá", "Tổng số lượng SP", "Tổng số tiền", "Trạng thái", "Mã giảm giá", "Mã nhân viên ", "Mã khách hàng", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        tblHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn CT", "Ngày mua", "Mã Hóa đơn", "Mã sản phẩm CT", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDonChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonChiTietMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDonChiTiet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách", jPanel1);

        jLabel1.setText("Mã hóa đơn");

        jLabel2.setText("Đơn giá");

        jLabel3.setText("Tổng số lượng SP");

        jLabel4.setText("Tổng số tiền");

        jLabel5.setText("Trạng thái");

        jLabel6.setText("Mã giảm giá");

        jLabel7.setText("Mã nhân viên");

        jLabel8.setText("Mã khách hàng");

        txtMaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoaDonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDa);
        rdoDa.setText("Đã thanh toán");

        buttonGroup1.add(rdoChua);
        rdoChua.setText("Chưa thanh toán");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHoaDon)
                            .addComponent(txtDonGia)
                            .addComponent(txtTongSoLuongSP)
                            .addComponent(txtTongSoTien, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel7))
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoDa)
                                .addGap(32, 32, 32)
                                .addComponent(rdoChua))
                            .addComponent(txtMaGiamGia)
                            .addComponent(txtNhanVien)
                            .addComponent(txtMaKhachHang))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(75, 75, 75)
                        .addComponent(jButton2)
                        .addGap(101, 101, 101)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoDa)
                    .addComponent(rdoChua))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtTongSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtTongSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        tabs.addTab("Hóa đơn", jPanel2);

        jLabel9.setText("Mã hóa đơn CT");

        jLabel10.setText("Ngày mua");

        jLabel11.setText("Mã hóa đơn");

        jLabel12.setText("Mã sản phẩm CT");

        btnThem2.setText("Thêm");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });

        btnSua2.setText("Sửa");
        btnSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua2ActionPerformed(evt);
            }
        });

        btnXoa2.setText("Xóa");
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2ActionPerformed(evt);
            }
        });

        jbcNgayMua.setMaxSelectableDate(new java.util.Date(253370743317000L));
        jbcNgayMua.setMinSelectableDate(new java.util.Date(-62135791083000L));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem2)
                        .addGap(76, 76, 76)
                        .addComponent(btnSua2)
                        .addGap(95, 95, 95)
                        .addComponent(btnXoa2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbcNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaHoaDonCT, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(txtNgayMua))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSanPhamCT, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(txtMaHoaDon2))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtMaHoaDonCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPhamCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbcNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2)
                    .addComponent(btnSua2)
                    .addComponent(btnXoa2))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        tabs.addTab("Hóa đơn chi tiết", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHoaDonActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        if(evt.getClickCount() == 1){
            int index =  tblHoaDon.getSelectedRow();
            String MaHoaDon = String.valueOf(tblHoaDon.getValueAt(index, 0));
            fillToTableSPCT(MaHoaDon);
        }
        else if(evt.getClickCount() == 2){
            this.editHD();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblHoaDonChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonChiTietMouseClicked
                       if(evt.getClickCount() == 2){
            int index =  tblHoaDonChiTiet.getSelectedRow();
            String MaHoaDon = String.valueOf(tblHoaDonChiTiet.getValueAt(index, 2));
            this.editHDCT(MaHoaDon);
        }
    }//GEN-LAST:event_tblHoaDonChiTietMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.create();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
        this.create2();
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua2ActionPerformed
        // TODO add your handling code here:
        this.update2();
    }//GEN-LAST:event_btnSua2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        // TODO add your handling code here:
        this.delete2(this.getFromHDCT().getMaHoaDonCT());
    }//GEN-LAST:event_btnXoa2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua2;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnXoa2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jbcNgayMua;
    private javax.swing.JRadioButton rdoChua;
    private javax.swing.JRadioButton rdoDa;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblHoaDonChiTiet;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaHoaDon2;
    private javax.swing.JTextField txtMaHoaDonCT;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaSanPhamCT;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtNhanVien;
    private javax.swing.JTextField txtTongSoLuongSP;
    private javax.swing.JTextField txtTongSoTien;
    // End of variables declaration//GEN-END:variables

    @Override
    public void open() {
        fillToTable();
    }

    @Override
    public void fillToTable() {
                DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        for(HoaDon sp : dao.findAll() ){
            model.addRow(new Object[]{
            sp.getMaHoaDon(),
            sp.getDonGia(),
            sp.getTongSoLuongSP(),
            sp.getTongSoTien(),
            sp.isTrangThai(),
            sp.getMaGiamGia(),
            sp.getMaNhanVien(),
            sp.getMaKhachHang()
            });
        }
    }

    @Override
    public void create() {
        HoaDon entity = this.getFromHD();
        dao.create(entity);
        this.fillToTable();
    }

    @Override
    public void update() {
        HoaDon entity = this.getFromHD();
        dao.update(entity);
        this.fillToTable();
    }

    @Override
    public void delete() {
       String MaHoaDon = this.getFromHD().getMaHoaDon();
       dao.deleteById(MaHoaDon);
       this.fillToTable();
    }

    @Override
    public void create2() {
        HoaDonChiTiet entity = this.getFromHDCT();
        dao2.create(entity);
    }

    @Override
    public void update2() {
        HoaDonChiTiet entity = this.getFromHDCT();
        dao2.update(entity);
        fillToTableSPCT(entity.getMaHoaDon());
    }

    @Override
    public void delete2(String MaHoaDon) {
        String MaHoaDonCTOnForm = this.getFromHDCT().getMaHoaDonCT();
        if(MaHoaDonCTOnForm.isEmpty()){
            dao2.deleteById(MaHoaDon);
        }
        else{ 
            dao2.deleteById(MaHoaDonCTOnForm);
            fillToTableSPCT(MaHoaDonCTOnForm);
        }
        
    }

    @Override
    public void fillToTableSPCT(String MaHoaDon) {
        DefaultTableModel model = (DefaultTableModel) tblHoaDonChiTiet.getModel();
        model.setRowCount(0);
        for(HoaDonChiTiet ct : dao2.findAllById(MaHoaDon)){
            model.addRow(new Object[]{
                ct.getMaHoaDonCT(),
                ct.getNgayMua(),
                ct.getMaHoaDon(),
                ct.getMaSanPhamCT()
            });
        }
        }

    @Override
    public void editHD() {
        int index = tblHoaDon.getSelectedRow();
        HoaDon entity = dao.findAll().get(index);
        this.setFormHD(entity);
        tabs.setSelectedIndex(1);
    }

    @Override
    public void editHDCT(String MaHoaDon) {
        int index = tblHoaDonChiTiet.getSelectedRow();
        HoaDonChiTiet entity = dao2.findAllById(MaHoaDon).get(index);
        this.setFromHDCT(entity);
        tabs.setSelectedIndex(2);
    }


    @Override
    public HoaDonChiTiet getFromHDCT() {
        return new HoaDonChiTiet(
         txtMaHoaDonCT.getText(),
                LocalDate.parse(txtNgayMua.getText()),
                txtMaHoaDon2.getText(),
                txtMaSanPhamCT.getText()
        );
    }

    @Override
    public HoaDon getFromHD() {
        return new HoaDon(
        txtMaHoaDon.getText(),
        txtDonGia.getText(),
        Integer.parseInt(txtTongSoLuongSP.getText()),
        txtTongSoTien.getText(),
        rdoDa.isSelected(),
        txtMaGiamGia.getText(),
        txtNhanVien.getText(),
        txtMaKhachHang.getText()
        
        );
    }

    @Override
    public void setFormHD(HoaDon entity) {
        txtMaHoaDon.setText(entity.getMaHoaDon());
        txtDonGia.setText(entity.getDonGia());
        txtTongSoLuongSP.setText(String.valueOf(entity.getTongSoLuongSP()));
        txtTongSoTien.setText(entity.getTongSoTien());
        if(entity.isTrangThai()){
            rdoDa.setSelected(true);
        }
        else rdoChua.setSelected(true);
        
        txtMaGiamGia.setText(entity.getMaGiamGia());
        txtNhanVien.setText(entity.getMaNhanVien());
        txtMaKhachHang.setText(entity.getMaKhachHang());
    }

    @Override
    public void setFromHDCT(HoaDonChiTiet entity) {
        txtMaHoaDonCT.setText(entity.getMaHoaDonCT());
        txtNgayMua.setText(String.valueOf(entity.getNgayMua()));
        txtMaHoaDon2.setText(entity.getMaHoaDon());
        txtMaSanPhamCT.setText(entity.getMaSanPhamCT());
    }
    }
    

