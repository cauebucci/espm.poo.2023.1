package aula01;

public class Exemplo1 {
    public static void main(String[] args) {
        String x = "Bom Dia";
        String y = "Bom ";
        y += "Dia";

        if(x.equals(y)) {
            System.out.println(x + " == " + y);
            
        }else{
            System.out.println(x + " != " + y);
        }
    }
}
