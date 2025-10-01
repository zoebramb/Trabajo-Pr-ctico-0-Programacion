//va a ser el main
public class App 
{
    public static void main(String[] args) throws Exception 
    {
    
    Estudiante e1 = new Estudiante(); //por el c. sin parámetros
    Estudiante e2 = new Estudiante();
    Estudiante e3 = new Estudiante();

    Estudiante e4 = new Estudiante("Juan", "Perez", 22, "Programacion", 9);
    Estudiante e5 = new Estudiante("Sofía", "Perez", 24, "Medicina", 8);
    Estudiante e6 = new Estudiante("Lorena", "Aguilar", 19, "Comunicación", 5);

    Estudiante[] estudiantes = {e1, e2, e3, e4, e5, e6};

    for (int i =0; i < estudiantes.length; i++)
    {
        System.out.println("Nombre: " + estudiantes[i].nombre + "Promedio: " + estudiantes[i].promedio);
    }
    }
}