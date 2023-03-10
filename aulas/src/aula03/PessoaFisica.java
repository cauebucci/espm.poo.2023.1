package aula03;

import java.util.UUID;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String cpf){
        super(UUID.randomUUID().toString(), nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{ \"ID:\" \"" + this.getId() + "\""
            +  ",\"Nome: \"" + this.getNome() 
            + ", \"CPF: \"" + this.cpf
            + "}";
    }
}
