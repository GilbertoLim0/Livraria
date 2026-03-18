package org.example.Dao;

import org.example.Contract.CategoryContract;
import org.example.Model.Category;
import org.example.Util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoryDao implements CategoryContract {
    @Override
    public Boolean createCategory(Category category) throws SQLException {
        String sql =
                """
                    INSERT INTO categorys (nome) VALUES (?);
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.getName());
            stmt.executeUpdate();
            return true;
        }
    }

    @Override
    public List<Category> readCategory() throws SQLException {
        String sql =
                """
                    SELECT id, name= FROM categorys
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Category> categories = List.of();
            while(rs.next()) {
                Category category = new Category(
                        rs.getString("name"),
                        rs.getInt("id")
                );
                categories.add(category);
            }
            return categories;
        }
    }

    @Override
    public Category updateCategory(Category category) throws SQLException {
        String sql =
                """
                    UPDATE categorys
                    SET nome = ?
                    where id = ?
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.getName());
            stmt.setInt(2, category.getId());
            stmt.executeUpdate();
        }
        return null;
    }

    @Override
    public Boolean deleteCategory(Category category) throws SQLException {
        String sql =
                """
                DELETE FROM categorys WHERE id = ?;
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, category.getId());
            stmt.executeUpdate();
            return true;
        }
    }
}
