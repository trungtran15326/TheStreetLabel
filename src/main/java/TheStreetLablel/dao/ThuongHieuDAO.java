/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.sanpham.ThuongHieu;
import TheStreetLablel.util.XJdbc;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThuongHieuDAO {
    String getAllSql = """
                       SELECT [MaThuongHieu]
                             ,[TenThuongHieu]
                         FROM [The_Street_Label].[dbo].[THUONGHIEU]
                    """;
    public List<ThuongHieu> getAll(){
        return XQuery.getBeanList(ThuongHieu.class, getAllSql);
    }
}
