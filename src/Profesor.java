public class Profesor extends Persona implements MiembroUniversidad
{
    private String especialidad;
    private int añosExperiencia;
    private Materia[] materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.materiasAsignadas = new Materia[5]; // Capacidad para 5 materias   
    }
    // Getters y Setters
    public String getEspecialidad() 
    {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }
    public int getAñosExperiencia() 
    {
        return añosExperiencia;
    }  
    public void setAñosExperiencia(int añosExperiencia) 
    {
        this.añosExperiencia = añosExperiencia;
    }
    public Materia[] getMateriasAsignadas() 
    {
        return materiasAsignadas;
    }
    public void setMateriasAsignadas(Materia[] materiasAsignadas) 
    {
        this.materiasAsignadas = materiasAsignadas;
    }
    
    //Método para asignar materias
    public void asignarMateria(Materia materia) 
    {
        for (int i = 0; i < materiasAsignadas.length; i++) 
        {
            if(materiasAsignadas[i] == null)
            {
                materiasAsignadas[i] = materia;
                return;  
            }   
        }
    }

    public String toString()
    {
        return "Profesor: " + getNombre() + " " + getApellido() + ", Especialidad: " + especialidad + ", Años de Experiencia: " + añosExperiencia;
    }

    //Para implementar la interfaz
    public String obtenerRol()
    {
        return "Profesor";
    }
    public String obtenerInformacionCompleta()
    {
        return this.toString();
    }


}