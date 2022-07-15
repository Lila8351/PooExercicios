package entenderObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("A seguir, digite o valor do raio");
        Scanner scan = new Scanner(System.in);
        //system.in significa que os valores serao recebidos
        //do usuario pelo teclado/terminal.
        double entradaRaio = 0;
        //a variavel precisa ser inicializada, e o valor nao importa
        //porque ele sera substituido pelo valor dado pelo usuario

        //declaracao de que a variavel entradaRaio existe de forma independente
        //Isso foi necessario para reaproveitar a variavel dentro do try e
        //e do main.

        boolean entradaValida = false;

        while (entradaValida == false) {
            //enquanto a entrada nao for um double, executa a condicao
            //de excessao
            try {
                entradaRaio = scan.nextDouble();
                entradaValida = true;
            } catch (Exception ex) {
                //para o scanner pegar um novo valor, diferente
                //do valor que deu erro anteriormente, e feito:
                scan.nextLine();
                System.out.println("O valor informado não é um número. " +
                        "Informe algum número a seguir:");
            }
        }
        //essa variavel se refere a entrada do usuario,
        //ela ainda nao esta vinculada na classe.
        System.out.println("O raio intormado é " + entradaRaio);

        Circulo c1 = new Circulo(entradaRaio);
        //c1 é uma variavel de referencia (objeto) relacionada ao construtor Circulo
        //Fonte: https://www.devmedia.com.br/tipos-de-dados-por-valor-e-por-referencia-em-java/25293
        //com essa declaracao vinculamos o valor recebido do usuario
        //ao construtor Circulo criando o objeto c1.


        Esfera e1 = new Esfera(entradaRaio);

        System.out.println("A area do circulo é " + c1.Area() +
                " e a area da esfera é " + e1.Area() + ".");
    }
}
