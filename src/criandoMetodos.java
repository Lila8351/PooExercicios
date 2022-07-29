ublic class operadores {
    public float entradaN1;
    public float entradaN2;

    public static float s (float entradaN1, float entradaN2){
        //metodo estatico nao necessita construtor/objeto para ser usado.
        return (entradaN1 + entradaN2);
    }

    public static float sub (float entradaN1, float entradaN2){
        return (entradaN1 - entradaN2);
    }

    public static float div (float entradaN1, float entradaN2){
        return (entradaN1 / entradaN2);
    }

    public static float mult (float entradaN1, float entradaN2){
        return (entradaN1 * entradaN2);
    }

}
import java.util.Scanner;

public class operadoresMain {
    public static void main(String[] args) {
        System.out.println("Digite o valor do primeiro número");

        Scanner scan = new Scanner(System.in);
        float entradaN1 = 0;
        float entradaN2 = 0;

        boolean entradaValida = false;

        while (entradaValida == false) {
            //enquanto a entrada nao for um double, executa a condicao
            //de excessao
            try {
                entradaN1 = scan.nextFloat();
                entradaN2 = scan.nextFloat();
                entradaValida = true;
            } catch (Exception ex) {
                //para o scanner pegar um novo valor, diferente
                //do valor que deu erro anteriormente, e feito:
                scan.nextLine();
                System.out.println("O valor informado não é um número. " +
                        "Informe algum número a seguir:");
            }
        }
        System.out.println("O resultado da " +
                "soma, subtração, multiplicacao e divisão " +
                "dos números informados é, respectivamente: " + operadores.s(entradaN1, entradaN2)+ ","+
                operadores.sub(entradaN1, entradaN2)+" ," +operadores.mult(entradaN1, entradaN2)+
                " ,"+ operadores.div(entradaN1, entradaN2));

    }
}
