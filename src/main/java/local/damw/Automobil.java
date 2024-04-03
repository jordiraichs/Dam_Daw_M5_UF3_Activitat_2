package local.damw;

/**
 * Definició de la classe Automobil
 */
public class Automobil {

    // variables de instància (atributs)
    private String marca;
    private String model;
    private String matricula;

    public static int totalAutos = 0;   // variable estàtica, compartida per tots els objectes d'aquesta clase

    // constructor
    public Automobil(String marca, String model, String matricula) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        Automobil.totalAutos++;
    }

    // constructor sense parametres crea espai a memòria (constructor per defecte)
    public Automobil() { 
        Automobil.totalAutos++;
    }

    
    // mètodes setter 
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;   
    }

    // mètodes getter
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return  model;
    }

    public String getMatricula(){
        return matricula;
    }

    // mètode per  mostrar les dades de l'automòbil
    public String mostrarDades(){
        return  "Marca: "+ this.marca +", Model: " + this.model + ", Matrícula: " + this.matricula;
    }



    /**
     * Funció de la classe Automòbil
     * @param matricula : String; és la matrícula del vehicle
     * @return : bool ; True: matricula correcta ; False: matricula NO correcta
     */
    public static boolean matriculaCorrecta (String matricula){
        char[] mat = matricula.toCharArray();
        int longitud = matricula.length();
        
        // 1
        boolean correcta = true;
        int i = 0;
        
        if(longitud != 7) correcta = false; // 2
        
        while (correcta == true && i < longitud){ // 3
            char c = mat[i];
    
            if( i < 4 && Character.isDigit(c)){ // 4
                i = i + 1; // 5
            } 
            
            else if ( i >= 4 && i < longitud && Character.isUpperCase(c)) { // 6
                i = i + 1; // 7
            }  
            
            else {
                correcta = false; // 8
            }
        }

        return correcta; // 9
        
    }

}
