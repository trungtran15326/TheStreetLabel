/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.HoaDonChiTietDao;
import TheStreetLablel.model.hoadon.HoaDonChiTiet;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDAOImpl implements HoaDonChiTietDao{
    
    
     String CreateSql = """
INSERT INTO [dbo].[HOADONCHITIET]
           [NgayMua]
           ,[MaHoaDon]
           ,[MaSanPhamCT],
		   [MaHoaDonCT]
     VALUES
           (?,?,?,?)
                       """;
    
    String UpdateSql = """
UPDATE [dbo].[HOADONCHITIET]
   SET 
      [NgayMua] = ?
      ,[MaHoaDon] = ?
      ,[MaSanPhamCT] = ?
 WHERE [MaHoaDonCT] = ?
                       """;
    
    String DeleteSql = """
DELETE FROM HOADONCHITIET
                       WHERE MaHoaDonCT = ?

                       """;
    String findAllSql = """
SELECT  [MaHoaDonCT]
      ,[NgayMua]
      ,[MaHoaDon]
      ,[MaSanPhamCT]
  FROM [The_Street_Label].[dbo].[HOADONCHITIET]
                     """;
    String findById = """
SELECT  [MaHoaDonCT]
      ,[NgayMua]
      ,[MaHoaDon]
      ,[MaSanPhamCT]
  FROM [The_Street_Label].[dbo].[HOADONCHITIET]
                      Where [MaHoaDon] = ?
                      """;


    @Override
    public HoaDonChiTiet create(HoaDonChiTiet entity) {
        Object[] values = {
           entity.getMaHoaDonCT(),
            entity.getNgayMua(),
            entity.getMaHoaDon(),
            entity.getMaSanPhamCT()
        };
        XJdbc.executeUpdate(CreateSql, values);
        return entity;
    }

    @Override
    public void update(HoaDonChiTiet entity) {
           Object[] values = {
            entity.getNgayMua(),
            entity.getMaHoaDon(),
            entity.getMaSanPhamCT(),
            entity.getMaHoaDonCT()
        };
        XJdbc.executeUpdate(UpdateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(DeleteSql, id);
    }

    @Override
    public List<HoaDonChiTiet> findAll() {
        return XQuery.getBeanList(HoaDonChiTiet.class, findAllSql);
    }

    @Override
    public HoaDonChiTiet findById(String id) {
        return XQuery.getSingleBean(HoaDonChiTiet.class, findById, id);
    }

    @Override
    public List<HoaDonChiTiet> findAllById(String MaHoaDon) {
        return XQuery.getBeanList(HoaDonChiTiet.class, findById, MaHoaDon);
    }
    
}
