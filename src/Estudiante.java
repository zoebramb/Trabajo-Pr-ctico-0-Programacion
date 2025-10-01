public class Estudiante
{
    String nombre;
    String apellido;
    int edad;
    String carrera;
    float promedio;

    //constructor sin parámetros
    public Estudiante(){}

    //constructor con parámetros
    public Estudiante(String nombre,String apellido,int edad,String carrera,float promedio)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}
