package lista6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class Exercicios {

    public static String ex01(int a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(i);
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public static String ex02(int a) {
        StringBuilder sb = new StringBuilder();
        int cont = 1, inicio = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static double ex03(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public static char ex04(double n1) {
        if (n1 > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static double ex05(float por, double custo) {
        float p = por / 100;
        float novopreco = (float) (custo + (custo * p));
        return novopreco;
    }

    public static String conversao(int hora, int min) {  //Ex06.java
        StringBuilder sb = new StringBuilder();
        String ampm = "";
        if (hora == 24) {
            sb.append("00");
            sb.append(":");
            sb.append(min);
            ampm = " AM";
        } else if (hora > 12) {
            hora -= 12;
            sb.append(hora);
            sb.append(":");
            sb.append(min);
            ampm = " PM";
        } else {
            sb.append(hora);
            sb.append(":");
            sb.append(min);
            ampm = " AM";
        }
        sb.append(ampm);
        return sb.toString();
    }

    public static float valorPagamento(float valor, int dias) { //Ex07.java
        float juros = 3;
        if (dias == 0) {
            return valor;
        } else {
            juros += (dias / 10);
            return valor + juros;
        }
    }

    public static int ex08(int n) {
        int cont = 0, valor = 1;
        while (valor <= n) {
            valor *= 10;
            cont++;
        }
        return cont;
    }

    public static int ex09(int n) {
        int max = 10, numfinal = 0;
        int n1 = n;

        while (n != 0) {
            n %= max;
            numfinal += n;
            numfinal *= 10;
            n1 -= n;
            n1 /= 10;
            n = n1;
        }
        numfinal /= 10;
        return numfinal;
    }

    public static String ex10() {
        StringBuilder sb = new StringBuilder();
        Random gerador = new Random();
        int dado = gerador.nextInt(11) + 2;
        switch (dado) {
            case 7:
            case 11:
                sb.append("Ganhou!");
                sb.append("\nNatural");
                break;
            case 2:
            case 3:
            case 12:
                sb.append("Perdeu!");
                sb.append("\nCraps");
                break;
            default:
                int ponto = dado;
                while (true) {
                    dado = gerador.nextInt(11) + 2;
                    if (ponto == dado) {
                        sb.append("Ganhou!");
                        sb.append("\nPonto");
                        break;
                    }
                    if (dado == 7) {
                        sb.append("Perdeu");
                        sb.append("\nPonto igual a 7");
                        break;
                    }
                }
                break;
        }
        return sb.toString();
    }

    public static String ex11(int dia, int mes, int ano) {
        String[] dias = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Catorzer", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Vinte e Um", "Vinte e Dois", "Vinte e Três", "Vinte e Quatro", "Vinte e Cinco", "Vinte e Seis", "Vinte e Sete", "Vinte e Oito", "Vinte e Nove", "Trinta", "Trinta e Um"};
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        StringBuilder sb = new StringBuilder();
        if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano > 2022 || ano < 1) {
            return null;
        }
        sb.append(dias[dia - 1]);
        sb.append(" de ");
        sb.append(meses[mes - 1]);
        sb.append(" de ");
        sb.append(ano);

        return sb.toString();
    }

    public static String ex12(String p) {
        List<String> letra = new ArrayList<String>();
        String novap = "";

        for (int i = 0; i < p.length(); i++) {
            letra.add(String.valueOf(p.charAt(i)));
        }
        Collections.shuffle(letra);

        for (int i = 0; i < p.length(); i++) {
            novap += letra.get(i);
        }
        return novap;
    }


}
