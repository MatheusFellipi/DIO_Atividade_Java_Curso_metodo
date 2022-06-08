package atividad.src;

public class Emprestino {

  public static void Calcular(double valor, int parcela) {

    double taxa = (parcela / 100d);

    double valorTotal = valor + (valor * taxa);

    System.out.println("O total pago é: " + valorTotal + " a taxa e: " + taxa);
  }
}
