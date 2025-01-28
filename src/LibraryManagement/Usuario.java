package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;

    public Usuario(int id, String nome, String email, List<Livro> livrosEmprestados) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.livrosEmprestados = (livrosEmprestados != null) ? livrosEmprestados : new ArrayList<>();
    }

    public Usuario(int id, String nome, String email){
        this(id, nome, email, new ArrayList<>());
    }


    public void adicionarLivro(Livro livro){
        if (livro == null){
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }
        if (!livrosEmprestados.contains(livro)){
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Livro ja está com este usuário");
        }

    }

    public void removerLivro(Livro livro){
        if ( livro == null){
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }
        if (livrosEmprestados.contains(livro)){
            livrosEmprestados.remove(livro);
        }
        else {
            System.out.println("O livro não está com esse usuário");

        }

    }



    public void atualizarListaLivrosEmprestados(List<Livro> livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Usuario: {\n" +
                "    Id: " + id + "\n" +
                "    Nome: " + nome + "\n" +
                "    Email: " + email + "\n" +
                "    Livros emprestados: " + (livrosEmprestados.isEmpty() ? "Nenhum" : livrosEmprestados) + "\n" +
                "}\n";
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }







}
