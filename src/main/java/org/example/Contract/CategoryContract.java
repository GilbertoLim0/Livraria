package org.example.Contract;
import org.example.Model.Category;
import java.sql.SQLException;
import java.util.List;

public interface CategoryContract {
    public Boolean createCategory(Category category) throws SQLException;
    public List<Category> readCategory() throws SQLException;
    public Category updateCategory(Category category) throws SQLException;
    public Boolean deleteCategory(Category category) throws SQLException;
}
