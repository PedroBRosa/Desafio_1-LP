package DifferenceOfSquares;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int [] numNaturais = new int[100];
        int potencia=2,cont=1,acumulador=0,somPotencia=0,diferenca;

        for (int i=0;i<numNaturais.length;i++){
            numNaturais[i] = cont;
            acumulador += numNaturais[i];
            somPotencia = (int)Math.pow(numNaturais[i],potencia)+somPotencia;
            cont++;
        }
        acumulador = (int)Math.pow(acumulador,potencia);
        diferenca=acumulador-somPotencia;
        System.out.println("A diferença entre o quadrado da soma e a soma dos quadrados é = "+diferenca);
    }
}
