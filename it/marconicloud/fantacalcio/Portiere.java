package it.marconicloud.fantacalcio;

public class Portiere extends Calciatore {
  // la relazione tra Poritere e Calciatore è di tipo: is-a 
  // quindi possiamo dire che:
  // Portiere is-a Calciatore

  public Portiere(String nome, int velocita, int dribbling, int tiro, int difesa) {
      super(nome,velocita,dribbling,tiro,difesa,Ruolo.PORTIERE);
  }

  // solo per ruolo portiere!!!
  public void paraTiro(int valoreTiro) {
      if ((this.difesa + this.velocita)/2.0 > valoreTiro) {
        System.out.println(this.nome +"para il pallone!");
      } else {
        System.out.println(this.nome +"fa passare la palla!");
      }
  }

}