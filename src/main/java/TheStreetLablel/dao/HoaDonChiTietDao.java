/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.hoadon.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface HoaDonChiTietDao extends CrudDAO<HoaDonChiTiet, String>{
                List<HoaDonChiTiet> findAllById(String MaHoaDon);
}
