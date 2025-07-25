/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TheStreetLablel.dao;


import TheStreetLablel.model.taikhoan.Model_Account;
import java.util.List;

/**
 *
 * @author Huu
 */
public interface AccountDAO extends CrudDAO<Model_Account, String> {
    List<Model_Account> findAll();
}
