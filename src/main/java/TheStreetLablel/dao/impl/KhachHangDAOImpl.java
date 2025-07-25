/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;



import TheStreetLablel.dao.KhachHangDAO;
import TheStreetLablel.model.khachhang.khachHang;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;

import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangDAOImpl implements KhachHangDAO {

    String findAll = """
                 SELECT *
                 FROM KHACHANG
                 """;
    String create = """
                    INSERT INTO [dbo].[KHACHANG]
                                                   ([MaKhachHang]
                                                   ,[TenKhachHang]
                                                   ,[GioiTinh]
                                                   ,[SoDienThoai]
                                                   ,[Email])
                                             VALUES
                                                   (?,?,?,?,?)
                    """;
    String update = """
                    UPDATE [dbo].[KHACHANG]
                                           SET [TenKhachHang] = ?
                                              ,[GioiTinh] = ?
                                              ,[SoDienThoai] = ?
                                              ,[Email] = ?
                                         WHERE [MaKhachHang] = ?
                    """;
    String deleteByMa = """
                        DELETE FROM [dbo].[KHACHANG]
                                                 WHERE [MaKhachHang]=?
                        """;
    String findById ="""
                     SELECT *
                                           FROM [dbo].[KHACHANG]
                                           WHERE [MaKhachHang] = ?
                     """;

    @Override
    public List<khachHang> findAll() {
        return XQuery.getBeanList(khachHang.class, findAll);
    }

    @Override
    public khachHang create(khachHang entity) {
        Object[] values ={
          entity.getMaKhachHang(),
                entity.getTenKhachHang(),
                entity.isGioiTinh(),
                entity.getSoDienThoai(),
                entity.getEmail()
        };
            XJdbc.executeUpdate(create, values);
        return entity;
                }

    @Override
    public void update(khachHang entity) {
        Object[] values ={

                entity.getTenKhachHang(),
                entity.isGioiTinh(),
                entity.getSoDienThoai(),
                entity.getEmail()
        };
            XJdbc.executeUpdate(update, values);
    }



    @Override
    public khachHang findById(String ma) {
        return XQuery.getSingleBean(khachHang.class,findById, ma);
    }

    @Override
    public void deleteById(String id) {
          XJdbc.executeUpdate(deleteByMa, id);
    }

 
}
