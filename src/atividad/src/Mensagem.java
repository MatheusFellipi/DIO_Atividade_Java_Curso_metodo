package atividad.src;

public class Mensagem {
  public static void obterMensagem(int hora) {
    if (hora >= 5 && hora <= 12) {
      bomDia();
    } else if (hora >= 13 && hora <= 17) {
      boaTarde();
    } else if (hora >= 18 && hora <= 23 || hora >= 0 && hora <= 4) {
      boaNoite();
    }
  }

  public static void bomDia() {
    System.out.println("Bom dia");
  }

  public static void boaTarde() {
    System.out.println("Bom Tarde");
  }

  public static void boaNoite() {
    System.out.println("Boa Noite");
  }
}
