/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;


import TheStreetLablel.model.nhanvien.NhanVienEntity;

/**
 *
 * @author DLC
 */
public interface NhanVienController extends CrudController<NhanVienEntity>{
    void setForm(NhanVienEntity entity); // Hiển thị thực thể lên form
     NhanVienEntity getForm(); // Tạo thực thể từ dữ liệu form
     void edit();
}
