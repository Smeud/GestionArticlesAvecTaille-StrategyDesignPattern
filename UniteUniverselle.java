public class UniteUniverselle extends Taille {
  public UniteUniverselle() {
    cmpAge = new TailleAdulte();
    cmpGenre = new Mixte();
  }
  public void afficherTaille() {
    System.out.println("exprime en S,M,L,X,XL,XXL (unite universelle).");
  }
}