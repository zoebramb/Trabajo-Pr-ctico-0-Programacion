public class App 
{
public static void main(String[] args) 
{
Universidad uni = new Universidad("UNViMe", "Garcia Lorca 123");

Carrera carrera = new Carrera("Programacion");    

Estudiante e1 = new Estudiante("Zoe", "Brambilla", 23, "Programacion", 6, "44480512"); //por el c. sin parámetros
Estudiante e2 = new Estudiante("rodrigo","silva",24,"test",4,""); //por el c. sin parámetros
Estudiante e3 = new Estudiante("Juan", "Martinasso", 23, "Programacion", 9, "44479196");


Profesor p1 = new Profesor("Albert", "Einstein", 60, "22222222", "Física", 30);

Personal admin1 = new Personal("Maria", "Lopez", 35, "33333333", "Secretaria", "Administración", "2015-03-01");

//agregarlos a la misma lista
uni.agregarMiembro(e1);
uni.agregarMiembro(e2);
uni.agregarMiembro(e3);
uni.agregarMiembro(p1);
uni.agregarMiembro(admin1);

//para mostrar todos los miembros
uni.listarMiembros();

//para filtrar por rol
uni.mostrarPorRol("Estudiante");

//uso de recursividad e iteracion

double promedioR = e1.calcularPromedioRecursivo(e1.getMaterias(), 0);
System.out.println("El promedio de " + e1.getNombre() + " es: "+ promedioR);

double promedioI = e3.calcularPromedioIterativo();
System.out.println("El promedio de " + e3.getNombre() + " es: "+ promedioI);

}
}