import java.util.Scanner;

public class Main{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 0){
            System.out.println("========================");
            System.out.println("     TEAM GENERATOR");
            System.out.println("========================");
            System.out.println("Equipo: Ultima Fila");
            System.out.println();
            System.out.println("1. Ver miembrosss");
            System.out.println("2. Ver tecnologiassss");
            System.out.println("3. Ver informacionnn del proyectoooo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            try{
                opcion = Integer.parseInt(sc.nextLine().trim());
            }catch(NumberFormatException e){
                opcion = -1;
            }
            System.out.println();

            switch(opcion){
                case 1:
                    miembros.mostrar();
                    break;
                case 2:
                    Tecnologias.mostrar();
                    break;
                case 3:
                    Info.mostrar();
                    break;
                case 0:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Opcion no válida, escribe un número del menuu");
                    System.out.println();
            }
        }
    }
}
