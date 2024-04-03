package local.damw;

public class Main {
    public static void main(String[] args) {
      
        Automobil[] auto = new Automobil[10];
        auto[0] = new Automobil("VOLVO", "WWW", "1234eer");

        // crea una instància de la classe (Objecte)
        Automobil auto1 = new Automobil();
        auto1.setMarca("BMW");
        auto1.setModel("Golf");
        auto1.setMatricula("1234AGF");
        
        // crea una instància  d'una altra classe, amb valors diferents
        Automobil auto2 = new Automobil("Mercedes","GLA","5678HJI");

        System.out.println(auto1.mostrarDades());
        System.out.println(auto2.mostrarDades());

        System.out.println(Automobil.totalAutos);

    }
}