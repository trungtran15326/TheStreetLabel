/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.hoadon;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Admin
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HoaDon {
	private String MaHoaDon;
	private String DonGia;
	private Integer TongSoLuongSP;
	private String TongSoTien;
	private boolean TrangThai;
	private String MaGiamGia;
	private String MaNhanVien;
	private String MaKhachHang;

}
