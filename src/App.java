import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = sc.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota4 = sc.nextInt();
        
        sc.close();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das notas é: "+media);
    }
}