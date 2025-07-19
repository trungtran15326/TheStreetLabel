/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.KieuDang;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KieuDangDAO {
        String getAllSql = """
SELECT  [MaKieuDang]
                             ,[KieuDang]
                         FROM [The_Street_Label].[dbo].[KIEUDANG]
                    """;
    public List<KieuDang> getAll(){
        return XQuery.getBeanList(KieuDang.class, getAllSql);
    }
}
