package Exercicios02.Exercicio1;

import java.util.UUID;

public class Cliente {
    private String id = null;
    private String nome = null;
    private String cpf = null;
    private Cartao cartao = null;

    public Cliente(String nome, String cpf) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.cpf = cpf;
    }

   public String getCpf() {
       return cpf;
   }

   public String getId() {
       return id;
   }

   public String getNome() {
       return nome;
   }

    
}
