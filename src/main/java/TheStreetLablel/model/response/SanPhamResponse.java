/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.response;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamResponse {
        private String MaSanPham; 
	private String TenSanPham;
	private BigDecimal GiaBan;
	private String MoTa;
	private String TenThuongHieu;
	private String KieuDang;
	private String XuatXu;
        private String LoaiDeGiay;
}
