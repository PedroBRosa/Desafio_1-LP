package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o comprimento do primeiro lado do triangulo: ");
        lado1 = ler.nextInt();
        System.out.println("Escreva o comprimento do segundo lado do triangulo: ");
        lado2 = ler.nextInt();
        System.out.println("Escreva o comprimento do terceiro lado do triangulo: ");
        lado3 = ler.nextInt();
        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("O comprimento não pode ser = 0");
        }else if((lado1+lado2)<=lado3){
            System.out.println("A soma de 2 lados não pode ser menor ou igual que a do comparado");
        }else {
            if(lado1==lado2&&lado1==lado3){
                System.out.println("É um triangulo equilatero");
            }else if(lado1==lado2||lado2==lado3||lado1==lado3){
                System.out.println("É um triangulo isosceles");
            }else{
                System.out.println("É um triangulo scaleno");
            }
        }
    }
}
