public class Estudiante extends Persona implements MiembroUniversidad
{
    private String carrera;
    private float promedio;
    private Materia[] materias;
    private int cantidadMaterias;

    public Estudiante(String nombre,String apellido,int edad,String carrera,float promedio, String documento)
    {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias= new Materia[10]; //inicializado asi se evita el null pointer
        this.cantidadMaterias = 0; 
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

    //método para agregar materias
    public void agregarMateria(Materia materia)
    {
        if(cantidadMaterias < materias.length)
        {
            materias[cantidadMaterias] = materia;
            cantidadMaterias++;
        }
        else
        {
            System.out.println("No se pueden agregar más materias");
        }
    }

    //método para calcular el promedio de las materias
    public float calcularPromedioMaterias()
    {
        if(cantidadMaterias == 0)
        {
            return 0;
        }
        float suma = 0;
        for(int i = 0; i < cantidadMaterias; i++)
        {
            suma += materias[i].getCalificacion();
        }
        return suma / cantidadMaterias;
    }

    //Metodo para mostrar las materias
    public void mostrarMaterias()
    {
        if(cantidadMaterias == 0)
        {
            System.out.println("No hay materias inscritas");
            return;
        }
        for(int i = 0; i < cantidadMaterias; i++)
        {
            System.out.println("Materia: " + materias[i].getNombre() + " - Calificación: " + materias[i].getCalificacion());
        }
    }
    public String toString()
    {
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }

    //para implementar la interfaz
    public String obtenerRol()
    {
        return "Estudiante";
    }

    public String obtenerInformacionCompleta()
    {
        return this.toString();
    }

    //Implementacion de funciones recursivas vs iterativas

    public static double calcularPromedioRecursivo(Materia[] materias, int indice)
    {
        //caso base, cuando llegue al ultimo indice termina
        if (indice == materias.length)
        {
            return 0;//hace la vuelta
        }

        //paso recursivo 
        //llama a cada indice 
        double paso = calcularPromedioRecursivo(materias, indice + 1);

        //va sumando
        double suma = materias[indice].getCalificacion() + paso;

        if (indice == 0)// cuando ya esta en el primer indice de vuelta, devuelve el promedio
        {
            return suma/materias.length;
        }

        return suma;// si no estoy en el indice 0 devuelvo la suma para que siga sumando
    }

    public double calcularPromedioIterativo()
    {
        if(materias.length == 0 || materias == null) return 0; // para evitar un dividir por 0

        double suma = 0;

        for(int i=0;i<materias.length;i++)
        {
            suma = suma + materias[i].getCalificacion();
        }

        double promedio = suma/materias.length;
        return promedio;
    }
}