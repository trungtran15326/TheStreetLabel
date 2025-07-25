/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao.impl;

import TheStreetLablel.dao.NhanVienDao;
import TheStreetLablel.model.nhanvien.NhanVienEntity;

import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author DLC
 */
public class NhanVienDaoImpl implements NhanVienDao {

    String findAll = """
    SELECT 
        MaNhanVien AS MaNhanVien,
        HoTenNhanVien AS HoTenNhanVien,
        GioiTinh AS GioiTinh,
        NgaySinh AS NgaySinh,
        SoDienThoai AS SoDienThoai,
        Email AS Email,
        TrangThai AS TrangThai,
        ChucVu AS ChucVu,
        MaNQL AS MaNQL
    FROM NhanVien
    """;

    String create = """
                        INSERT INTO NhanVien(
                        MaNhanVien,
                        HoTenNhanVien,
                        GioiTinh,
                        NgaySinh,
                        SoDienThoai,
                        Email,
                        TrangThai,
                        ChucVu,
                        MaNQL
                        )
                        VALUES (?,?,?,?,?,?,?,?,?)
                        """;
    String update = """
                        UPDATE NhanVien
                        SET 
                        HoTenNhanVien = ?,
                        GioiTinh = ?,
                        NgaySinh = ?,
                        SoDienThoai = ?,
                        Email = ?,
                        TrangThai = ?,
                        ChucVu = ?,
                        MaNQL = ?
                        WHERE MaNhanVien = ?


                        """;
    String deleteByMa = """
                            DELETE FROM NHANVIEN
                            WHERE MaNhanVien = ?
                            """;
    String findById = """
                          SELECT *
                          FROM NHANVIEN
                          WHERE MaNhanVien = ?
                          """;

    @Override
    public NhanVienEntity create(NhanVienEntity entity) {
        Object[] values = {
            entity.getMaNhanVien(),
            entity.getHoTenNhanVien(),
            entity.getGioiTinh(),
            entity.getNgaySinh(),
            entity.getSoDienThoai(),
            entity.getEmail(),
            entity.getTrangThai(),
            entity.getChucVu(),
            entity.getMaNQL()
        };
        XJdbc.executeUpdate(create, values);
        return entity;
    }

    @Override
    public void update(NhanVienEntity entity) {
        Object[] values = {
            entity.getHoTenNhanVien(),
            entity.getGioiTinh(),
            entity.getNgaySinh(),
            entity.getSoDienThoai(),
            entity.getEmail(),
            entity.getTrangThai(),
            entity.getChucVu(),
            entity.getMaNQL(),
            entity.getMaNhanVien()
        };
        XJdbc.executeUpdate(update, values);

    }



    @Override
    public NhanVienEntity findById(String ma) {
        return XQuery.getSingleBean(NhanVienEntity.class, findById, ma);
    }

    @Override
    public List<NhanVienEntity> findAll() {
        return XQuery.getBeanList(NhanVienEntity.class, findAll);
    }

    @Override
    public void deleteById(String id) {
             XJdbc.executeUpdate(deleteByMa, id);
    }

}
