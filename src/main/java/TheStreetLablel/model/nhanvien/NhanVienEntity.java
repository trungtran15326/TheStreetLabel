/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.nhanvien;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author DLC
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienEntity {
    private String MaNhanVien;
    private String HoTenNhanVien;
    private Boolean GioiTinh;
    private LocalDate NgaySinh;
    private String SoDienThoai;
    private String Email;
    private Boolean TrangThai;
    private String ChucVu;
    private String MaNQL;
}
