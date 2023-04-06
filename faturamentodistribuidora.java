import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    private List<Double> faturamentoDiario;
    
    public Distribuidora(List<Double> faturamentoDiario) {
        this.faturamentoDiario = faturamentoDiario;
    }
    
    public double menorFaturamento() {
        double menor = Double.MAX_VALUE;
        for (double faturamento : faturamentoDiario) {
            if (faturamento < menor) {
                menor = faturamento;
            }
        }
        return menor;
    }
    
    public double maiorFaturamento() {
        double maior = Double.MIN_VALUE;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > maior) {
                maior = faturamento;
            }
        }
        return maior;
    }
    
    public int diasAcimaDaMedia() {
        double media = calcularMedia();
        int contador = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > media) {
                contador++;
            }
        }
        return contador;
    }
    
    private double calcularMedia() {
        double soma = 0.0;
        int contador = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) { 
                soma += faturamento;
                contador++;
            }
        }
        return soma / contador;
    }
    
    public static void main(String[] args) {
        List<Double> faturamentoDiario = new ArrayList<>();
        faturamentoDiario.add(1000.0);
        faturamentoDiario.add(1500.0);
        faturamentoDiario.add(800.0);
        faturamentoDiario.add(1200.0);
        faturamentoDiario.add(0.0);
        faturamentoDiario.add(2000.0);
        faturamentoDiario.add(900.0);
        faturamentoDiario.add(1100.0);
        
        Distribuidora distribuidora = new Distribuidora(faturamentoDiario);
        System.out.println("Menor faturamento: " + distribuidora.menorFaturamento());
        System.out.println("Maior faturamento: " + distribuidora.maiorFaturamento());
        System.out.println("Dias acima da média: " + distribuidora.diasAcimaDaMedia());
    }
}
