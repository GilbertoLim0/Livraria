package org.example.Contract;
import org.example.Model.Book;
import org.example.Model.Category;

import java.sql.SQLException;
import java.util.List;

public interface BookContract {
    public Boolean createBook(Book book) throws SQLException;
    public List<Book> readBook(Category categoryIdentifier) throws SQLException;
    public Book updateBook(Book book) throws SQLException;
    public Boolean deleteBook(Book book) throws SQLException;
}
