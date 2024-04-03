package local.damw;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreAutomobils = 0;
        boolean acabar = false;
        
        // array d'automobils
        Automobil[] automobils = new Automobil[10];
     
        while (!acabar) {
           
            System.out.println("Introdueix una opció:");
            System.out.println("1. Afegir un automòbil");
            System.out.println("2. Mostrar tots els automòbils");
            System.out.println("3. Sortir");

            int opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    // captura de la informació
                    System.out.println("Marca:");
                    String marca = scanner.next();
                    System.out.println("Model:");
                    String model = scanner.next();
                    System.out.println("Matricula:");
                    String matricula = scanner.next();

                    // crea una instàcia del automòbil (objecte)
                    Automobil automobil = new Automobil(marca, model, matricula);
                    
                    // posa l'objecte dins l'array
                    automobils[nombreAutomobils] = automobil;
                    
                    nombreAutomobils++; // incrementa index array
                    break;
                case 2:
                    // bucle per tot l'array not null
                    for(int i = 0; i < automobils.length && automobils[i] != null; i ++){
                        System.out.println(automobils[i].mostrarDades() + "\n");
                    }
                    break;
                case 3:
                    acabar = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        }
    }
}