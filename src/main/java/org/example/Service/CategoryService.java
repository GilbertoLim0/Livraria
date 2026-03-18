package org.example.Service;

import org.example.Contract.CategoryContract;
import org.example.Model.Category;

import java.sql.SQLException;

public class CategoryService {
    CategoryContract cc;
    public void triggerCreateCategory(Category category) throws SQLException {
        cc.createCategory(category);
    }
    public void triggerReadCategory() throws SQLException {
        cc.readCategory();
    }
    public void triggerUpdateCategory(Category category) throws SQLException {
        cc.updateCategory(category);
    }
    public void triggerDeleteCategory(Category category) throws SQLException {
        cc.deleteCategory(category);
    }
}
