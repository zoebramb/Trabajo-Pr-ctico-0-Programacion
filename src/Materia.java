public class Materia
{
    private String nombre;
    private int codigo;
    private int creditos;
    private float calificacion;
    private Profesor profesor;
 
    //crear constructor vacio
    public Materia(){};

    //constructor con parámetros
    public Materia(String nombre, int codigo, int creditos, float calificacion, Profesor profesor)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
        this.profesor = profesor;
    }

    //getters y setters
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
         if (nombre == null || nombre.isEmpty() == true){
            System.out.println("El nombre no puede estar vacio");
        }
        else{
        this.nombre = nombre;
        }
    }

    public int getCodigo()
    {
        return codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCreditos()
    {
        return creditos;
    }
    public void setCreditos(int creditos)
    {
        this.creditos = creditos;
    }
    
    public float getCalificacion()
    {
        return calificacion;
    }
    public void setCalificacion(float calificacion)
    {
        this.calificacion = calificacion;
    }

    public Profesor getProfesor()
    {
        return profesor;
    }
    public void setProfesor(Profesor profesor)
    {
        this.profesor = profesor;
    }

    //tengo que instanciar en main
    public String toString()
    {
        return "Materia: " + nombre + ", Código: " + codigo + ", Créditos: " + creditos + ", Calificación: " + calificacion + ", Profesor: " + profesor.getNombre() + " " + profesor.getApellido();
    }

    
}