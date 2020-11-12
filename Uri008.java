import java.util.Scanner;

public class Uri008{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int FUNC,HORAFUNC;
        double SALFUNC,TOTALFUNC;
        
        FUNC = teclado.nextInt();
        HORAFUNC = teclado.nextInt();
        SALFUNC = teclado.nextDouble();
        TOTALFUNC = SALFUNC * HORAFUNC;
        
        System.out.println("NUMBER = " + FUNC);
        System.out.printf("SALARY = U$ %.2f\n",TOTALFUNC);

        }
}