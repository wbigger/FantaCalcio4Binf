package it.marconicloud.fantacalcio;

import it.marconicloud.fantacalcio.Ruolo;

import it.marconicloud.cronaca.Attore;



// Il nome della classe principale deve essere uguale a quella del file in cui si trova
public class Calciatore implements Attore {

  // "private" è un modificatore che fa in modo che dall'esterno di questo file non possa essere modificata la variabile

  // Questa pratica si chiama INCAPSULAMENTO ("encapsulation")

  protected String nome = "";
  protected Ruolo ruolo;
  
  // Statistiche
  // Tutte le stats sono da 1 a 100
  protected int velocita = 0;
  protected int dribbling = 0;
  protected int tiro = 0;
  protected int difesa = 0;



  // Costruttore
  public Calciatore(String nome, int velocita, int dribbling, int tiro, int difesa, Ruolo ruolo) {
    this.nome = nome;
    this.velocita = velocita;
    this.dribbling = dribbling;
    this.tiro = tiro;
    this.difesa = difesa;
    this.ruolo = ruolo;
  }

  // Funzione di getter
  // Il gettere deve chiamarsi getNomevariabile
  public String getNome() {
    return this.nome;
  }

  public int getVelocita() {
    return this.velocita;
  }

  public int getDribbling() {
    return this.dribbling;
  }

  public int getTiro() {
    return this.tiro;
  }

  public int getDifesa() {
    return this.difesa;
  }

  // solo per ruolo attaccante!!!
  public int tira() {
      int valoreTiro = (this.tiro+this.dribbling) / 2;
      return valoreTiro;
  }

  public void faiAzione () {
      switch (this.ruolo) {
        case DIFENSORE: {
            System.out.println(this.nome + " intercetta il pallone in aria!");
            break;
        }
        case ATTACCANTE: {
          System.out.println(this.nome + " tenta il tiro dai trenta metri!");
          break;
        }
        case CENTROCAMPISTA: {
          System.out.println(this.nome + " effettua un assist molto efficace!");
          break;
        }
        case PORTIERE: {
          System.out.println(this.nome + " para un tiro incredibile!");
          break;
        }
      }
  }
}