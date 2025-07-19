/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.Size;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SizeDAO {
            String getAllSql = """
SELECT [MaSize]
      ,[Size]
  FROM [The_Street_Label].[dbo].[SIZE]
                    """;
    public List<Size> getAll(){
        return XQuery.getBeanList(Size.class, getAllSql);
    }
}
