package aula01;
public class Exemplo3 {
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.desc = "3semestre";

        Professor p1 = new Professor();
        p1.nome = "AA";

        Professor p2 = new Professor();
        p2.nome = "BB";
        

        System.out.println(p1 == p2 ? "==" : "=!");
    }
}
