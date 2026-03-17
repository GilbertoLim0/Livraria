package org.example.Model;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private Integer pages;
    private String synopsis;
    private Category category;

    public Book(Integer id, String name, String author, Integer pages, String synopsis, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.synopsis = synopsis;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return name;
    }
    public void setNome(String name) {
        this.name = name;
    }
    public String getAutor() {
        return author;
    }
    public void setAutor(String author) {
        this.author = author;
    }
    public Integer getPaginas() {
        return pages;
    }
    public void setPaginas(Integer pages) {
        this.pages = pages;
    }
    public String getSinapse() {
        return synopsis;
    }
    public void setSinapse(String synopsis) {
        this.synopsis = synopsis;
    }
    public Category getCategoria() {
        return category;
    }
    public void setCategoria(Category category) {
        this.category = category;
    }
}
