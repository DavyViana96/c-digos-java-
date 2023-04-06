import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        
        
        int a = 0, b = 1, c;
        while (b < num) {
            c = a + b;
            a = b;
            b = c;
        }
        if (b == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
