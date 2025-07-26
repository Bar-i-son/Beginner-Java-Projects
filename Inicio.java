package Calculadora;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean calculando = true;
        double resultado = 0;
        double nextnum = 0;
        String operacao = "";
        double firstnum = 0;
        double numseguinte = 0;
        double ultimonum = 0;


        System.out.println("Calculadora");
        System.out.println("/  *  +  -");
        System.out.println("7  8  9");
        System.out.println("4  5  6");
        System.out.println("1  2  3");
        System.out.println("0  <---  =");
        System.out.println("------------");

        System.out.println("Faça seu cálculo: ");

        System.out.println("Digite o número: ");
        firstnum = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a operação: ");
        operacao = scanner.nextLine();

        System.out.println("Digite o número: ");
        nextnum = scanner.nextDouble();
        scanner.nextLine();

        switch (operacao) {
            case "/":
                if (nextnum == 0) {
                    System.out.println("Divisão por 0 não existe!");
                    calculando = false;
                } else;
                resultado = firstnum/nextnum;
                break;
            case "*":
                resultado = firstnum*nextnum;
                break;
            case "-":
                resultado = firstnum-nextnum;
                break;
            case "+":
                resultado = firstnum+nextnum;
                break;
            default:
                System.out.println("Digite um operador válido");
                calculando = false;
                break;
        }

        System.out.println(resultado);

        while (calculando) {

            System.out.println("Digite a operação: ");
            operacao = scanner.nextLine();

            System.out.println("Digite o número: ");
            numseguinte = scanner.nextDouble();
            scanner.nextLine();

            switch (operacao) {
                case "/":
                    if (nextnum == 0) {
                        System.out.println("Divisão por 0 não existe!");
                        calculando = false;
                    } else;
                    resultado = resultado/numseguinte;
                    break;
                case "*":
                    resultado = resultado*numseguinte;
                    break;
                case "-":
                    resultado = resultado-numseguinte;
                    break;
                case "+":
                    resultado = resultado+numseguinte;
                    break;
                default:
                    System.out.println("Digite um operador válido");
                    calculando = false;
                    break;
            }

            System.out.println(resultado);


            System.out.println("Digite a operação: ");
            operacao = scanner.nextLine();

            System.out.println("Digite o número: ");
            ultimonum = scanner.nextDouble();
            scanner.nextLine();

            switch (operacao) {
                case "/":
                    if (nextnum == 0) {
                        System.out.println("Divisão por 0 não existe!");
                        calculando = false;
                    } else;
                    resultado = resultado/ultimonum;
                    break;
                case "*":
                    resultado = resultado*ultimonum;
                    break;
                case "-":
                    resultado = resultado-ultimonum;
                    break;
                case "+":
                    resultado = resultado+ultimonum;
                    break;
                default:
                    System.out.println("Digite um operador válido");
                    calculando = false;
                    break;
            }

            System.out.println(resultado);

        }

    }
}

