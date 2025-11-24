import java.util.Objects; //importar objetos para usar en equals y hascode

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    //constructor
    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    //getters y setters
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        if (nombre == null || nombre.isEmpty() == true) {
            System.out.println("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
    }
    public String getApellido() 
    {
        return apellido;
    }
    public void setApellido(String apellido) 
    {
        if (apellido == null || apellido.isEmpty() == true) {
            System.out.println("El apellido no puede estar vacio");
        } else {
            this.apellido = apellido;
        }
    }
    public int getEdad() 
    {
        return edad;
    }
    public void setEdad(int edad) 
    {
       this.edad=edad;
    }
    public String getDocumento() 
    {
        return documento;
    }
    public void setDocumento(String documento) 
    {
        if (documento == null || documento.isEmpty() == true) {
            System.out.println("El documento no puede estar vacio");
        } else {
            this.documento = documento;
        }
    }

    public String toString() 
    {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Documento: " + documento;
    }

    public boolean equals(Object o)
    {
        if(this == o) return true; //se "mira" a si mismo y si es la variabje está apuntando al mismo lugar de memoria es el mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // compara si son de la misma clase
        Persona persona = (Persona) o; // equals recibe o que es de tipo objeto pero no sabe q tiene como atributo documento. con esto hacemos que se trate a o como una persona
        return Objects.equals(documento, persona.documento);//comparacion
    }

    //El hash code va a generar una etiqueta única por documento pq si se crean dos documentos iguales sin esto, java los guarda en distintos lugares de memoria.
    public int hashCode()
    {
        return Objects.hash(documento);
    }
}
