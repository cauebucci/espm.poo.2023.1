package aula03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Cliente> Listaclientes = new ArrayList<Cliente>();

        PessoaFisica pf1 = new PessoaFisica("Caue", "182781273283");
        PessoaJuridica pj1 = new PessoaJuridica("ESPM", "82738273");

        Listaclientes.add(pf1);
        Listaclientes.add(pj1);
        
        Listaclientes.forEach((k) -> System.out.println(k.toString()));
    }
}
