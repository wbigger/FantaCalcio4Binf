class Main {

  public static void main(String[] args) {
    System.out.println("Benvenuti al Fanta Calcio del 4Binf del Marconi di Civitavecchia!");

    Calciatore gasparri = new Calciatore("Alessio Gasparri");

    System.out.println();
    // Se chiedo di stampare una variabile, mi stampa la classe e un "riferimento"
    // Il riferimento non è proprio un indirizzo di memoria ma qualcosa che identifica l'oggetto
    // Se due oggetti hanno lo stesso riferimento, sono lo stesso oggetto
    System.out.println(gasparri);

    System.out.println("Nome giocatore: " + gasparri.getNome() );

  }
}

