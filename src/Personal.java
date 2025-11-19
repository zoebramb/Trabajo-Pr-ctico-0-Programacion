public class Personal extends Persona implements MiembroUniversidad
{
    private String puesto;
    private String departamento;
    private String fechaIngreso;

    public Personal(String nombre, String apellido, int edad, String documento, String puesto, String departamento, String fechaIngreso) {
        super(nombre, apellido, edad, documento);
        this.puesto = puesto;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
    }
    // Getters y Setters
    public String getPuesto() 
    {
        return puesto;
    }
    public void setPuesto(String puesto) 
    {
        this.puesto = puesto;
    }
    public String getDepartamento() 
    {
        return departamento;
    }
    public void setDepartamento(String departamento) 
    {
        this.departamento = departamento;
    }
    public String getFechaIngreso() 
    {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) 
    {
        this.fechaIngreso = fechaIngreso;
    }

    public String toString()
    {
        return "Personal: " + getNombre() + " " + getApellido() + ", Puesto: " + puesto + ", Departamento: " + departamento + ", Fecha de Ingreso: " + fechaIngreso;
    }
    
    //para implemenatr la interfaz
    public String obtenerRol()
    {
        return "Personal";
    }
    public String obtenerInformacionCompleta()
    {
        return this.toString();
    }

}
