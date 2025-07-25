/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;

import TheStreetLablel.model.hoadon.HoaDon;
import TheStreetLablel.model.hoadon.HoaDonChiTiet;


/**
 *
 * @author Admin
 */
public interface HoaDonController extends CrudController<HoaDon>{
        void fillToTableSPCT(String MaHoaDon);

    void create2();
    void update2();
    void delete2(String MaHoaDon);
    void editHD();
    void editHDCT(String MaHoaDon);
    HoaDon getFromHD();
    HoaDonChiTiet getFromHDCT();
        void setFormHD(HoaDon entity);
    void setFromHDCT(HoaDonChiTiet entity);
}
