import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int Nro;
        int ced100,ced50,ced20,ced10,ced5,ced2,ced1;
        int resto100, resto50, resto20, resto10, resto5, resto2;


        Nro = teclado.nextInt();
        
        ced100 = Nro/100;
        resto100 = Nro % 100;
        
        ced50 = resto100 / 50;
        resto50 = resto100 % 50;

        ced20 = resto50 / 20;
        resto20 = resto50 % 20;

        ced10 = resto20 / 10;
        resto10 = resto20 % 10;
    
        ced5 = resto10 / 5;
        resto5 = resto10 % 5;

        ced2 = resto5 / 2;
        resto2 = resto5 % 2;
        
        ced1 = resto2 / 1;

        System.out.println(Nro);
        System.out.println(ced100 + " nota(s) de R$ 100,00");
        System.out.println(ced50 + " nota(s) de R$ 50,00");
        System.out.println(ced20 + " nota(s) de R$ 20,00");
        System.out.println(ced10 + " nota(s) de R$ 10,00");
        System.out.println(ced5 + " nota(s) de R$ 5,00");
        System.out.println(ced2 + " nota(s) de R$ 2,00");
        System.out.println(ced1 + " nota(s) de R$ 1,00");
        }
}