/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.GiamGiaDao;
import TheStreetLablel.model.giamgia.GiamGia;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author DLC
 */
public class GiamGiaDaoImpl implements GiamGiaDao{
    
    String findAll = """
                     SELECT *
                     FROM GIAMGIA
                     """;
    String create = """
                    INSERT INTO GIAMGIA(
                    MaGiamGia,
                    NgayBatDau,
                    NgayHetHan,
                    LoaiGiam,
                    MucGiamToiDa,
                    Giatri,
                    DieuKien,
                    TrangThai
                    )
                    VALUES(?,?,?,?,?,?,?,?)
                    """;
    String update = """
                    UPDATE GIAMGIA
                    SET 
                    NgayBatDau, = ?
                    NgayHetHan = ?,
                    LoaiGiam = ?,
                    MucGiamToiDa = ?,
                    Giatri = ?,
                    DieuKien = ?,
                    TrangThai = ?
                    WHERE MaGiamGia = ?
                    """;
    String deleteByMa = """
                        DLEETE FROM GIAMGIA
                        WHERE MaGiamGia = ?
                        """;
    String findById = """
                      SELECT *
                      FROM GIAMGIA
                      WHERE MaGiamGia = ?
                      """;
    @Override
    public List<GiamGia> findAll() {
        return XQuery.getBeanList(GiamGia.class, findAll);
    }

    @Override
    public GiamGia create(GiamGia entity) {
        Object[] values = {
            entity.getMaGiamGia(),
            entity.getNgayBatDau(),
            entity.getNgayHetHan(),
            entity.getLoaiGiam(),
            entity.getMucGiamToiDa(),
            entity.getGiatri(),
            entity.getDieuKien(),
            entity.getTrangThai(),
            
        };
        XJdbc.executeUpdate(create, values);
        return entity;
    }

    @Override
    public void update(GiamGia entity) {
        Object[] values = {
            
            entity.getNgayBatDau(),
            entity.getNgayHetHan(),
            entity.getLoaiGiam(),
            entity.getMucGiamToiDa(),
            entity.getGiatri(),
            entity.getDieuKien(),
            entity.getTrangThai(),
            entity.getMaGiamGia()
            
        };
        XJdbc.executeUpdate(update, values);
    }

  

    @Override
    public GiamGia findById(String ma) {
        return XQuery.getSingleBean(GiamGia.class, findById ,ma);
    }

    @Override
    public void deleteById(String id) {
                XJdbc.executeUpdate(deleteByMa, id);
    }
    
}
