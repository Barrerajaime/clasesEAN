import java.util.ArrayList;
import java.util.Date;

// Definición de la clase Persona
abstract class Persona {
    protected String cedula;
    protected String nombre;
    protected Date fechaNacimiento;
    protected String lugarNacimiento; // Formato: ciudad, departamento, país

    public Persona(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }
}

// Definición de la clase Estudiante, extendiendo Persona
class Estudiante extends Persona {
    private String colegioBachillerato;
    private Date fechaIngreso;
    private ArrayList<Carrera> carreras;

    public Estudiante(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento,
                      String colegioBachillerato, Date fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegioBachillerato = colegioBachillerato;
        this.fechaIngreso = fechaIngreso;
        this.carreras = new ArrayList<>();
    }

    public void inscribirCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}

// Definición de la clase Profesor, extendiendo Persona
class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private ArrayList<Curso> cursos;

    public Profesor(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento,
                    String profesion, String nacionalidad, double sueldo) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.cursos = new ArrayList<>();
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }
}

// Definición de la clase Facultad
class Facultad {
    private String nombre;
    private int codigo;
    private ArrayList<Profesor> profesores;
    private ArrayList<Carrera> carreras;

    public Facultad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesores = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}

// Definición de la clase Carrera
class Carrera {
    private String nombre;
    private int numeroCreditos;
    private int numeroSemestres;
    private String nivel; // PREGRADO o POSTGRADO
    private ArrayList<Curso> cursos;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombre, int numeroCreditos, int numeroSemestres, String nivel) {
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroSemestres = numeroSemestres;
        this.nivel = nivel;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

// Definición de la clase Curso
class Curso {
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private String numeroSalon;
    private String nombreEdificio;
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigo, String nombre, int numeroCreditos, String numeroSalon, String nombreEdificio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroSalon = numeroSalon;
        this.nombreEdificio = nombreEdificio;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

// Definición de la clase UniversidadEAN
class UniversidadEAN {
    private String nombre;
    private String nombreRector;
    private String ciudad;
    private ArrayList<Facultad> facultades;

    public UniversidadEAN(String nombre, String nombreRector, String ciudad) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.ciudad = ciudad;
        this.facultades = new ArrayList<>();
    }

    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }
}
