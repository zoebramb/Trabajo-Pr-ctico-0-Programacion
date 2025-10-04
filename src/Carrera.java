public class Carrera {
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    // Constructor con parámetros
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[10];
        this.cantidadEstudiantes = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) 
    {
        if (cantidadEstudiantes < estudiantes.length) 
        {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else 
        {
            System.out.println("No se pueden agregar más estudiantes, capacidad máxima alcanzada.");
        }
    }
    public void listarEstudiantes() 
    {
        for (int i = 0; i < cantidadEstudiantes; i++) 
        {
            Estudiante e = estudiantes[i];
            System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido() + ", Promedio: " + e.getPromedio());
        }
    }
    public void buscarEstudiante(String nombreBuscado) 
    {
        for (int i = 0; i < cantidadEstudiantes; i++) 
        {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombreBuscado)) 
            {
                System.out.println("Estudiante encontrado: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido() + ", Promedio: " + estudiantes[i].getPromedio());
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }   
}
