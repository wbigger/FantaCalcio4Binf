package it.marconicloud.fantacalcio;

import it.marconicloud.cronaca.Evento;
import it.marconicloud.cronaca.Attore;

// Posso implementare EventoPartita come una classe separata
public class EventoPartita implements Evento {
  
  public String getDescrizione() {
    return "descrizione";
  }

  public Attore[] getAttori() {
    Attore[] attori = new Attore[1];
    attori[0] = new Calciatore("Alessio",50,50,50,50,Ruolo.DIFENSORE);
    return attori;
  }

}