package aula01;
public class Exemplo2 {
    public static void main(String[] args) {
        
        String x = "Bom Dia";
        String y = "Bom ";
        y += "Dia";

        System.out.println(x + (x.equals(y) ? " == " : " != ") + y);
    }
}
