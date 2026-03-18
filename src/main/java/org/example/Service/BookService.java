package org.example.Service;

import org.example.Contract.BookContract;
import org.example.Contract.CategoryContract;
import org.example.Model.Book;
import org.example.Model.Category;

import java.sql.SQLException;

public class BookService {
    BookContract bk;
    public void triggerCreateBook(Book book) throws SQLException {
        bk.createBook(book);
    }
    public void triggerReadBook(Category categoryIdentifier) throws SQLException {
        bk.readBook(categoryIdentifier);
    }
    public void triggerUpdateBook(Book book) throws SQLException {
        bk.updateBook(book);
    }
    public void triggerDeleteBook(Book book) throws SQLException {
        bk.deleteBook(book);
    }

}
