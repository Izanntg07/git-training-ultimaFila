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
            System.out.println("1. Ver miembros");
            System.out.println("2. Ver tecnologias");
            System.out.println("3. Ver informacion del proyecto");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
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
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
