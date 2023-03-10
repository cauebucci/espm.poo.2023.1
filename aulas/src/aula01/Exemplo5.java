package aula01;
public class Exemplo5 {
    public static void main(String[] args) {
        Professor p1 = new Professor();

        p1.id = "4466";
        p1.nome = "Humberto";
        p1.salario = 12.00;
        
        Aluno a1 = new Aluno();
        a1.id = "4454";
        a1.nome = "Lucas";

        Aluno a2 = new Aluno();
        a2.id = "3232";
        a2.nome = "Caue";

        Sala sala = new Sala();
        sala.desc = "LAB3AB";
        sala.professor = p1;
        sala.alunos.add(a1);
        sala.alunos.add(a2);
        
        System.out.println(sala.toString());
    }
}
