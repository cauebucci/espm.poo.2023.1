package aula02;
 
public class Main {
    public static void main(String[] args) {
        Monitoramento monitoramento = new Monitoramento();
        Conta c1 = new Conta("c1");
        c1.setId("2893892");
        c1.sacar(1000);

        System.out.println(c1.getSaldo());

        monitoramento.cobrarJuros(c1);

        System.out.println(c1.getSaldo());

    }    
}
