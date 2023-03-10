package aula03;

import java.util.UUID;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj){
        super(UUID.randomUUID().toString(), nome);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "{ \"ID:\" \"" + this.getId() 
            +  ",\"\"Nome:\" \"" + this.getNome() 
            + ", \"\"CNPJ:\" \"" + this.cnpj 
            + "\"}";
    }
}
