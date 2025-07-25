/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.sanpham.DeGiay;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DeGiayDAO {
            String getAllSql = """
SELECT  [MaDeGiay]
      ,[LoaiDeDay]
  FROM [The_Street_Label].[dbo].[DEGIAY]
                    """;
    public List<DeGiay> getAll(){
        return XQuery.getBeanList(DeGiay.class, getAllSql);
    }
}
