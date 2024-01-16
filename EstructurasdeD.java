import java.util.Scanner;

public class EstructurasdeD{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        while(true){
            System.out.println("----Menu----");
            System.out.println("a. Agregar contacto");
            System.out.println("b. Buscar contacto");
            System.out.println("c. Actualizar contacto");
            System.out.println("d. Borrar contacto");
            System.out.println("x. Salir");

            String opc = en.nextLine().toLowerCase();

            switch (opc) {
                case "a":
                    System.out.println("Selecciono a");
                    break;
                case "b":
                    System.out.println("Selecciono b");
                    break;
                case "c":
                    System.out.println("Selecciono c");
                    break;
                case "d":
                    System.out.println("Selecciono d");
                    break;
                case "x":
                    System.out.println("Saliendo...");
                    en.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecciono una opcion no valida, pruebe de nuevo");
                    break;
            }
        }
    }
}
