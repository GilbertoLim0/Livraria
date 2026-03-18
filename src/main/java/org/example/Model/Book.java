package org.example.Model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Integer pages;
    private Boolean read;
    private String premiumContent;
    private Category category;

    public Book(Integer id, String title, String author, Boolean read, Integer pages, String premiumContent, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.read = read;
        this.premiumContent = premiumContent;
        this.category = category;
    }
    public Book(Integer id, String title, String author, Boolean read, Integer pages, String premiumContent) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.read = read;
        this.premiumContent = premiumContent;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public String getpremiumContent() {
        return premiumContent;
    }
    public void setpremiumContent(String premiumContent) {
        this.premiumContent = premiumContent;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
