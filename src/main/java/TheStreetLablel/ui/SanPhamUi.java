
package TheStreetLablel.ui;

import TheStreetLablel.controller.SanPhamController;
import TheStreetLablel.dao.DeGiayDAO;
import TheStreetLablel.dao.KieuDangDAO;
import TheStreetLablel.dao.MauSacDAO;
import TheStreetLablel.dao.SanPhamDAO;
import TheStreetLablel.dao.SanPhamResponseDAO;
import TheStreetLablel.dao.SizeDAO;
import TheStreetLablel.dao.ThuongHieuDAO;
import TheStreetLablel.dao.XuatSuDAO;
import TheStreetLablel.dao.impl.SanPhamChiTietImpl;
import TheStreetLablel.dao.impl.SanPhamDAOImpl;
import TheStreetLablel.model.sanpham.DeGiay;
import TheStreetLablel.model.sanpham.KieuDang;
import TheStreetLablel.model.sanpham.MauSac;
import TheStreetLablel.model.sanpham.SanPham;
import TheStreetLablel.model.sanpham.SanPhamChiTiet;
import TheStreetLablel.model.response.SanPhamChiTietResponse;
import TheStreetLablel.model.response.SanPhamResponse;
import TheStreetLablel.model.sanpham.Size;
import TheStreetLablel.model.sanpham.ThuongHieu;
import TheStreetLablel.model.sanpham.XuatSu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class SanPhamUi extends javax.swing.JPanel implements SanPhamController{

    SanPhamResponseDAO responseDao = new SanPhamResponseDAO();
    SanPhamChiTietImpl dao2 = new SanPhamChiTietImpl();
    SanPhamDAO dao = new SanPhamDAOImpl();
    List<SanPham> items = new ArrayList<>();
    ThuongHieuDAO thuongHieuDao = new ThuongHieuDAO();
    KieuDangDAO kieuDangDAO = new KieuDangDAO();
    DeGiayDAO deGiayDAO = new DeGiayDAO();
    XuatSuDAO xuatSuDAO = new XuatSuDAO();
    MauSacDAO mauSacDAO =  new MauSacDAO();
    SizeDAO sizeDAO = new SizeDAO();
    
    public SanPhamUi() {
        initComponents();
        this.open();
    
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
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTiet = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboThuongHieu = new javax.swing.JComboBox<>();
        cboKieuDang = new javax.swing.JComboBox<>();
        cboLoaiDe = new javax.swing.JComboBox<>();
        txtMaSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMoTa = new javax.swing.JTextArea();
        cboXuatSu = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaSanPhamCT = new javax.swing.JTextField();
        txtMaSanPham2 = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        cboMauSac = new javax.swing.JComboBox<>();
        cboSize = new javax.swing.JComboBox<>();
        rdoConHang = new javax.swing.JRadioButton();
        rdoHetHang = new javax.swing.JRadioButton();
        btnThem2 = new javax.swing.JButton();
        btnSua2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(955, 650));
        setMinimumSize(new java.awt.Dimension(955, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm chi tiết", "Mã sản phẩm", "Số lượng", "Màu sắc", "Size", "Trạng thái", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTiet);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá bán", "Mô tả", "Thương hiệu", "Kiểu dáng", "Loại đế giày", "Xuất sứ", ""
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
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Sản phẩm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Chi tiết");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel4)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sản phẩm");

        jLabel5.setText("Mã sản phẩm");

        jLabel6.setText("Tên sản phẩm");

        jLabel7.setText("Giá bán");

        jLabel8.setText("Mô tả");

        jLabel9.setText("Thương hiệu");

        jLabel10.setText("Kiểu dáng");

        jLabel11.setText("Loại đế giày");

        jLabel12.setText("Xuất sứ");

        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboKieuDang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboLoaiDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        taMoTa.setColumns(20);
        taMoTa.setRows(5);
        jScrollPane3.setViewportView(taMoTa);

        cboXuatSu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboThuongHieu, 0, 116, Short.MAX_VALUE)
                            .addComponent(cboKieuDang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboLoaiDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboXuatSu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnThem)
                        .addGap(45, 45, 45)
                        .addComponent(btnSua)
                        .addGap(47, 47, 47)
                        .addComponent(btnXoa))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(cboKieuDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(cboLoaiDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(cboXuatSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        tabs.addTab("Sản phẩm", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sản phẩm chi tiết");

        jLabel13.setText("Mã sản phẩm CT");

        jLabel14.setText("Mã sản phẩm");

        jLabel15.setText("Số lượng");

        jLabel16.setText("Màu sắc");

        jLabel17.setText("Size");

        jLabel18.setText("Trạng thái");

        cboMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdoConHang);
        rdoConHang.setSelected(true);
        rdoConHang.setText("Còn hàng");

        buttonGroup1.add(rdoHetHang);
        rdoHetHang.setText("Hết hàng");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnThem2)
                        .addGap(79, 79, 79)
                        .addComponent(btnSua2)
                        .addGap(99, 99, 99)
                        .addComponent(btnXoa2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSanPhamCT)
                                    .addComponent(txtMaSanPham2)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel17))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(rdoConHang)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoHetHang)))))
                                .addGap(169, 169, 169))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(txtMaSanPhamCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(txtMaSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoConHang)
                    .addComponent(rdoHetHang))
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2)
                    .addComponent(btnSua2)
                    .addComponent(btnXoa2))
                .addContainerGap(257, Short.MAX_VALUE))
        );

        tabs.addTab("Sản phẩm chi tiết", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

        if(evt.getClickCount() == 1){
            int index =  tblSanPham.getSelectedRow();
            String MaSanPham = String.valueOf(tblSanPham.getValueAt(index, 0));
            fillToTableSPCT(MaSanPham);
        }
        else if(evt.getClickCount() == 2){
            this.editSp();
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietMouseClicked
               if(evt.getClickCount() == 2){
            int index =  tblSanPham.getSelectedRow();
            String MaSanPham = String.valueOf(tblSanPham.getValueAt(index, 0));
            this.editSpCT(MaSanPham);
        }
//            int index =  tblSanPham.getSelectedRow();
//            String MaSanPham = String.valueOf(tblSanPham.getValueAt(index, 0));
//            this.editSpCT(MaSanPham);
//            System.out.println(evt.getClickCount());
    }//GEN-LAST:event_tblChiTietMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.create();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua2ActionPerformed
        this.update2();
    }//GEN-LAST:event_btnSua2ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        this.create2();
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        this.delete2(this.getFromSpCT().getMaSanPhamCT());
    }//GEN-LAST:event_btnXoa2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua2;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboKieuDang;
    private javax.swing.JComboBox<String> cboLoaiDe;
    private javax.swing.JComboBox<String> cboMauSac;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JComboBox<String> cboThuongHieu;
    private javax.swing.JComboBox<String> cboXuatSu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoConHang;
    private javax.swing.JRadioButton rdoHetHang;
    private javax.swing.JTextArea taMoTa;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblChiTiet;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMaSanPham2;
    private javax.swing.JTextField txtMaSanPhamCT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables

    @Override
    public void open() {
        this.fillToTable();
        this.loadComboBoxThuongwHieu();
        this.loadComboBoxKieuDang();
        this.loadComboBoxLoaiDe();
        this.loadComboBoxXuatSu();
        this.loadComboBoxMauSac();
        this.loadComboBoxSize();
    }





    @Override
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        for(SanPhamResponse sp : responseDao.getAll() ){
            model.addRow(new Object[]{
            sp.getMaSanPham(),
            sp.getTenSanPham(),
            sp.getGiaBan(),
            sp.getMoTa(),
            sp.getTenThuongHieu(),
            sp.getKieuDang(),
            sp.getLoaiDeGiay(),
            sp.getXuatXu()
            });
        }
    }



    @Override
    public void create() {
        SanPham entity = this.getFromSp();
        dao.create(entity);
        this.fillToTable();
    }

    @Override
    public void update() {
        SanPham entity = this.getFromSp();
        dao.update(entity);
        this.fillToTable();
        
    }

    @Override
    public void delete() {
       String MaSanPham = this.getFromSp().getMaSanPham();
       dao.deleteById(MaSanPham);
       this.fillToTable();
    }

    @Override
    public void fillToTableSPCT(String MaSanPham) {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        model.setRowCount(0);
        for(SanPhamChiTietResponse SPCT : dao2.findAllById(MaSanPham) ){
            model.addRow(new Object[]{
            SPCT.getMaSanPhamCT(),
            SPCT.getMaSanPham(),
            SPCT.getSoLuong(),
            SPCT.getMauSac(),
            SPCT.getSize(),
            SPCT.isTrangThai()?"Còn hàng":"Hết hàng"
            });
        }
    }

    @Override
    public void loadComboBoxThuongwHieu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThuongHieu.getModel();
        model.removeAllElements();
        for(ThuongHieu th : thuongHieuDao.getAll()){
            model.addElement(th.getTenThuongHieu());
        }
    }

    @Override
    public void loadComboBoxKieuDang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKieuDang.getModel();
        model.removeAllElements();
        for(KieuDang kd : kieuDangDAO.getAll()){
            model.addElement(kd.getKieuDang());
        }
    }

    @Override
    public void loadComboBoxLoaiDe() {
                DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiDe.getModel();
        model.removeAllElements();
        for(DeGiay dg : deGiayDAO.getAll()){
            model.addElement(dg.getLoaiDeDay());
        }
    }

    @Override
    public void loadComboBoxXuatSu() {
                       DefaultComboBoxModel model = (DefaultComboBoxModel) cboXuatSu.getModel();
        model.removeAllElements();
        for(XuatSu xs : xuatSuDAO.getAll()){
            model.addElement(xs.getXuatXu());
        }
    }


    @Override
    public void setFormSP(SanPhamResponse entity) {
        txtMaSanPham.setText(entity.getMaSanPham());
        txtTenSanPham.setText(entity.getTenSanPham());
        txtGiaBan.setText(String.valueOf(entity.getGiaBan()));
        taMoTa.setText(entity.getMoTa());
        cboThuongHieu.setSelectedItem(entity.getTenThuongHieu());
        cboLoaiDe.setSelectedItem(entity.getLoaiDeGiay());
        cboKieuDang.setSelectedItem(entity.getKieuDang());
        cboXuatSu.setSelectedItem(entity.getXuatXu());
    }

    @Override
    public void setFromSpCT(SanPhamChiTietResponse entity) {
       txtMaSanPhamCT.setText(entity.getMaSanPhamCT());
       txtMaSanPham2.setText(entity.getMaSanPham());
       txtSoLuong.setText(String.valueOf(entity.getSoLuong()));
       cboMauSac.setSelectedItem(entity.getMauSac());
       cboSize.setSelectedItem(entity.getSize());

       if(entity.isTrangThai()){
           rdoConHang.setSelected(true);
       }
       else rdoHetHang.setSelected(true);
    }

    @Override
    public void loadComboBoxMauSac() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMauSac.getModel();
        model.removeAllElements();
        for(MauSac ms : mauSacDAO.getAll()){
            model.addElement(ms.getMauSac());
        }
    }

    @Override
    public void loadComboBoxSize() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSize.getModel();
        model.removeAllElements();
        for(Size sz : sizeDAO.getAll()){
            model.addElement(sz.getSize());
        }
    }

    @Override
    public void editSp() {
        int index = tblSanPham.getSelectedRow();
        SanPhamResponse entity = responseDao.getAll().get(index);
        this.setFormSP(entity);
        tabs.setSelectedIndex(1);
        
    }

    @Override
    public void editSpCT(String MaSanPham) {
        int index = tblChiTiet.getSelectedRow();
        SanPhamChiTietResponse entity = dao2.findAllById(MaSanPham).get(index);
        this.setFromSpCT(entity);
        tabs.setSelectedIndex(2);
    }

    @Override
    public SanPham getFromSp() {
        String thuongHieu = null;
        String kieuDang = null; 
        String loaiDeDay = null;
        String xuatSu = null;
        for(ThuongHieu th : thuongHieuDao.getAll()){
            if(th.getTenThuongHieu().equals(String.valueOf(cboThuongHieu.getSelectedItem().toString()))){
                thuongHieu = th.getMaThuongHieu();
            }
        }
        for(KieuDang kd : kieuDangDAO.getAll()){
            if(kd.getKieuDang().equals(String.valueOf(cboKieuDang.getSelectedItem().toString()))){
                kieuDang = kd.getMaKieuDang();
            }
        }
        for(DeGiay dg : deGiayDAO.getAll()){
            if(dg.getLoaiDeDay().equals(String.valueOf(cboLoaiDe.getSelectedItem().toString()))){
                loaiDeDay = dg.getMaDeGiay();
            }
        }
        for(XuatSu xs : xuatSuDAO.getAll()){
            if(xs.getXuatXu().equals(String.valueOf(cboXuatSu.getSelectedItem().toString()))){
                xuatSu = xs.getMaXuatXu();
            }
        }
        return new SanPham(
                txtMaSanPham.getText(),
                txtTenSanPham.getText(),
                new BigDecimal(txtGiaBan.getText()),
                taMoTa.getText(), 
                thuongHieu, 
                kieuDang, 
                xuatSu, 
                loaiDeDay);

    }

    @Override
    public SanPhamChiTiet getFromSpCT() {
        String mauSac = null;
        String size = null;
                for(MauSac ms : mauSacDAO.getAll()){
            if(ms.getMauSac().equals(String.valueOf(cboMauSac.getSelectedItem().toString()))){
                mauSac = ms.getMaMauSac();
            }
        }
           for(Size s : sizeDAO.getAll()){
if (String.valueOf(s.getSize()).equals(cboSize.getSelectedItem().toString())) {
    size = s.getMaSize();
}
        }
        return new SanPhamChiTiet(
                txtMaSanPhamCT.getText(),
                rdoConHang.isSelected(),
                Integer.valueOf(txtSoLuong.getText()),
                txtMaSanPham2.getText(),
                mauSac,
                size
                 );
    }

    @Override
    public void create2() {
        SanPhamChiTiet entity = this.getFromSpCT();
        dao2.create(entity);
    }

    @Override
    public void update2() {
        SanPhamChiTiet entity = this.getFromSpCT();
        dao2.update(entity);
        fillToTableSPCT(entity.getMaSanPham());
    }

    @Override
    public void delete2(String MaSanPhamCT) {
        String MaSanPhamCTOnForm = this.getFromSpCT().getMaSanPhamCT();
        if(MaSanPhamCTOnForm.isEmpty()){
            dao2.deleteById(MaSanPhamCT);
        }
        else{ 
            dao2.deleteById(MaSanPhamCTOnForm);
            fillToTableSPCT(MaSanPhamCTOnForm);
        }
        }
    }




