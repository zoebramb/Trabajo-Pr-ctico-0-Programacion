public class Materia
{
    private String nombre;
    private int codigo;
    private int creditos;
    private float calificacion;
 
    //crear constructor vacio
    public Materia(){};

    //constructor con parámetros
    public Materia(String nombre, int codigo, int creditos, float calificacion)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
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


    
}