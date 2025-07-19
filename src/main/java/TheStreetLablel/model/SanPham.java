/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    	private String MaSanPham; 
	private String TenSanPham;
	private BigDecimal GiaBan;
	private String MoTa;
	private String MaThuongHieu;
	private String MaKieuDang;
	private String MaXuatXu;
        private String MaDeGiay;
}
