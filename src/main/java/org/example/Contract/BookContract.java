package org.example.Contract;

import org.example.Model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookContract {
    public Boolean createBook(Book book) throws SQLException;
    public List<Book> readBook() throws SQLException;
    public Book updateBook(Book book) throws SQLException;
    public Boolean deleteBook(Book book) throws SQLException;
}
