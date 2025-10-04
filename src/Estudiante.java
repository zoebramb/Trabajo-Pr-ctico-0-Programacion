public class Estudiante
{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private float promedio;

    //constructor sin parámetros
    public Estudiante(){}

    //constructor con parámetros ahora con set ya que encapsulamos los atributos
    public Estudiante(String nombre,String apellido,int edad,String carrera,float promedio)
    {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
    }
    //getter y setter de nombre
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
    //getter y setter de apellido
    public String getApellido()
    {
        return apellido;
    }
    public void setApellido (String apellido)
    {
        if (apellido == null || apellido.isEmpty() == true)
        {
            System.out.println("El apellido no puede estar vacio");
        }
        else
        {
        this.apellido = apellido;
        }
    }
    //getter y setter de edad
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        // exigir mayor o igual a 16 años
        if (edad < 16)
        {
            System.out.println("Tiene que ser mayor de 16 años");
        }
        else
        {
            this.edad = edad;
        }
    }
    //getter y setter de carrera
    public String getCarrera()
    {
        return carrera;
    }
    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }
    //getter y setter de promedio
    public float getPromedio()
    {
        return promedio;
    }
    public void setPromedio(float promedio)
    {
        // aceptar valores entre 0 y 10 (inclusive)
        if(promedio >= 0 && promedio <= 10)
        {
            this.promedio = promedio;
        }
        else
        {
            System.out.println("El promedio debe estar entre 0 y 10");
        }
    }
}
