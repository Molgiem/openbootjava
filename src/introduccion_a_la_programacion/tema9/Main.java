package introduccion_a_la_programacion.tema9;
public class Main {

    public static void main(String[] args){

        Cliente clienteA = new Cliente(45, "Patricia Rodriguez", 3449679082L, 3400);

        clienteA.imprimirDatos();

        Trabajador trabajadorB = new Trabajador(27, "Pedro Pérez", 8054762340L, 1300);

        trabajadorB.imprimirDatos();
    }

}

class Persona {

    private int edad;
    private String nombre;
    private long telefono;

    public Persona(int edad, String nombre, long telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void imprimirDatos(){
        System.out.println("Tu nombre es " + this.nombre);
        System.out.println("Tu edad es " + this.edad);
        System.out.println("Tu telefono es " + this.telefono);
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public long getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, long telefono, int credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tu crédito es " + credito + " euros");
    }

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, long telefono, int salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tu salario es " + salario + " euros");
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

}

