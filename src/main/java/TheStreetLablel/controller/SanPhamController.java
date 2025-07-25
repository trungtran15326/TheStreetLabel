/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;

import TheStreetLablel.model.sanpham.SanPham;
import TheStreetLablel.model.sanpham.SanPhamChiTiet;
import TheStreetLablel.model.response.SanPhamChiTietResponse;
import TheStreetLablel.model.response.SanPhamResponse;

/**
 *
 * @author Admin
 */
public interface SanPhamController extends CrudController<SanPham>{
    void fillToTableSPCT(String MaSanPham);
    void loadComboBoxThuongwHieu();
    void loadComboBoxKieuDang();
    void loadComboBoxLoaiDe();
    void loadComboBoxXuatSu();
    void loadComboBoxMauSac();
    void loadComboBoxSize();
    void setFormSP(SanPhamResponse entity);
    void setFromSpCT(SanPhamChiTietResponse entity);
    void editSp();
    void editSpCT(String MaSanPham);
    SanPham getFromSp();
    SanPhamChiTiet getFromSpCT();
    void create2();
    void update2();
    void delete2(String MaSanPhamCT);
}
