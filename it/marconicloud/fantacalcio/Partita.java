package it.marconicloud.fantacalcio;


import java.util.Random;
import it.marconicloud.cronaca.*;


public class Partita implements Cronaca {

    // Posso implementare partita come una classe interno alla classe Partita (classe annidata o _nested_) per mantenere le cose più ordinate, visto che nel nostro caso solo Partita usa Evento
    class Evento implements it.marconicloud.cronaca.Evento {
      public String getDescrizione() {
        return "descrizione evento";
      }
      public Attore[] getAttori() {
        Attore[] attori = new Attore[1];
        attori[0] =  new Calciatore("Alessio", 55, 55, 55,
        55, Ruolo.DIFENSORE);;
        return attori;
      }
    }

  private Calciatore[] squadraInCasa;
  private Calciatore[] squadraOspite;
  private int punteggioCasa = 0;
  private int punteggioOspite = 0;
  private Random rand;

  public Partita(Calciatore[] squadraInCasa, Calciatore[] squadraOspite) {

    this.squadraInCasa = squadraInCasa;
    this.squadraOspite = squadraOspite;
    this.rand = new Random(1009872);
  }

  @Override
  public Evento[] getListaEventi() {
    Evento eventi[] = new Partita.Evento[1];
    eventi[0] = new Partita.Evento();
    return eventi;
  }

  public void gioca() {
    for (int minuto = 1; minuto <= 90; minuto++) {
      if (rand.nextInt(3) == 0) {
        Calciatore giocatoreCasa = this.squadraInCasa[rand.nextInt(this.squadraInCasa.length)];
        System.out.print("Minuto "+ minuto +": ");
        giocatoreCasa.faiAzione();
      }
      if (rand.nextInt(3) == 0) {
        Calciatore giocatoreOspite = this.squadraOspite[rand.nextInt(this.squadraOspite.length)];
        System.out.print("Minuto "+ minuto +": ");
        giocatoreOspite.faiAzione();
      }
      if (rand.nextInt(10) == 0) {
        Calciatore giocatoreCasa = this.squadraInCasa[rand.nextInt(this.squadraInCasa.length)];
        Calciatore giocatoreOspite = this.squadraOspite[rand.nextInt(this.squadraOspite.length)];

        if (giocatoreCasa.getTiro() > giocatoreOspite.getDifesa()) {
          System.out.print("Minuto "+ minuto +": ");
          System.out.println(giocatoreCasa.getNome() + "segna contro " + giocatoreOspite.getNome() + "!!!");
          this.punteggioCasa += 1;
        } else if (giocatoreOspite.getTiro() > giocatoreCasa.getDifesa()) {
          System.out.print("Minuto "+ minuto +": ");
          System.out.println(giocatoreOspite.getNome() + "segna contro " + giocatoreCasa.getNome() + "!!!");
          this.punteggioOspite += 1;
        }
      }
    }

    System.out.println("punteggio casa: " + this.punteggioCasa);
    System.out.println("punteggio ospite: " + this.punteggioOspite);

    if (this.punteggioCasa > this.punteggioOspite) {
      System.out.println("Ha vinto la squadra in casa!!");
    } else if (this.punteggioCasa < this.punteggioOspite) {
      System.out.println("Ha vinto la squadra ospite!!");
    } else {
      System.out.println("Pareggio");
    }
  }

}