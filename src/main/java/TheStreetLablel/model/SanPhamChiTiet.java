/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model;

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
public class SanPhamChiTiet {
        private	String MaSanPhamCT ;
	private boolean TrangThai;
	private Integer SoLuong ;
	private String MaSanPham;
	private String MaMauSac; 
	private String MaSize ;
}
