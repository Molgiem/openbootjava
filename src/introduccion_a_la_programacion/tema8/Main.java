package introduccion_a_la_programacion.tema8;

public class Main {

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(32);
        persona.setNombre("Carlos Trujillo");
        persona.setTelefono(3126097019L);

        System.out.println("Tu nombre es " + persona.getNombre());
        System.out.println("Tu edad es " + persona.getEdad());
        System.out.println("Tu teléfono es " + persona.getTelefono());


    }

}
