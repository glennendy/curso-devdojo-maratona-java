package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double é 0
        //Char é \u0000
        //Boolean é false
        //String é null

        String[] nomes = new String[3];
        nomes[0] = "Pedro";
        nomes[1] = "José";
        nomes[2] = "João";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
