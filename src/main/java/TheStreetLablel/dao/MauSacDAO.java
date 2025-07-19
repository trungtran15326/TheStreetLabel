/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheStreetLablel.dao;

import TheStreetLablel.model.MauSac;
import TheStreetLablel.util.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MauSacDAO {
        String getAllSql = """
SELECT [MaMauSac]
                             ,[MauSac]
                         FROM [The_Street_Label].[dbo].[MAUSAC]
                    """;
    public List<MauSac> getAll(){
        return XQuery.getBeanList(MauSac.class, getAllSql);
    }
}
