package LibraryManagement;

import java.util.Date;

public class Livro {


    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;


    public Livro(
            int id,
            String titulo,
            String autor,
            int anoPublicacao,
            boolean disponibilidade
    ){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = disponibilidade;

    }

    @Override
    public String toString() {
        return "Livro\n" +
                "{\n" +
                "    id: " + id + "\n" +
                "    Titulo: " + titulo + "\n" +
                "    Autor: " + autor + "\n" +
                "    Ano de publicação: " + anoPublicacao + "\n" +
                "    Disponível: " + (disponibilidade ? "Sim" : "Não") + "\n" +
                "}";
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponivel(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }



}
