class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Método polimórfico
    @Override
    public void realizarOperacion() {
        System.out.println("Realizando operación en Estudiante");
    }
}
