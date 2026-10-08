import java.util.Scanner;
    public class atv1 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;

    System.out.println("digite um numero");
    numero = entrada.nextInt();
  
    for ( int i = 1; i <= numero; i++) {
    System.out.println(i);
    }

    entrada.close();
    
   }
 }
