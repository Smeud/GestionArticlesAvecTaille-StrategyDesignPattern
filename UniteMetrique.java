public class UniteMetrique extends Taille {
  public UniteMetrique() {
    cmpAge = new TailleBebe();
    cmpGenre = new PourHomme();
  }
  public void afficherTaille() {
    System.out.println("exprime en metre(unite metrique).");
  }
}