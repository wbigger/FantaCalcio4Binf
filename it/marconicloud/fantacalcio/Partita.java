package it.marconicloud.fantacalcio;


import java.util.Random;
import it.marconicloud.cronaca.*;


public class Partita implements Cronaca {

    // Posso implementare partita come una classe interno alla classe Partita (classe annidata o _nested_) per mantenere le cose più ordinate, visto che nel nostro caso solo Partita usa Evento
    class Evento implements it.marconicloud.cronaca.Evento {
      String descrizione;

      Evento(String descrizione) {
        this.descrizione = descrizione;
      }

      public String getDescrizione() {
        return this.descrizione;
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
    Evento eventi[] = new Partita.Evento[100];
    this.gioca(eventi);
    return eventi;
  }

  public void gioca(Evento[] eventi) {
    int evento_idx = 0;
    for (int minuto = 1; minuto <= 90; minuto++) {
      if (rand.nextInt(3) == 0) {
        Calciatore giocatoreCasa = this.squadraInCasa[rand.nextInt(this.squadraInCasa.length)];
        eventi[evento_idx] = new Partita.Evento("Minuto "+ minuto +": " + giocatoreCasa.faiAzione());
        evento_idx++;
      }
      if (rand.nextInt(3) == 0) {
        Calciatore giocatoreOspite = this.squadraOspite[rand.nextInt(this.squadraOspite.length)];
        eventi[evento_idx] = new Partita.Evento("Minuto "+ minuto +": " + giocatoreOspite.faiAzione());
        evento_idx++;
      }
      if (rand.nextInt(10) == 0) {
        Calciatore giocatoreCasa = this.squadraInCasa[rand.nextInt(this.squadraInCasa.length)];
        Calciatore giocatoreOspite = this.squadraOspite[rand.nextInt(this.squadraOspite.length)];

        if (giocatoreCasa.getTiro() > giocatoreOspite.getDifesa()) {
          eventi[evento_idx] = new Partita.Evento("Minuto "+ minuto +": " + giocatoreCasa.getNome() + "segna contro " + giocatoreOspite.getNome() + "!!!");
          evento_idx++;
          this.punteggioCasa += 1;
        } else if (giocatoreOspite.getTiro() > giocatoreCasa.getDifesa()) {
          eventi[evento_idx] = new Partita.Evento("Minuto "+ minuto +": " + 
          giocatoreOspite.getNome() + "segna contro " + giocatoreCasa.getNome() + "!!!");
          evento_idx++;
          this.punteggioOspite += 1;
        }
      }
    }

    eventi[evento_idx] = new Partita.Evento("punteggio casa: " + this.punteggioCasa);
    evento_idx++;
    eventi[evento_idx] = new Partita.Evento("punteggio ospite: " + this.punteggioOspite);
    evento_idx++;

    if (this.punteggioCasa > this.punteggioOspite) {
      eventi[evento_idx] = new Partita.Evento("Ha vinto la squadra in casa!!");
      evento_idx++;
    } else if (this.punteggioCasa < this.punteggioOspite) {
      eventi[evento_idx] = new Partita.Evento("Ha vinto la squadra ospite!!");
      evento_idx++;
    } else {
      eventi[evento_idx] = new Partita.Evento("Pareggio");
      evento_idx++;
    }
  }

}