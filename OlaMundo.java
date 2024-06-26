import java.util.Scanner;

public class OlaMundo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, Mundo!");

        String nome;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Seja bem vindo " + nome);


    }
}