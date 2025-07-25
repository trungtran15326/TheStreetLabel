/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.AccountDAO;
import TheStreetLablel.model.taikhoan.Model_Account;

import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Huu
 */
public class AccounDAOImpl implements AccountDAO {
    String getAllSQL = """
                       SELECT TK.MaTaiKhoan, TK.Username, TK.Password, NV.MaNhanVien
                       FROM TAIKHOAN TK
                       LEFT JOIN NHANVIEN NV ON TK.MaNhanVien = NV.MaNhanVien
                       """;
    public List<Model_Account> getAll(){
        return XQuery.getBeanList(Model_Account.class, getAllSQL);
    }

    String createSQL = """
                       INSERT INTO TAIKHOAN (MaTaiKhoan, Username, Password, MaNhanVien)
                       VALUES (?, ?, ?, ?)
                       """; 
    String updateSQL = """
                       UPDATE TAIKHOAN  
                       SET Username = ?, Password = ?, MaNhanVien = ?
                       WHERE MaTaiKhoan = ?
                       """;
    String deleteByID = """
                        DELETE FROM TAIKHOAN
                        WHERE MaTaiKhoan = ?
                        """;
    String findByID = """
                        SELECT * FROM TAIKHOAN TK
                        LEFT JOIN NHANVIEN NV ON TK.MaNhanVien = NV. MaNhanVien;
                        WHERE MaTaiKhoan = ?
                      """;



    @Override
    public Model_Account create(Model_Account entity) {
        Object [] values = {
            entity.getMaTaiKhoan(),
            entity.getUsername(),
            entity.getPassword(),
            entity.getMaNhanVien()
        };
        XJdbc.executeUpdate(createSQL, values);
        return entity;
    }
    @Override
    public void update(Model_Account entity) {
        Object [] values = {
            entity.getUsername(),
            entity.getPassword(),
            entity.getMaNhanVien(),
            entity.getMaTaiKhoan()

        };
        XJdbc.executeUpdate(updateSQL, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByID, id);
    }

    @Override
    public Model_Account findById(String id) {
       return  XQuery.getSingleBean(Model_Account.class,findByID, id);
    }

    @Override
    public List<Model_Account> findAll() {
        return XQuery.getBeanList(Model_Account.class, getAllSQL);
    }



    
}
