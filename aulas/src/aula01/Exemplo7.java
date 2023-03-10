package aula01;
import java.util.Scanner;

public class Exemplo7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean alive = true;
        Sala sala = new Sala();

        do{
            System.out.print("s: ");
            String l = teclado.nextLine().trim();
            alive = !l.equalsIgnoreCase("exit");
            if(!alive) break;
            if(l.length() == 0){

            }else if(l.equalsIgnoreCase("help")){
                System.out.println("add student --> Adiciona um aluno");
                System.out.println("show --> Adiciona uma sala");
            } else if(l.equalsIgnoreCase("add studant")){
                System.out.print("Digite o nome do aluno: ");
                String nome = teclado.nextLine();
                Aluno aluno = new Aluno();
                aluno.nome = nome;
                sala.alunos.add(aluno);
            } else if(l.equalsIgnoreCase("show")){
                System.out.println(sala);
            }else{
                System.out.println("Comando inválido!");
            }
        }while(alive);
    }
}
