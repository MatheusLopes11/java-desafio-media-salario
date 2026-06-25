import java.util.Scanner;
import java.util.Locale;

public class CalculoMediaSalarios {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("SISTEMA DE CÁLCULO DE MÉDIA DE SALÁRIOS");
        System.out.println("--------------------------------------- \n");

        System.out.printf("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("\n");

        System.out.printf("Olá %s! %n%nDigite o Primeiro Salário: ", nome);
        String salario1 = entrada.nextLine();

        System.out.print("\n");

        System.out.print("Digite o segundo salário: ");
        String salario2 = entrada.nextLine();

        System.out.print("\n");

        System.out.print("Digite o terceiro" +
                " salário: ");
        String salario3 = entrada.nextLine();

        System.out.print("\n");

        System.out.println("Processando ...");

        System.out.print("\n");

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);

        double media = (sal1 + sal2 + sal3) / 3;

        System.out.printf("Média: %.2f", media);

        entrada.close();

    }
}
