package kr.co.hongjong.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.hongjong.todo.dto.Todo;


public class TodoDao {
    private static final String dburl = "jdbc:mysql://localhost:3306/test_db?useSSL=false";
    private static final String dbUser = "root";
    private static final String dbpwd = "kbank1234!";

    public Todo getTodo(Integer todoId) {
        Todo todo = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, dbUser, dbpwd);
            String sql = "SELECT * FROM items WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, todoId);
            rs = ps.executeQuery();

            if(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer price = rs.getInt("price");
                String imgPath = rs.getString("img_path");

                todo = new Todo(id, name, price, imgPath);
            }

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(rs != null) {
                try {
                    rs.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null) {
                try {
                    ps.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return todo;
    }

}
