package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private List<string> subcategorias;

    public Caregoria(String nome, long id){
        this.id = id;
        this.nome = nome;
        this.subcategorias = new ArrayList<String>();
    }

    //Construtor vazio
    public Categoria(){

    }

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public adicionarCategoria(String subcategoria){
        // Adiciona a nova subcategoria à lista de subcategorias
        subcategorias.add(subcategoria);
    }

    //Como chamar?
    //Categoria minhaCategoria = new Categoria("Eletrônicos");
    //minhaCategoria.adicionarCategoria("Celulares");
    //minhaCategoria.adicionarCategoria("Tablets");

    public atualizarCategoria(String novoNome){
        this.nome = novoNome;
    }
}