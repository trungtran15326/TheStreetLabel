/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.sanpham.SanPhamChiTiet;
import TheStreetLablel.model.response.SanPhamChiTietResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface SanPhamChiTietDAO extends CrudDAO<SanPhamChiTiet, String>{
    List<SanPhamChiTietResponse> findAllSPCT();
    List<SanPhamChiTietResponse> findAllById(String MaSanPham);
}
