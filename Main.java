
import it.marconicloud.fantacalcio.*;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Benvenuti al Fanta Calcio del 4Binf del Marconi di Civitavecchia!");


    Random rand = new Random(2035);

    Calciatore[] chelsea = new Calciatore[8];
    Calciatore[] liverpool = new Calciatore[8];

    chelsea[0] = new Calciatore("Alessio Gasparri", rand.nextInt(80) + 21, rand.nextInt(90) + 11, rand.nextInt(90) + 11,
        rand.nextInt(90) + 11, Ruolo.DIFENSORE);
    chelsea[1] = new Calciatore("Matteo Verticelli", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1, Ruolo.PORTIERE);
    chelsea[2] = new Calciatore("Stefano Cacchiarelli", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1, Ruolo.DIFENSORE);


    chelsea[3] = new Portiere("Andrea Costantini", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1);


        
    chelsea[4] = new Calciatore("Edoardo Dionisi", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, Ruolo.DIFENSORE);
    chelsea[5] = new Calciatore("Martina Miglietta", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1,Ruolo.DIFENSORE);
    chelsea[6] = new Calciatore("Leonardo Teti", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1,Ruolo.DIFENSORE);
    chelsea[7] = new Calciatore("Cristiano Tullio", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, Ruolo.ATTACCANTE);

    liverpool[0] = new Calciatore("Gianluca Anselmi", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1,Ruolo.PORTIERE);
    liverpool[1] = new Calciatore("Gabriele Cerqua", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1,Ruolo.DIFENSORE);
    liverpool[2] = new Calciatore("Ionut Cicio", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1,Ruolo.CENTROCAMPISTA);
    liverpool[3] = new Calciatore("Denis Cioineag", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1,Ruolo.CENTROCAMPISTA);
    liverpool[4] = new Calciatore("Toma Lupu", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1,Ruolo.DIFENSORE);
    liverpool[5] = new Calciatore("Victor Miheev", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, Ruolo.DIFENSORE);
    liverpool[6] = new Calciatore("Carlo Perna", rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, Ruolo.CENTROCAMPISTA);
    liverpool[7] = new Calciatore("Domenico Salernitano", rand.nextInt(100) + 1, rand.nextInt(100) + 1,
        rand.nextInt(100) + 1, rand.nextInt(100) + 1,Ruolo.CENTROCAMPISTA);

    System.out.println();
    // Se chiedo di stampare una variabile, mi stampa la classe e un "riferimento"
    // Il riferimento non è proprio un indirizzo di memoria ma qualcosa che
    // identifica l'oggetto
    // Se due oggetti hanno lo stesso riferimento, sono lo stesso oggetto

    System.out.println("Calciatori del Chelsea:");
    for (Calciatore c : chelsea) {
      System.out.println("Nome giocatore: " + c.getNome());
      System.out.println("Tiro: " + c.getTiro());
      System.out.println("Dribbling: " + c.getDribbling());
      System.out.println("Velocità: " + c.getVelocita());
      System.out.println("Difesa: " + c.getDifesa());
      System.out.println();
    }

    System.out.println("Calciatori del Liverpool:");
    for (Calciatore c : liverpool) {
      System.out.println("Nome giocatore: " + c.getNome());
      System.out.println("Tiro: " + c.getTiro());
      System.out.println("Dribbling: " + c.getDribbling());
      System.out.println("Velocità: " + c.getVelocita());
      System.out.println("Difesa: " + c.getDifesa());
      System.out.println();
    }

    Partita partitaDelSecolo = new Partita(chelsea,liverpool);  

    partitaDelSecolo.gioca();      
    
  }
}
