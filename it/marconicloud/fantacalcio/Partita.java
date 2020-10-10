package it.marconicloud.fantacalcio;

import java.util.Random;

public class Partita {
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

  public void gioca() {
    for (int minuto = 1; minuto <= 90; minuto++) {
        if (rand.nextInt(10) == 0){
          Calciatore giocatoreCasa = this.squadraInCasa[rand.nextInt(this.squadraInCasa.length)];
          Calciatore  giocatoreOspite = this.squadraOspite[rand.nextInt(this.squadraOspite.length)];

          if (giocatoreCasa.getTiro() > giocatoreOspite.getDifesa()) {
            System.out.println(giocatoreCasa.getNome() +"segna contro "+giocatoreOspite.getNome()+"!!!");
            this.punteggioCasa += 1;
          } else if (giocatoreOspite.getTiro() > giocatoreCasa.getDifesa()) {
            System.out.println(giocatoreOspite.getNome() +"segna contro "+giocatoreCasa.getNome()+"!!!");
            this.punteggioOspite += 1;
          }
        }
    }

    System.out.println("punteggio casa: "+this.punteggioCasa);
    System.out.println("punteggio ospite: "+this.punteggioOspite);

    if (this.punteggioCasa > this.punteggioOspite) {
      System.out.println("Ha vinto la squadra in casa!!");
    } else if (this.punteggioCasa < this.punteggioOspite) {
      System.out.println("Ha vinto la squadra ospite!!");
    } else {
        System.out.println("Pareggio");
    }
  }


}