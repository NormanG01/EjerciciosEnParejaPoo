public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Profesor Ejemplo", 35, 'H', "Introducción a la Programación");
        Estudiante estudiante1 = new Estudiante("Estudiante1", 20, 'H', 7.5);
        Estudiante estudiante2 = new Estudiante("Estudiante2", 22, 'M', 4.8);
        Estudiante estudiante3 = new Estudiante("Estudiante3", 21, 'H', 6.2);

        Aula aula = new Aula(1, 30, "Introducción a la Programación", profesor);

        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);
        aula.agregarEstudiante(estudiante3);

        if (aula.puedeDarClase()) {
            System.out.println("Se puede dar clase en el aula " + aula.getIdentificador());
            aula.mostrarAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula " + aula.getIdentificador());
        }
    }
}
