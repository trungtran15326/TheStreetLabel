/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;

import TheStreetLablel.model.giamgia.GiamGia;

/**
 *
 * @author DLC
 */
public interface GiamGiaController extends CrudController<GiamGia>{
    void setForm(GiamGia entity); // Hiển thị thực thể lên form
GiamGia getForm(); // Tạo thực thể từ dữ liệu form
}
