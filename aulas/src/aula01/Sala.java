package aula01;
import java.util.HashSet;
import java.util.Set;

public class Sala {
    
    String desc;
    Professor professor;
    Set<Aluno> alunos = new HashSet<Aluno>();


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{ \"Nome\": " + desc
        + "} { \"Professor\": " + professor + "}"
        + "} { \"Alunos\": " + alunos + "}";
    }
}
