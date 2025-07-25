/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.HoaDonDAO;
import TheStreetLablel.model.hoadon.HoaDon;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDAOImpl implements HoaDonDAO{

       String CreateSql = """
INSERT INTO [dbo].[HOADON]
                                  ([MaHoaDon]
                                  ,[DonGia]
                                  ,[TongSoLuongSP]
                                  ,[TongSoTien]
                                  ,[TrangThai]
                                  ,[MaGiamGia]
                                  ,[MaNhanVien]
                                  ,[MaKhachHang])
                            VALUES
                                  (?,?,?,?,?,?,?,?)
                       """;
    
    String UpdateSql = """
UPDATE [dbo].[HOADON]
                          SET 
                             [DonGia] = ?
                             ,[TongSoLuongSP] = ?
                             ,[TongSoTien] = ?
                             ,[TrangThai] = ?
                             ,[MaGiamGia] = ?
                             ,[MaNhanVien] = ?
                             ,[MaKhachHang] = ?
                        WHERE [MaHoaDon] = ?
                       """;
    
    String DeleteSql = """
DELETE FROM HOADONCHITIET
                       WHERE MaHoaDon = ?
                       
                       DELETE FROM [dbo].[HOADON]
                       WHERE MaHoaDon = ?
                       """;
    String findAllSql = """
SELECT [MaHoaDon]
                           ,[DonGia]
                           ,[TongSoLuongSP]
                           ,[TongSoTien]
                           ,[TrangThai]
                           ,[MaGiamGia]
                           ,[MaNhanVien]
                           ,[MaKhachHang]
                       FROM [The_Street_Label].[dbo].[HOADON]
                     """;
    String findById = """
SELECT [MaHoaDon]
                           ,[DonGia]
                           ,[TongSoLuongSP]
                           ,[TongSoTien]
                           ,[TrangThai]
                           ,[MaGiamGia]
                           ,[MaNhanVien]
                           ,[MaKhachHang]
                       FROM [The_Street_Label].[dbo].[HOADON]
                      Where [MaHoaDon] = ?
                      """;

    @Override
    public HoaDon create(HoaDon entity) {
        Object[] value = {
          entity.getMaHoaDon(),
            entity.getDonGia(),
            entity.getTongSoLuongSP(),
            entity.getTongSoTien(),
            entity.isTrangThai(),
            entity.getMaGiamGia(),
            entity.getMaNhanVien(),
            entity.getMaKhachHang()
        };
        XJdbc.executeUpdate(CreateSql, value);
        return  entity;
    }

    @Override
    public void update(HoaDon entity) {
          Object[] value = {

            entity.getDonGia(),
            entity.getTongSoLuongSP(),
            entity.getTongSoTien(),
            entity.isTrangThai(),
            entity.getMaGiamGia(),
            entity.getMaNhanVien(),
            entity.getMaKhachHang(),
                       entity.getMaHoaDon()
        };
        XJdbc.executeUpdate(UpdateSql, value);
    }

    @Override
    public void deleteById(String id) {
        Object[] values = {id, id};
        XJdbc.executeUpdate(DeleteSql, values);
    }

    @Override
    public List<HoaDon> findAll() {
        return XQuery.getBeanList(HoaDon.class, findAllSql);
    }

    @Override
    public HoaDon findById(String id) {
        return XQuery.getSingleBean(HoaDon.class, findById, id);
    }
    
    
    
    
  
    
}
