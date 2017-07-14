import java.util.Scanner;

public class Multiples
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int resto, n1, n2;
    
    System.out.print("Ingrese el primer entero: ");
    n1 = input.nextInt();
    System.out.print("Ingrese el segundo entero: ");
    n2 = input.nextInt();
    
    resto = n1 % n2;
    
    if (resto == 0)
      System.out.printf("%d es múltiplo de %d%n", n1, n2);
    
    if (resto != 0)
      System.out.println("No son múltiplos");
  }
}
   
   
   
