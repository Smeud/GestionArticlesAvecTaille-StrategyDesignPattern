class Main {
  public static void main(String[] args) {
    System.out.println("\n"+ "***Rapport article-taille***");
    
    /*UniteMetrique um = new UniteMetrique();
    um.renseignerAge();
    um.renseignerGenre();
    um.afficherTaille();*/

    Laptop lp = new Laptop();
    UnitePondere up = new UnitePondere();
    lp.afficherArticles();
    up.renseignerAge();
    up.renseignerGenre();
    up.afficherTaille();
    lp.renflouerStock();

    /*UniteVolumique uv = new UniteVolumique();
    uv.renseignerAge();
    uv.renseignerGenre();
    uv.afficherTaille();*/
  }
}
