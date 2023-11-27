import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Aula {
    private int identificador;
    private int maxEstudiantes;
    private String asignatura;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(int identificador, int maxEstudiantes, String asignatura, Profesor profesor) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public boolean puedeDarClase() {
        double porcentajeFaltas = calcularPorcentajeFaltas();
        return profesorDisponible() && asignaturaCorrecta() && porcentajeFaltas <= 50;
    }

    private boolean profesorDisponible() {
        Random random = new Random();
        return random.nextDouble() <= 0.8;
    }

    private boolean asignaturaCorrecta() {
        return asignatura.equals(profesor.getAsignatura());
    }

    private double calcularPorcentajeFaltas() {
        long faltas = estudiantes.stream().filter(estudiante -> estudiante.getCalificacion() < 5).count();
        return (double) faltas / estudiantes.size() * 100;
    }

    public void mostrarAprobados() {
        long aprobadosHombres = estudiantes.stream()
                .filter(estudiante -> estudiante.getSexo() == 'H' && estudiante.getCalificacion() >= 5)
                .count();

        long aprobadasMujeres = estudiantes.stream()
                .filter(estudiante -> estudiante.getSexo() == 'M' && estudiante.getCalificacion() >= 5)
                .count();

        System.out.println("Aprobados: Hombres: " + aprobadosHombres + ", Mujeres: " + aprobadasMujeres);
    }
}
