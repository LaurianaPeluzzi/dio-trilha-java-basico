public class Operadores {

    public static void main(String[] args) {

        String nomeUm = "Lauriana";
        String nomeDois = "Lauriana";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 10;
        int numero2 = 1;

        boolean simNao = numero1 == numero2;

        if (simNao) {
            System.out.println("a nossa condição é verdadeira");
            System.out.println(simNao);
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);   
        
        String resultado = (simNao) ? "Sim nao é verdadeiro" : "Sim nao é falso";

        System.out.println(resultado);   
        
        String nome = "Lauriana";
        int idade = 31;
        String sexo = "F";

        String nome1 = "Sergio";
        int idade1 = 37;
        String sexo1 = "M";

        if (sexo == "F") {
            if(idade >= 18) {
                System.out.println("Entrada Permitida para " + nome);        
            } else {
                System.out.println("Entrada Proibida por idade: " + nome + " tem " + idade + " anos")  ;
            }
        } else {
            System.out.println("Entrada Proibida por sexo: " + nome + " é do sexo " + sexo);    
        }

        if (sexo == "F" && idade >= 18) {
            System.out.println("Entrada Permitida para " + nome);   
        } else {
            System.out.println("Entrada Negada para " + nome);   
        }

        System.out.println("Entrada Permitida");
        System.out.println("Entrada Proibida");

    }
}

/** OPERADORES RELACIONAIS
 * > maior
 * < menor
 * >= maior ou igual
 * <- menor ou igual
 * == igual
 * != não igual (diferente)
 * 
 */

 /** OPERADORES LÓGICOS
  * && E
  * || OU
  * ! NÃO
  */