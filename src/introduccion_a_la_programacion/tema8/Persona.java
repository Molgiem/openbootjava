package introduccion_a_la_programacion.tema8;

public class Persona {

    private int edad;
    private String nombre;
    private long telefono;


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
