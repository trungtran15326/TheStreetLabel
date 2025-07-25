/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.model.taikhoan;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Huu
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Model_Account {
    private String MaTaiKhoan;
    private String Username;
    private String Password;
    private String MaNhanVien;
}
