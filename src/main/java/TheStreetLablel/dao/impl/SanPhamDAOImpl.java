/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.SanPhamDAO;
import TheStreetLablel.model.sanpham.SanPham;
import TheStreetLablel.model.response.SanPhamChiTietResponse;
import TheStreetLablel.model.response.SanPhamResponse;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;

import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamDAOImpl implements SanPhamDAO{

    
    String CreateSql = """
                       INSERT INTO [dbo].[SANPHAM]
                                  ([MaSanPham]
                                  ,[TenSanPham]
                                  ,[GiaBan]
                                  ,[MoTa]
                                  ,[MaThuongHieu]
                                  ,[MaKieuDang]
                                  ,[MaXuatXu]
                                  ,[MaDeGiay]
                                  )
                            VALUES
                                  (?,?,?,?,?,?,?,?)
                       """;
    
    String UpdateSql = """
                       UPDATE [dbo].[SANPHAM]
                          SET 
                              [TenSanPham] = ?
                             ,[GiaBan] = ?
                             ,[MoTa] = ?
                             ,[MaThuongHieu] = ?
                             ,[MaKieuDang] = ?
                             ,[MaXuatXu] = ?
                             ,[MaDeGiay] = ?
                        WHERE [MaSanPham] = ?
                       """;
    
    String DeleteSql = """
                       DELETE FROM SANPHAMCHITIET
                       WHERE MaSanPham = ?
                       
                       DELETE FROM [dbo].[SANPHAM]
                       WHERE MaSanPham = ?
                       """;
    String findAllSql = """
                     SELECT [MaSanPham]
                           ,[TenSanPham]
                           ,[GiaBan]
                           ,[MoTa]
                           ,[MaThuongHieu]
                           ,[MaKieuDang]
                           ,[MaXuatXu]
                           ,[MaDeGiay]
                       FROM [dbo].[SANPHAM]
                     """;
    String findById = """
                     SELECT [MaSanPham]
                                                 ,[TenSanPham]
                                                 ,[GiaBan]
                                                 ,[MoTa]
                                                 ,[MaThuongHieu]
                                                 ,[MaKieuDang]
                                                 ,[MaXuatXu]
                                                 ,[MaDeGiay]
                                             FROM [dbo].[SANPHAM]
                      WHERE  [MaSanPham] = ?
                      """;
    

    
    @Override
    public SanPham create(SanPham entity) {
        Object[] value = {
          entity.getMaSanPham(),
          entity.getTenSanPham(),
          entity.getGiaBan(),
          entity.getMoTa(),
          entity.getMaThuongHieu(),
          entity.getMaKieuDang(),
          entity.getMaXuatXu(),
          entity.getMaDeGiay()
        };
        XJdbc.executeUpdate(CreateSql, value);
        return entity;
    }

    @Override
    public void update(SanPham entity) {
          Object[] value = {
          entity.getTenSanPham(),
          entity.getGiaBan(),
          entity.getMoTa(),
          entity.getMaThuongHieu(),
          entity.getMaKieuDang(),
          entity.getMaXuatXu(),
          entity.getMaDeGiay(),
          entity.getMaSanPham()
        };
          XJdbc.executeUpdate(UpdateSql, value);
    }

    @Override
    public void deleteById(String id) {
        Object[] value = {id, id};
        XJdbc.executeUpdate(DeleteSql,value);
    }

    @Override
    public List<SanPham> findAll() {
       return XQuery.getBeanList(SanPham.class, findAllSql);
    }

    @Override
    public SanPham findById(String id) {
        return XQuery.getSingleBean(SanPham.class ,findById, id);
    }


    
}
