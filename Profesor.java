class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    // Método polimórfico
    @Override
    public void realizarOperacion() {
        System.out.println("Realizando operación en Profesor");
    }
}
