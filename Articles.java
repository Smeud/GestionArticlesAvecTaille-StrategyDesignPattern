public abstract class Articles {
  ComportementEnStock cmpStock;

  public void renflouerStock() {
    cmpStock.stocker();
  }
  public abstract void afficherArticles();
}