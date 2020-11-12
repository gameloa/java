import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int Nro;
        int anos, meses, dias;
        int restoano, restomeses;


        Nro = teclado.nextInt();
        
        anos = Nro / 365;
        restoano = Nro % 365;
        meses = restoano / 30;
        dias = restoano % 30;
        System.out.println(Nro);
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        
        }
}