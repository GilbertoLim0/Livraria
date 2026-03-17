package org.example.Model;

public class Livro {
    private Integer id;
    private String nome;
    private String autor;
    private Integer paginas;
    private String sinapse;
    private Categoria categoria;

    public Livro(Integer id, String nome, String autor, Integer paginas, String sinapse, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
        this.sinapse = sinapse;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    public String getSinapse() {
        return sinapse;
    }
    public void setSinapse(String sinapse) {
        this.sinapse = sinapse;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
