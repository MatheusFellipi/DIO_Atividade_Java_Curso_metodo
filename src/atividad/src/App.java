package atividad.src;

public class App {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Execicios da Calculadora");
        Calculadora.soma(5, 5);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(10, 5);
        Calculadora.divisao(10, 5);

        System.out.println("Execicios da menssagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(6);

        System.out.println("Execicios da Enprestimoo");
        Emprestino.Calcular(500, 2);
        Emprestino.Calcular(500, 10);
        Emprestino.Calcular(500, 12);
        Emprestino.Calcular(500, 11);
        Emprestino.Calcular(500, 3);
        Emprestino.Calcular(500, 6);
        Emprestino.Calcular(500, 5);
        Emprestino.Calcular(500, 4);
    }
}