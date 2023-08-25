/* Oracao do programador 
 * Hello world 
 
 Livro: head first  livro em java 


 public class aula22_08
  { 
    public static void main(String[] args) {
        System.out.println("Este é meu primeiro programa em java")
        System.out.println("Olá mundo, meu nome é Lucas")
    }
  }




import java.util.Scanner;

*/

import javax.swing.JOptionPane;

public class aula22_08 { 
       public static void main(String[] args) {
   
        /*Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o primeiro valor ");
        int primeiroValor = sc.nextInt(); 
         System.out.println("Digite o Segundo valor ");
        int segundoValor = sc.nextInt(); 
        int resultado = primeiroValor + segundoValor; 
        System.out.println("O resultado é " + resultado); 
        sc.close(); */ 

        String nome = JOptionPane .showInputDialog("qual o seu nome?");
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        double resultadoMultiplicacao = primeiroValor - segundoValor;
        double resultadoDivisao = primeiroValor / segundoValor;
        //JOptionPane.showMessageDialog(null, nome + "A subtra;ão é " + resultado);// 
        JOptionPane.showMessageDialog(null,  "Olá" + nome + "\nA Multiplicacao é" + resultadoMultiplicacao + "\n A divisão é" + resultadoDivisao );

    }
}

  


