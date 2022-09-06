package lista6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");

        float prestacao = 0, valor = 0, valortotal = 0;
        int cont = 0;
        while (true) {
            System.out.print("\nValor da prestação: ");
            prestacao = in.nextFloat();
            if (prestacao == 0) {
                break;
            }
            System.out.print("Dias atrasado: ");
            int dias = in.nextInt();
            valor = Exercicios.valorPagamento(prestacao, dias);
            System.out.println("Valor: " + df.format(valor) + " R$");
            cont++;
            valortotal += valor;
        }
        System.out.println("\nTotal de " + cont + " prestações pagas.");
        System.out.println("Valor total de prestações: " + df.format(valortotal) + " R$");
        in.close();
    }

}
