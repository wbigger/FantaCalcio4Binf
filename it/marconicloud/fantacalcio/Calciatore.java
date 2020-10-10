package it.marconicloud.fantacalcio;

// Il nome della classe principale deve essere uguale a quella del file in cui si trova
public class Calciatore {

  // "private" è un modificatore che fa in modo che dall'esterno di questo file non possa essere modificata la variabile

  // Questa pratica si chiama INCAPSULAMENTO ("encapsulation")

  private String nome = "";
  private String ruolo = "";
  
  // Statistiche
  // Tutte le stats sono da 1 a 100
  private int velocita = 0;
  private int dribbling = 0;
  private int tiro = 0;
  private int difesa = 0;


  // Costruttore
  public Calciatore(String nome, int velocita, int dribbling, int tiro, int difesa) {
    this.nome = nome;
    this.velocita = velocita;
    this.dribbling = dribbling;
    this.tiro = tiro;
    this.difesa = difesa;
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
}