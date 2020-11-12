import java.util.Scanner;  //declaro a importação da biblioteca

/*
    o Scanner utiliza o idioma padrão, o idioma da máquina

*/


public class Leituras{
    public static void main(String args[]){
        // preciso criar o componente
        Scanner teclado;
        teclado = new Scanner(System.in);
        // cria o compomente utilizando a entrada padrão

        int valorInteiro;
        float valorReal;
        System.out.println("Por favor digite um numero inteiro: ");
        valorInteiro = teclado.nextInt();
        System.out.println("O valor inteiro " + valorInteiro + " foi digitado pelo usuario");

        System.out.println("Agora digite um valor Real:");
        valorReal = teclado.nextFloat();
        System.out.println("O valor real digitado vale " + valorReal);
        System.out.printf("o valor com 2 casas decimais: %.2f\n", valorReal);

    }
}