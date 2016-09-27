/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciaçãocientifica;

/**
 *
 * @author Gabriel
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Runtime;
 
public class Exemplo {
 
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i;
   double n;
    
    System.out.printf("Informe o número para a tabuada:\n");
  //  n = ler.nextInt();
 
    FileWriter arq = new FileWriter("C:\\Users\\Gabriel\\Desktop\\IC\\tabuada.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    Scanner scanner = new Scanner(System.in);
    gravarArq.printf("+--Resultado--+%n");
    for (i=1; i<=9; i++) {
      
        n = scanner.nextDouble();
      gravarArq.printf("| %.5f  |%n", n);
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();
    
      Process exec;
      exec = Runtime.getRuntime().exec("cmd /c C:\\Users\\Gabriel\\Desktop\\IC\\tabuada.txt\"");
   // Runtime.getRuntime().exec("calc");
    System.out.printf("\nTabuada  foi gravada com sucesso em \"d:\\tabuada.txt\".\n");
  }
 
}