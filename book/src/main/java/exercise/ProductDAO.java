package exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import dao.DAO;

public class ProductDAO extends DAO {

    public List<Product> search(String keyword) throws Exception {
        List<Product> list = new ArrayList<>();

        Connection con = getConnection();

        PreparedStatement st = con.prepareStatement(
                "select * from product where name like ?");
        st.setString(1, "%" + keyword + "%");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setPrice(rs.getInt("price"));
            list.add(p);
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }

    public int insert(Product product) throws Exception {
        Connection con = getConnection();

        PreparedStatement st = con.prepareStatement(
                "insert into product(name,price) values(?,?)");
        st.setString(1, product.getName());
        st.setInt(2, product.getPrice());
        int line = st.executeUpdate();

        st.close();
        con.close();
        return line;
    }

    public boolean insertWithCheck(String name, int price) throws Exception {

        Connection con = getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement st = con.prepareStatement(
                    "insert into product(name,price) values(?,?)");
            st.setString(1, name);
            st.setInt(2, price);
            st.executeUpdate();
            st.close();

            st = con.prepareStatement(
                    "select count(*) from product where name=?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();

            rs.next();
            int count = rs.getInt(1);

            rs.close();
            st.close();

            if (count == 1) {
                con.commit();
                return true;
            } else {
                con.rollback();
                return false;
            }

        } finally {
            con.setAutoCommit(true);
            con.close();
        }
    }
}

