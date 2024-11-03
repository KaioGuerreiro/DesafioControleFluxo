import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lemos o primeiro inteiro do terminal
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lemos o segundo inteiro do terminal

        try {
            // Chamamos o método contar, passando os parâmetros e tratando possíveis exceções
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro"); // Mensagem de erro personalizada
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validamos se o primeiro parâmetro é maior que o segundo e lançamos a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Loop for para imprimir os números
        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    // Classe para representar a exceção personalizada
}