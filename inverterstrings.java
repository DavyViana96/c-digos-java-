import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        sc.close();
        
        String strInvertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }
        
        System.out.println("String invertida: " + strInvertida);
    }
}
