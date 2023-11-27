public class Raices {
    // Atributos
    private double a;
    private double b;
    private double c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para obtener el discriminante
    private double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Método para obtener las dos posibles soluciones
    public void obtenerRaices() {
        double discriminante = calcularDiscriminante();

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las dos posibles soluciones son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }

    // Método para obtener una única raíz
    public void obtenerRaiz() {
        double raiz = -b / (2 * a);
        System.out.println("La única solución posible es: " + raiz);
    }

    // Método para mostrar el discriminante
    public double mostrarDiscriminante() {
        return calcularDiscriminante();
    }

    // Método para verificar si hay 2 soluciones
    public boolean tieneRaices() {
        return calcularDiscriminante() > 0;
    }

    // Método para verificar si hay una única solución
    public boolean tieneRaiz() {
        return calcularDiscriminante() == 0;
    }

    // Método para calcular y mostrar las soluciones
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Raices ecuacion1 = new Raices(1, -3, 2);
        System.out.println("Discriminante: " + ecuacion1.mostrarDiscriminante());
        ecuacion1.calcular();

        Raices ecuacion2 = new Raices(1, -2, 1);
        System.out.println("Discriminante: " + ecuacion2.mostrarDiscriminante());
        ecuacion2.calcular();

        Raices ecuacion3 = new Raices(1, 2, 5);
        System.out.println("Discriminante: " + ecuacion3.mostrarDiscriminante());
        ecuacion3.calcular();
    }
}
