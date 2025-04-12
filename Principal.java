public class Principal {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan ", "Garcia ", 41, " 12345678A");
        p1.imprimir();

        Libro l1 = new Libro("Harry Potter", "J.K. Rowling", 500);
        l1.imprimir();
        System.out.println(l1);

        Alumno al1 = new Alumno("Juanma", 4.5);
        al1.haAprobado();
    }
} 

class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
    public void imprimir(){
        System.out.println(nombre + apellidos + edad + dni);
        
    }
    
}

class Libro{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo);
    }
    
}

class Alumno{
    private String nombre;
    private Double nota;

    public Alumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public void haAprobado(){
        if(nota>=5){
            System.out.println("el alumno " + nombre + " ha sacado un " + nota + " está aprobado" );
        }else{
            System.out.println("el alumno " + nombre + " ha sacado un " + nota + " esta suspenso");
        }
    }
    
}