/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.giamgia;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DLC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GiamGia {
    private String MaGiamGia;
    private LocalDate NgayBatDau;
    private LocalDate NgayHetHan;
    private String LoaiGiam;
    private String MucGiamToiDa;
    private double Giatri;
    private String DieuKien;
    private Boolean TrangThai;
}
