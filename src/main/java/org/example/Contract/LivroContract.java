package org.example.Contract;

import org.example.Model.Livro;

import java.sql.SQLException;
import java.util.List;

public interface LivroContract {
    public Boolean createBook(Livro livro) throws SQLException;
    public List<Livro> readBook() throws SQLException;
    public Livro updateBook(Livro livro) throws SQLException;
    public Boolean deleteBook(Livro livro) throws SQLException;
}
