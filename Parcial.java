public class Parcial {

    String titulo;
    String autor;
    int num_ejemplares;
    int num_ejem_pre;

    public Parcial(String titulo, String autor, int num_ejemplares, int num_ejem_pre) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_ejemplares = num_ejemplares;
        this.num_ejem_pre = num_ejem_pre;
    }

    

    public String gettitulo() {
        return titulo;
    }



    public void settitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getautor() {
        return autor;
    }



    public void setautor(String autor) {
        this.autor = autor;
    }



    public int getnum_ejemplares() {
        return num_ejemplares;
    }



    public void setnum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }



    public int getnum_ejem_pre() {
        return num_ejem_pre;
    }



    public void setnum_ejem_pre(int num_ejem_pre) {
        this.num_ejem_pre = num_ejem_pre;
    }



    public Parcial() { 

    }

     void metodoPrestamo(){
        if (num_ejemplares > 0 && num_ejem_pre < num_ejemplares){
            num_ejemplares--;
        }

        System.out.println("El titulo del libro es: " +this.titulo+ "\nSu autor es: " + this.autor + "\nHay: "+this.num_ejemplares+ " disponibles y " + this.num_ejem_pre + " prestados");
    }

    void metodoDevolucion(){
        if (num_ejemplares < num_ejem_pre){
            num_ejemplares++; 
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Parcial libro1 = new Parcial ( "Programacion en java", "Guillermo Sanchez", 10,5 ); 
        
        libro1.metodoPrestamo();
        System.out.println("");

        libro1.metodoDevolucion();

        Parcial libro2 = new Parcial ();

        libro2.metodoPrestamo();
        System.out.println("");

        libro2.metodoDevolucion();
        System.out.println("");

    }

}