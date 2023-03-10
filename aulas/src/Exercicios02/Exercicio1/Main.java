package Exercicios02.Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Cliente>clientePorId = new HashMap<>();
        HashMap<String, Cliente>clientePorCPF = new HashMap<>();
        boolean alive = true;

        do{
            System.out.print("c: ");
            String l = teclado.nextLine().trim();
            if(l.length() == 0) {

            }else if(l.equalsIgnoreCase("create client")) {
                System.out.print("Informe o nome: ");
                String nome = teclado.nextLine().trim();
                System.out.print("Informe o CPF: ");
                String cpf = teclado.nextLine().trim();
                Cliente cliente = new Cliente(nome, cpf);
                clientePorCPF.put(cliente.getCpf(), cliente);
                clientePorId.put(cliente.getId(), cliente);
                System.out.println("Cliente criado com sucesso!");

            }else if(l.equalsIgnoreCase("register card")){
                String cpf = teclado.nextLine().trim();

            }else if(l.equalsIgnoreCase("exit")){
                alive = false;
            }
        }while(alive);
   } 
}
