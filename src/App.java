//va a ser el main
public class App 
{
    public static void main(String[] args) 
    {
    
    Carrera carrera = new Carrera("Ingeniería en Sistemas");    

    Estudiante e1 = new Estudiante(); //por el c. sin parámetros
    Estudiante e2 = new Estudiante();
    Estudiante e3 = new Estudiante();
    e3.setNombre("Ana");
    e3.setApellido("García");
    e3.setEdad(20);
    e3.setCarrera("Ingeniería en Sistemas");
    e3.setPromedio(8.5f);

    Estudiante e4 = new Estudiante("Juan", "Perez", 22, "Programacion", 9f);
    Estudiante e5 = new Estudiante("Sofía", "Perez", 24, "Medicina", 8f);
    Estudiante e6 = new Estudiante("Lorena", "Aguilar", 19, "Comunicación", 5f);

    Estudiante[] estudiantes = {e1, e2, e3, e4, e5, e6};

    for (Estudiante i : estudiantes)
    {
        System.out.println("Nombre: " + i.getNombre() + " " + i.getApellido() + " Promedio: " + i.getPromedio());
    }

    e1.agregarMateria(new Materia("Matemáticas",1001,4,8));
    e1.agregarMateria(new Materia("Programación", 1002, 3, 7));

    e1.calcularPromedioMaterias();

    carrera.agregarEstudiante(e1);
    carrera.agregarEstudiante(e2);

    carrera.listarEstudiantes();

    carrera.buscarEstudiante("Ana");
    }
}