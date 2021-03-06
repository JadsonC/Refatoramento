
package Model.DAO;

import Model.Livro;
import java.util.ArrayList;


public class LivroDAO {

    public void insert(Livro livro){
        Banco.livro.add(livro);
        System.out.println(Banco.livro.size());
    }

    public ArrayList<Livro> selectAll(){
        return Banco.livro;
    }
    
    public void mostrarNomeLivro(String nome){
        for(int i =0; i < 300; i++) {
            System.out.println("\n");
        }        
        for(int i = 0; i < Banco.livro.size(); i++) {
            Livro livroLista = Banco.livro.get(i);
            if(verificaNome(livroLista, nome)){
                System.out.println(livroLista.tituloLivro + " - " + livroLista.autorLivro + "," + livroLista.ano);
                break;
            }
        }
    }
    
    public void mostrarLivroPorGenero(String genero){        
        for(int i = 0; i < 300; i++){
            System.out.println("\n");
        }        
        for(int i = 0; i < Banco.livro.size(); i++){
            if(generosSaoIguais(Banco.livro.get(i), genero)){
                System.out.println((Banco.livro.get(i).tituloLivro));
            }
        }        
    }

    public boolean generosSaoIguais(Livro livro, String genero){
        return livro.generoLivro.equals(genero);
    }
    
    public boolean verificaNome(Livro livro, String nome){
        return livro.tituloLivro.equals(nome);
    }
}
