package aula01;
public class Professor {
    
    String id;
    String nome;
    String materias;
    double salario;


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + "-" + nome;
    }
}
