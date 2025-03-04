import java.util.Scanner;

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
        if (num_ejemplares >= 0) {
            this.num_ejemplares = num_ejemplares;
        }
    }
    



    public int getnum_ejem_pre() {
        return num_ejem_pre;
    }


    public void setnum_ejem_pre(int num_ejem_pre) {
        if (num_ejem_pre >= 0 && num_ejem_pre <= num_ejemplares) {
            this.num_ejem_pre = num_ejem_pre;
        }
    }


    public Parcial() { 
        this.titulo = "";
        this.autor = "";
        this.num_ejemplares = 0;
        this.num_ejem_pre = 0;
    }

     public boolean metodoPrestamo(){
        if (num_ejem_pre < num_ejemplares){
            num_ejemplares++;
            return true;
        }
        return false;

        }

    public boolean metodoDevolucion(){
        if (num_ejem_pre > 0){
            num_ejemplares--; 
            return true;
        }
        return false;
    }

    public String toString() {
        return "Libro" + "Titulo='" + titulo + '\'' + ", Autor='" + autor + '\'' + ", Ejemplares=" + num_ejemplares + ", Prestados=" + num_ejem_pre ;
    }

    public static void main(String[] args) {

        Parcial libro1 = new Parcial ( "Programacion en java", "Guillermo Sanchez", 10,5 ); 
        

        Scanner scanner = new Scanner (System.in);


        Parcial libro2 = new Parcial ();

        System.out.print("Ingrese el título del libro: ");
        libro2.settitulo(scanner.nextLine());
        
        System.out.print("Ingrese el autor del libro: ");
        libro2.setautor(scanner.nextLine());
        
        System.out.print("Ingrese el número de ejemplares: ");
        libro2.setnum_ejemplares(scanner.nextInt());
        
        System.out.print("Ingrese el número de ejemplares prestados: ");
        libro2.setnum_ejem_pre(scanner.nextInt());
        
        System.out.println("Libro 2: " + libro2);
        scanner.close();


        System.out.println("Prestamo del libro: " +libro1.metodoPrestamo());
        System.out.println("Devolucion del libro: " +libro1.metodoDevolucion());
    }
}