/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.khachhang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class khachHang {
    private String MaKhachHang; 
    private String TenKhachHang; 
    private boolean GioiTinh; 
    private String SoDienThoai; 
    private String Email; 
    
}
