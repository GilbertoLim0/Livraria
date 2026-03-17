package org.example.Dao;

import org.example.Contract.CategoryContract;
import org.example.Model.Category;

import java.sql.SQLException;
import java.util.List;

public class CategoryDao implements CategoryContract {
    @Override
    public Boolean createCategory(Category category) throws SQLException {
        return null;
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
