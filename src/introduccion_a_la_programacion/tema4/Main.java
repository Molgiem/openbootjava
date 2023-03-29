package introduccion_a_la_programacion.tema4;

public class Main {

    public static void main(String[] args){

        int numeroIf = 8;

        if(numeroIf > 0){
            System.out.println("El número es positivo");
        } else if(numeroIf == 0){
            System.out.println("El número es cero");
        } else {
            System.out.println("el número es negativo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);

        for(int numeroFor = 0 ; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "Verano";

        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera.");
                break;
            case "Verano":
                System.out.println("Es verano.");
                break;
            case "Otoño":
                System.out.println("Es otoño.");
                break;
            case "Invierno":
                System.out.println("Es invierno.");
                break;
            default:
                System.out.println(estacion + " no es una estacion valida");
                break;
        }


    }
}
