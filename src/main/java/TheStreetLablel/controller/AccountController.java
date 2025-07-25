/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.controller;

import TheStreetLablel.model.taikhoan.Model_Account;



/**
 *
 * @author Huu
 */
public interface AccountController extends CrudController<Model_Account> {
   Model_Account getForm(); // Tạo thực thể từ dữ liệu form
}
