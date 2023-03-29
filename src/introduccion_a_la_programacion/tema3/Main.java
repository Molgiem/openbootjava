package introduccion_a_la_programacion.tema3;

public class Main {
    public static void main(String[] args) {

        int suma = sumatoria(8, 15, 230);

        System.out.println(suma);

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println(miCoche.getNumeroPuertas());

    }

    public static int sumatoria(int primerTermino, int segundoTermino, int tercerTermino){
        return primerTermino + segundoTermino + tercerTermino;
    }
}

class Coche {

    private int numeroPuertas;

    public Coche(){
        numeroPuertas = 0;
    }

    public void incrementarPuertas(){
        numeroPuertas++;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }



}