
package coleccionVinilos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu{
        public static void menuPrincipal(){

            System.out.println("------------ MenuPrincipal ------------");//Menu principal, las opciones se establecen aqui
            System.out.println("1. Lista de Vinilos");
            System.out.println("2. Agregar Vinilo");
            System.out.println("3. Buscar Artista");
            System.out.println("4. Mostrar Espacio Disponible");
            System.out.println("5. Mostrar Espacio Ocupado");
            System.out.println("6. Salir");
            accionesMenu();
        }

        public static void accionesMenu() {
            int seleccionUsuario = seleccionUsuario();
            switch (seleccionUsuario) {
                case 1:

            }

        }

        public static int seleccionUsuario(){
            int numeroOpciones = 6; //Valor modificable segun las opciones establecidas
            while (true) {
                int seleccionUsuario=0;
                try {
                    seleccionUsuario = obtenerEntero();
                    if (seleccionUsuario>0 &&seleccionUsuario<=numeroOpciones){
                        return seleccionUsuario;
                    }else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opcion Invalida!");
                }
            }
        }
        public static int obtenerEntero(){
            Scanner teclado = new Scanner(System.in);
            return teclado.nextInt();
        }
}


