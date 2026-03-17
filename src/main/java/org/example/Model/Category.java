package org.example.Model;

public class Category {
    private String name;
    private Integer id;

    public Category(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getNome() {
        return name;
    }
    public void setNome(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
