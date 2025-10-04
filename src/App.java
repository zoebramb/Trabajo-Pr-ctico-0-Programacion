//va a ser el main
public class App 
{
    public static void main(String[] args) throws Exception 
    {
    
    Estudiante e1 = new Estudiante(); //por el c. sin parámetros
    Estudiante e2 = new Estudiante();
    Estudiante e3 = new Estudiante();
    e3.setNombre("Ana");
    e3.setApellido("García");
    e3.setEdad(20);
    e3.setCarrera("Ingeniería");
    e3.setPromedio(8.5f);

    Estudiante e4 = new Estudiante("Juan", "Perez", 22, "Programacion", 9f);
    Estudiante e5 = new Estudiante("Sofía", "Perez", 24, "Medicina", 8f);
    Estudiante e6 = new Estudiante("Lorena", "Aguilar", 19, "Comunicación", 5f);

    Estudiante[] estudiantes = {e1, e2, e3, e4, e5, e6};

    for (Estudiante i : estudiantes)
    {
        System.out.println("Nombre: " + i.getNombre() + " " + i.getApellido() + " Promedio: " + i.getPromedio());
    }
    }
}