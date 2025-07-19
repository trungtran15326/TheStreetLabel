/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;


import TheStreetLablel.model.khachHang;


/**
 *
 * @author Admin
 */
public interface KhachHangController extends CrudController<khachHang>{
    void setForm(khachHang entity);
    khachHang getForm();
}
