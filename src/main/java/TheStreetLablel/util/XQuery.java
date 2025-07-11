package TheStreetLablel.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Lớp tiện ích hỗ trợ truy vấn và chuyển đổi sang đối tượng
 *
 * @author NghiemN
 * @version 1.0
 */
public class XQuery {

    /**
     * Truy vấn 1 đối tượng
     *
     * @param <B> kiểu của đối tượng cần chuyển đổi
     * @param beanClass lớp của đối tượng kết quả
     * @param sql câu lệnh truy vấn
     * @param values các giá trị cung cấp cho các tham số của SQL
     * @return kết quả truy vấn
     * @throws RuntimeException lỗi truy vấn
     */
    
    
    public static <B> B getSingleBean(Class<B> beanClass, String sql, Object... values) {
        List<B> list = XQuery.getBeanList(beanClass, sql, values);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    /**
     * Truy vấn nhiều đối tượng
     *
     * @param <B> kiểu của đối tượng cần chuyển đổi
     * @param beanClass lớp của đối tượng kết quả
     * @param sql câu lệnh truy vấn
     * @param values các giá trị cung cấp cho các tham số của SQL
     * @return kết quả truy vấn
     * @throws RuntimeException lỗi truy vấn
     */
//     public static <B> List<B> getEntityList(Class<B> clazz, String sql, Object... args) {
//        List<B> list = new ArrayList<>();
//        try {
//            ResultSet rs = XJdbc.executeQuery(sql, args);
//            while (rs.next()) {
//                B entity = clazz.getDeclaredConstructor().newInstance();
//                for (Field field : clazz.getDeclaredFields()) {
//                    field.setAccessible(true);
//                    Object value = rs.getObject(field.getName());
//                    field.set(entity, value);
//                }
//                list.add(entity);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
    
    public static <B> List<B> getBeanList(Class<B> beanClass, String sql, Object... values) {
        List<B> list = new ArrayList<>();
        try {
            ResultSet resultSet = XJdbc.executeQuery(sql, values);
            while (resultSet.next()) {
                list.add(XQuery.readBean(resultSet, beanClass));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    /**
     * Tạo bean với dữ liệu đọc từ bản ghi hiện tại
     *
     * @param <B> kiểu của đối tượng cần chuyển đổi
     * @param resultSet tập bản ghi cung cấp dữ liệu
     * @param beanClass lớp của đối tượng kết quả
     * @return kết quả truy vấn
     * @throws RuntimeException lỗi truy vấn
     */
    private static <B> B readBean(ResultSet resultSet, Class<B> beanClass) throws Exception {
        B bean = beanClass.getDeclaredConstructor().newInstance();
        Method[] methods = beanClass.getDeclaredMethods();
        for(Method method: methods){
            String name = method.getName();
            if (name.startsWith("set") && method.getParameterCount() == 1) {
                try {
                    Object value = resultSet.getObject(name.substring(3));
                    method.invoke(bean, value);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SQLException e) {
                    System.out.printf("+ Column '%s' not found!\r\n", name.substring(3));
                }
            }
        }
        return bean;
    }
    
    public static void main(String[] args) {
//        demo1();
//        demo2();
    }

//    private static void demo1() {
//        String sql = "SELECT * FROM Users WHERE Username=? AND Password=?";
//        User user = XQuery.getSingleBean(User.class, sql, "NghiemN", "123456");
//    }
//
//    private static void demo2() {
//        String sql = "SELECT * FROM Users WHERE Fullname LIKE ?";
//        List<User> list = XQuery.getBeanList(User.class, sql, "%Nguyễn %");
//    }
}