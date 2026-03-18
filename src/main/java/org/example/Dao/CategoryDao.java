package org.example.Dao;

import org.example.Contract.CategoryContract;
import org.example.Model.Category;
import org.example.Util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CategoryDao implements CategoryContract {
    @Override
    public Boolean createCategory(Category category) throws SQLException {
        String sql = """
                INSERT (nome) INTO categorys VALUES (?);
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
        return List.of();
    }

    @Override
    public Category updateCategory() throws SQLException {
        return null;
    }

    @Override
    public Boolean deleteCategory() throws SQLException {
        return null;
    }
}
