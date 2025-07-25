/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.giamgia.GiamGia;
import java.util.List;

/**
 *
 * @author DLC
 */
public interface GiamGiaDao extends CrudDAO<GiamGia, String>{
    List<GiamGia> findAll();
}
