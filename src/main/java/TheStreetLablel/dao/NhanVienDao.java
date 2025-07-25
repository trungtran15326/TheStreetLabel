/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;


import TheStreetLablel.model.nhanvien.NhanVienEntity;
import java.util.List;

/**
 *
 * @author DLC
 */
public interface NhanVienDao extends CrudDAO<NhanVienEntity, String>{
    List<NhanVienEntity> findAll();
}
