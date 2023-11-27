public class Libro {
    // Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Métodos getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // Método para mostrar la información del libro
    public void mostrar() {
        System.out.println("El libro '" + this.titulo + "' con ISBN " + this.ISBN +
                " creado por el autor " + this.autor + " tiene " + this.numPaginas + " páginas.");
    }

    public static void main(String[] args) {
        // Crear objetos Libro
        Libro libro1 = new Libro("123456789", "Don Quijote de la Mancha", "Miguel de Cervantes", 800);
        Libro libro2 = new Libro("987654321", "Cien años de soledad", "Gabriel García Márquez", 400);

        // Mostrar información de los libros
        libro1.mostrar();
        libro2.mostrar();

        // Determinar cuál tiene más páginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro '" + libro1.getTitulo() + "' tiene más páginas que el libro '" +
                    libro2.getTitulo() + "'.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro '" + libro2.getTitulo() + "' tiene más páginas que el libro '" +
                    libro1.getTitulo() + "'.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}
