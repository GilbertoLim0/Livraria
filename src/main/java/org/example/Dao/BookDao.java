package org.example.Dao;

import org.example.Contract.BookContract;
import org.example.Model.Book;
import org.example.Util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDao implements BookContract {
    @Override
    public Boolean createBook(Book book) throws SQLException {
        String sql =
                """
                    INSERT INTO books (
                      title,
                        author,
                          pages,
                            read,
                              premium_content,
                                id_category
                    )
                    VALUES ('titulo', 'jef', 10, True, 'dandanda', 1);
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setInt(3, book.getPages());
            stmt.setBoolean(4, book.getRead());
            stmt.setString(5, book.getpremiumContent());
            stmt.setInt(6, book.getCategory().getId());
            stmt.executeUpdate();
            return true;
        }
    }

    @Override
    public List<Book> readBook() throws SQLException {
        String sql =
                """
                    SELECT bk.id,
                            bk.title,
                              bk.author,
                               bk.read,
                                bk.pages,
                                 bk.premium_content,
                                  c.name
                    FROM books bk
                    JOIN categorys c
                    ON c.id = bk.id_category;
                """;
        try(Connection conn = DB.access()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Book book = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getBoolean("read"),
                        rs.getInt("pages"),
                        rs.getString("premium_content")
                );
                Integer categoryIdentifier = rs.getInt("id_category");

            }

        }
        return List.of();
    }

    @Override
    public Book updateBook(Book book) throws SQLException {
        String sql =
                """
                    UPDATE books
                    set title = ?,
                          author = ?,
                            read = ?,
                              pages = ?,
                                premium_content = ?,
                                  id_category = ?
                    from categorys c
                    where c.id = books.id_category AND id = ?
                """;
        return null;

    }

    @Override
    public Boolean deleteBook(Book book) throws SQLException {
        String sql =
                """
                    DELETE FROM books
                    WHERE id = ?
                """;
        return null;
    }
}
