/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.CrudDAO;
import TheStreetLablel.dao.SanPhamChiTietDAO;
import TheStreetLablel.model.sanpham.SanPhamChiTiet;
import TheStreetLablel.model.response.SanPhamChiTietResponse;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamChiTietImpl implements SanPhamChiTietDAO{
     String CreateSql = """
INSERT INTO [dbo].[SANPHAMCHITIET]
                                  ([MaSanPhamCT]
                                  ,[TrangThai]
                                  ,[SoLuong]
                                  ,[MaSanPham]
                                  ,[MaMauSac]
                                  ,[MaSize])
                            VALUES
                                  (?,?,?,?,?,?)
                       """;
    
    String UpdateSql = """
UPDATE [dbo].[SANPHAMCHITIET]
   SET 
       [TrangThai] = ?
      ,[SoLuong] = ?
      ,[MaSanPham] = ?
      ,[MaMauSac] = ?
      ,[MaSize] = ?
 WHERE [MaSanPhamCT] = ?
                       """;
    
    String DeleteSql = """
                          DELETE FROM [dbo].[SANPHAMCHITIET]
                             WHERE MaSanPhamCT = ?
                       """;

    String findByIdSql = """
SELECT 
                               SPCT.MaSanPhamCT

                               ,SPCT.MaSanPham
                                                        ,SPCT.SoLuong
                               ,MS.MauSac
                               ,Z.Size
                         	  ,SPCT.TrangThai
                           FROM [The_Street_Label].[dbo].[SANPHAMCHITIET] SPCT
                          LEFT JOIN MAUSAC MS ON MS.MaMauSac= SPCT.MaMauSac
                           LEFT JOIN SIZE Z ON Z.MaSize = SPCT.MaSize
                         WHERE SPCT.MaSanPham = ?
                                            """;
    
    String findAllSql = """
                         
SELECT 
                               SPCT.MaSanPhamCT

                               ,SPCT.MaSanPham
                                                        ,SPCT.SoLuong
                               ,MS.MauSac
                               ,Z.Size
                         	  ,SPCT.TrangThai
                           FROM [The_Street_Label].[dbo].[SANPHAMCHITIET] SPCT
                          LEFT JOIN MAUSAC MS ON MS.MaMauSac= SPCT.MaMauSac
                           LEFT JOIN SIZE Z ON Z.MaSize = SPCT.MaSize
                         """;
    @Override
    public SanPhamChiTiet create(SanPhamChiTiet entity) {
        Object[] value = {
            entity.getMaSanPhamCT(),
            entity.isTrangThai(),
            entity.getSoLuong(),
            entity.getMaSanPham(),
            entity.getMaMauSac(),
            entity.getMaSize()
        };
        XJdbc.executeUpdate(CreateSql, value);
        return  entity;
    }

    @Override
    public void update(SanPhamChiTiet entity) {
                Object[] value = {
            
            entity.isTrangThai(),
            entity.getSoLuong(),
            entity.getMaSanPham(),
            entity.getMaMauSac(),
            entity.getMaSize(),
            entity.getMaSanPhamCT()
        };
                XJdbc.executeUpdate(UpdateSql, value);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(DeleteSql,id);
    }

    @Override
    public List<SanPhamChiTiet> findAll() {
             return XQuery.getBeanList(SanPhamChiTiet.class, findAllSql);
    }

    @Override
    public SanPhamChiTiet findById(String id) {
        return XQuery.getSingleBean(SanPhamChiTiet.class,findByIdSql , id);
    }

    

    @Override
    public List<SanPhamChiTietResponse> findAllSPCT() {
        return XQuery.getBeanList(SanPhamChiTietResponse.class, findAllSql);
    }

    @Override
    public List<SanPhamChiTietResponse> findAllById(String MaSanPham) {
        return XQuery.getBeanList(SanPhamChiTietResponse.class, findByIdSql, MaSanPham);
    }
    
}
