package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        byte dia = 8;
        switch (dia){
            case 1:
                System.out.println("Domingo, não é dia útil");
                break;
            case 2:
                System.out.println("segunda, dia útil");
                break;
            case 3:
                System.out.println("terça, dia útil");
                break;
            case 4:
                System.out.println("quarta, dia útil");
                break;
            case 5:
                System.out.println("quinta, dia útil");
                break;
            case 6:
                System.out.println("sexta, dia útil");
                break;
            case 7:
                System.out.println("sábado, não é dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
