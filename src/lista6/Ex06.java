package lista6;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int teste = 1, hora = 0, min = 0;
        do {
            do {
                System.out.print("Hora: ");
                hora = in.nextInt();
                System.out.print("Minuto: ");
                min = in.nextInt();
                if (hora > 24 || hora < 0 || min > 59 || min < 0) {
                    System.out.println("Hora inválida!!!\n");
                }
            } while ((hora < 0 || hora > 24) || (min < 0 || min > 59));
            System.out.println(Exercicios.conversao(hora, min));
            {
                System.out.println("\n[1] Para continuas, [2] Para sair");
                teste = in.nextInt();
            }
        } while (teste != 2);
        System.out.println("Finalizado.");
        in.close();
    }

}
