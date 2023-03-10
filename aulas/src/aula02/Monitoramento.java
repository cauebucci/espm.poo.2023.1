package aula02;

public class Monitoramento {
    
    private static double juros = 0.00378476705;

    public void cobrarJuros(Conta c) {
        if(c.getSaldo() < 0) {
            c.sacar(c.getSaldo() * -juros);
        }
    }
}
