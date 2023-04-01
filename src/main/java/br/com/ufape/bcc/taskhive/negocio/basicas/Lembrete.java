package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Lembrete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private LocalDate data;

    //Construtor vazio
    public Lembrete(){

    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Date getdate(){
        return data;
    }

    public void setDate(Date data){
        this.data = data;
    }

    public adicionarLembrete(String titulo, LocalDate data){
        Lembrete novoLembrete = new Lembrete(titulo, data);
    }

    //Como adicionar?
    /* Lembrete.adicionarLembrete("Reunião com o cliente", "Discutir proposta de projeto", 
    LocalDate.of(2023, 4, 3)); */

}