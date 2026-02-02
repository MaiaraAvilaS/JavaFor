
package com.example.For;

public class App {
  

    public static void main(String[] args) {
        
        
         
            System.out.println("Comando FOR");
            int qtdVezes = 0;
            
         for (int qtdVezes1 = 0; qtdVezes1 <= 10; qtdVezes1++) { //cria a variável. 1o inicializa a variável -2o quantas vezes irá executar - 3o incrementa até a qutd de vezes 
             System.out.println("Estou fazendo a " + qtdVezes1 + " a vez");
             
             qtdVezes = qtdVezes1;
        }
        System.out.println("Saí do laço e executei" + (qtdVezes) + " vezes" );
       
    }
}
