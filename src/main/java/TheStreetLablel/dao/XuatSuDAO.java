/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.sanpham.XuatSu;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class XuatSuDAO {
                String getAllSql = """
SELECT  [MaXuatXu]
      ,[XuatXu]
  FROM [The_Street_Label].[dbo].[XUATXU]
                    """;
    public List<XuatSu> getAll(){
        return XQuery.getBeanList(XuatSu.class, getAllSql);
    }
}
