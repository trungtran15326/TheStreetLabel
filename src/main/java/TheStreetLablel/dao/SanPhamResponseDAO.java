/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.SanPhamResponse;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamResponseDAO {
    String getAllSql = """
                      SELECT SP.MaSanPham
                            ,SP.TenSanPham
                            ,SP.GiaBan AS GiaBan
                            ,SP.MoTa
                            ,TH.TenThuongHieu
                            ,KD.KieuDang
                            ,DG.LoaiDeDay AS LoaiDeGiay
                            ,XX.XuatXu
                        FROM [The_Street_Label].[dbo].[SANPHAM] SP
                        LEFT JOIN THUONGHIEU TH ON TH.MaThuongHieu = SP.MaThuongHieu
                        LEFT JOIN KIEUDANG KD ON KD.MaKieuDang = SP.MaKieuDang
                        LEFT JOIN XUATXU XX ON XX.MaXuatXu = SP.MaXuatXu
                        LEFT JOIN DEGIAY DG ON DG.MaDeGiay = SP.MaDeGiay
                       
                       """;
    
    public List<SanPhamResponse> getAll(){
        return XQuery.getBeanList(SanPhamResponse.class, getAllSql);
    }
}
