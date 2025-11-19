public class Universidad 
{
    private String nombre;
    private String direccion;
    //usamos la interfaz como tipo d dato
    private MiembroUniversidad[] miembros;
    private int cantidadMiembros;

    public Universidad(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.miembros = new MiembroUniversidad[100];
        this.cantidadMiembros = 0;
    }

    //Metodos
    //Para agregar cualquier miembro (estudiante, profesor o personal)
    public void agregarMiembro(MiembroUniversidad miembro)
    {
        if(cantidadMiembros < miembros.length)
        {
            miembros[cantidadMiembros] = miembro;
            cantidadMiembros++;
            System.out.println("Miembro agregado con exito!" );
        }
        else
        {
            System.out.println("La universidad está llena.");
        }
    }

    //Para listar mostrando la informacion 
    public void listarMiembros()
    {
        System.out.println("---Lista de Miembros de " + nombre + "---");
        for(int i=0; i<cantidadMiembros; i++)
        {
            System.out.println(miembros[i].obtenerInformacionCompleta());
        }
    }

    //buscar y mostrar miembros de un rol especifico
    public void mostrarPorRol(String rolBuscado)
    {
        System.out.println("---Buscando rol: " + rolBuscado + "---");
        for(int i = 0; i < cantidadMiembros; i++)
        {
            if(miembros[i].obtenerRol().equalsIgnoreCase(rolBuscado))
            {
                System.out.println(miembros[i].obtenerInformacionCompleta());
            }
        }
    }
}
