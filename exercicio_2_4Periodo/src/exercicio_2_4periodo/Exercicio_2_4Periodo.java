/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2_4periodo;
import java.util.Scanner;
public class Exercicio_2_4Periodo {
    
    public static void verificarNum(int a){
        if( !(a==1) || !(a==2)|| !(a==3)||!(a==4)){
        }
    }
    
    public static void main(String[] args) {
        
        int opcao;
        Scanner input = new Scanner(System.in);
        double n1, n2, divisao, raio, area;
        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Divisão");
            System.out.println("2: Área do Círculo");
            System.out.println("3: Média de 5 números");
            System.out.println("4: Sair");
            opcao = input.nextInt();
            verificarNum(opcao);
            switch (opcao){
                case 1:
                    boolean cond = false;
                    System.out.println("Digite os números: ");
                    n1 = input.nextDouble();
                    n2 = 0;
                    while(cond == false){
                        n2 = input.nextDouble();
                        if(n2 == 0){
                            System.out.println("O DIVISOR NÃO PODE SER ZERO, DIGITE OUTRO NUMERO");
                        }else{
                            cond = true;
                        }
                    }
                    divisao = n1/n2;
                    System.out.println("Resultado da divisão: " + divisao);
                break;
                case 2:
                    System.out.println("Digite o raio: ");
                    raio = input.nextDouble();
                    area = Math.PI * Math.pow(raio, 2);
                    System.out.format("Área do círculo: %.2f\n", area);
                break;
                case 3:
                    System.out.println("Digite os 5 números: ");
                    double numeros[] = new double[5];
                    double soma = 0;
                    for (int i = 0; i <= 4; i++){
                        numeros[i] = input.nextDouble();
                        soma = soma + numeros[i];
                    }
                    System.out.println("Média: " + soma/5);
                break;
                case 4:
                    System.out.println("Fim do programa!");
                break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao < 4);
    }
    
}
