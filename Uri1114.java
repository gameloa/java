import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int vSenha=0;
        
        do{
            vSenha = teclado.nextInt();
            if (vSenha != 2002){
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");
            }
        } while (vSenha != 2002);      
    
    }
}