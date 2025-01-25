package LibraryManagement;

import java.util.List;

public class Biblioteca {


    private List<Livro> livrosDisponiveis;
    private List<Usuario> usuariosCadastrados;

    public Biblioteca(List<Livro> livrosDisponiveis, List<Usuario> usuariosCadastrados){
        this.livrosDisponiveis = livrosDisponiveis;
        this.usuariosCadastrados = usuariosCadastrados;
    }


    public void cadastrarLivro(String titulo, String autor, int anoPublicacao){
        Livro novoLivro = new Livro(livrosDisponiveis.size() + 1, titulo, autor, anoPublicacao, true);

        livrosDisponiveis.add(novoLivro);
    }

    public void cadastrarUsuario(String nome, String email){
        Usuario novoUsuario = new Usuario(usuariosCadastrados.size() + 1, nome, email);

        usuariosCadastrados.add(novoUsuario);
    }


    public void emprestarLivro(Usuario usuario, Livro livro){
        if (usuario.getLivrosEmprestados().size() >= 3){
            System.out.println("O usuário não pode alugar mais que 3 livros");
            return;
        }


        if (!livro.isDisponivel()){
            System.out.println("Livro indisponivel");
            return;
        }

        usuario.adicionarLivro(livro);
        livro.setDisponivel(false);
        System.out.println("Livro emprestado com sucesso!");


    }


    public void devolverLivro(Usuario usuario, Livro livro){

        if(!usuario.getLivrosEmprestados().contains(livro)){
            System.out.println("O usuário não está com este livro");
            return;
        }

        if(livro.isDisponivel()){
            System.out.println("O livro consta como disponível, confira o último emprestimo");
            return;
        }

        usuario.removerLivro(livro);
        livro.setDisponivel(true);

        System.out.println("Livro devolvido com sucesso");





    }




}
