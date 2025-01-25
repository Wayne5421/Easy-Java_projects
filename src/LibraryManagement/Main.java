package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Livro> livrosDisponiveis = new ArrayList<>();
        List<Usuario> usuariosCadastrados = new ArrayList<>();


        Biblioteca biblioteca = new Biblioteca(livrosDisponiveis, usuariosCadastrados);


        biblioteca.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        biblioteca.cadastrarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        biblioteca.cadastrarLivro("A Game of Thrones", "George R.R. Martin", 1996);


        biblioteca.cadastrarUsuario("João", "joao@example.com");
        biblioteca.cadastrarUsuario("Maria", "maria@example.com");


        System.out.println("Livros Disponíveis: ");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }


        System.out.println("\nUsuários Cadastrados: ");
        for (Usuario usuario : usuariosCadastrados) {
            System.out.println(usuario);
        }


        Usuario usuarioJoao = usuariosCadastrados.get(0);
        Usuario usuarioMaria = usuariosCadastrados.get(1);

        Livro livro1 = livrosDisponiveis.get(0);
        Livro livro2 = livrosDisponiveis.get(1);
        Livro livro3 = livrosDisponiveis.get(2);


        biblioteca.emprestarLivro(usuarioJoao, livro1);


        biblioteca.emprestarLivro(usuarioMaria, livro2);


        biblioteca.emprestarLivro(usuarioJoao, livro2);


        System.out.println("\nApós empréstimos:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }

        for (Usuario usuario : usuariosCadastrados) {
            System.out.println(usuario);
        }


        biblioteca.devolverLivro(usuarioJoao, livro1);


        System.out.println("\nApós devolução:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }

        for (Usuario usuario : usuariosCadastrados) {
            System.out.println(usuario);
        }
    }
}