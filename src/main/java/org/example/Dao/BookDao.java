package org.example.Dao;

import org.example.Contract.BookContract;
import org.example.Model.Book;

import java.sql.SQLException;
import java.util.List;

public class BookDao implements BookContract {
    @Override
    public Boolean createBook(Book book) throws SQLException {
        return null;
    }

    @Override
    public List<Book> readBook() throws SQLException {
        return List.of();
    }

    @Override
    public Book updateBook(Book book) throws SQLException {
        return null;
    }

    @Override
    public Boolean deleteBook(Book book) throws SQLException {
        return null;
    }
}
