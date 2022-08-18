public class Main {
    public static void main(String[] args) {
// Punto 1
        {
            int numeroIf = 0;

            if (numeroIf < 0) {
                System.out.println("Numero Negativo");
            } else if (numeroIf > 0) {
                System.out.println("Numero Positivo");
            } else {
                System.out.println("Cero");
            }
        }
// Punto 2
        {
            int numeroWhile = 3;
            while (numeroWhile < 4) {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            }
        }
// Punto 3
        {
            int numeroWhile2 = 3;
            do {
                System.out.println(numeroWhile2);
                numeroWhile2 = numeroWhile2 + 1;

            } while (numeroWhile2 < 4);
        }

// Punto 4
        {
            for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1)
            {
                System.out.println(numeroFor);
            }
        }
// Punto 5
        {
            String estacion = "VERANO";
            switch (estacion) {
                case "VERANO":
                    System.out.println("Es Verano");
                    break;
                case "INVIERNO":
                    System.out.println("Es Invierno");
                    break;
                default:
                    System.out.println("Otra Estacion");
            }

        }
    }


}
