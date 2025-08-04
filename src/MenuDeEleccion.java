import java.util.Scanner;

public class MenuDeEleccion {

    private ConsultaApi conversor = new ConsultaApi();

    public void desplegarMenu () {
        Scanner escaner = new Scanner(System.in);
        int opcionUsuario = 0;
        String mensajeEntradaMala = "El programa solo admite números, intente de nuevo";



        while (opcionUsuario != 7) {
            System.out.println("""
                    **************************************************************************

                    Hola, esta aplicaión hará la conversión de moneda que se le muestra en
                    en el menú de elección, favor elija un número de las elecciones mostradas
                    de acorde a la conversion que usted requiera.

                    Se puede hacer estos tipos de conversiones:

                    1.) Dólar (USD) => Lempira (HNL)
                    2.) Lempira (HNL) => Dólar (USD)
                    3.) Euro (EUR) => Lempira (HNL)
                    4.) Lempira (HNL) => Euro (EUR)
                    5.) Peso mexicano (MXN) => Lempira (HNL)
                    6.) Lempira (HNL) => Peso Mexicano (MXN)
                    7.) SALIR

                    **************************************************************************""");
            System.out.println("Ingrese el número de las opciones que desea para la conversion que" +
                    " necesita");
            while (!escaner.hasNextInt()){
                System.out.println(mensajeEntradaMala);
                escaner.next();
            }
            opcionUsuario = escaner.nextInt();
            if (opcionUsuario >= 1 && opcionUsuario <= 6) {
                System.out.println(mensajeEntradaMala);
                while (!escaner.hasNextDouble()){
                    System.out.println("El programa solo admite números, intente de nuevo");
                    escaner.next();
                }
                double cantidadConvertir = escaner.nextDouble();
                procesarOpciones(opcionUsuario, cantidadConvertir);
            }
            else {
                if (opcionUsuario != 7){
                    System.out.println("Opción no válida, por favor intente con los números de las" +
                            " opciones disponibles");
                }
                else {
                    System.out.println("Gracias por haber usado la app");
                }
            }
        }
    }

    public void procesarOpciones(int opcionUsuario, double cantidadConvertir) {
        String monedaOrigen = "";
        String monedaConvertida = "";

        switch (opcionUsuario) {
            case 1 -> {
                monedaOrigen = "USD"; monedaConvertida = "HNL";
            }
            case 2 -> {
                monedaOrigen = "HNL"; monedaConvertida = "USD";
            }
            case 3 -> {
                monedaOrigen = "EUR"; monedaConvertida = "HNL";
            }
            case 4 -> {
                monedaOrigen = "HNL"; monedaConvertida = "EUR";
            }
            case 5 -> {
                monedaOrigen = "MXN"; monedaConvertida = "HNL";
            }
            case 6 -> {
                monedaOrigen = "HNL"; monedaConvertida = "MXN";
            }
            default -> { System.out.println("Opción desconocida.");
                return;
            }
        }
        double resultado = conversor.convertir(monedaOrigen, monedaConvertida, cantidadConvertir);
        if (resultado == -1){
            System.out.println("\n**************************************************************************");
            System.out.println("No se pudo realizar la coversion, la comunicacion con la api " +
                    "está fallando o introdujo carácteres no permitidos, intente de nuevo");
        }
        else {
            System.out.println("\n**************************************************************************");
            System.out.printf("El valor de %.2f %s, es de %.2f %s\n", cantidadConvertir, monedaOrigen, resultado, monedaConvertida);
            System.out.println("*************************************************************************\n");
        }
    }
}

