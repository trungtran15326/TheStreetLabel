/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.hoadon;


import java.time.LocalDate;


import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Data

public class HoaDonChiTiet {
    	private String MaHoaDonCT ;
	private  LocalDate ngayMua ;
	private String MaHoaDon;
	private String MaSanPhamCT;
}
