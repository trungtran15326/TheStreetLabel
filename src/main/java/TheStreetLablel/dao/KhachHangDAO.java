/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;


import TheStreetLablel.model.khachhang.khachHang;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface KhachHangDAO extends CrudDAO<khachHang, String>{
    List<khachHang> findAll();
}
