import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        /*

         O programa deverá ler um número inteiro de quatro dígitos
         e retornar sua ordem invertida. Se o número estiver fora das
         condições, uma mensagem deve aparecer e o processo deve se repetir.

        */

        System.out.println("Olá, esse programa irá ler um número de 4 dígitos (XXXX)");
        //criando um escaner para receber um input
        Scanner scanner = new Scanner(System.in);
        //recebendo um input numérico:
            System.out.print("Digite um número de 4 dígitos: ");

            int num = scanner.nextInt();

            //verificando se o número atende as condições e repetindo até que atenda

            while ((num < 1000) || (num > 9999)){
                System.out.print("O número deve ser maior que 1000 e menor que 9999, tente outra vez: ");

                num = scanner.nextInt();
            }

        //identificando cada um dos 4 dígitos
            int milhar = num/1000;
            int centena = (num%1000)/100;
            int dezena = ((num%1000)%100)/10;
            int unidade = ((num%1000)%100)%10;

        //transformando em texto para retornar de forma organizada
            String sMilhar = Integer.toString(milhar);
            String sCentena = Integer.toString(centena);
            String sDezena = Integer.toString(dezena);
            String sUnidade = Integer.toString(unidade);

        //apresentação do resultado
        System.out.println("Ordem invertida: " + sUnidade + sDezena + sCentena + sMilhar );



    }

}
