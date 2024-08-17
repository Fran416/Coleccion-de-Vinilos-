package coleccionVinilos;

public class ColeccionVinilos{
    public static void main() {
        String[][] coleccionVinilos= new String[100][3];
    }

    public static int totalVinilos(String[][] matrizVinilos){
        int contador=0;
        for (int fila=matrizVinilos.length-1; fila>=0; fila--){
            for (int columna=0; columna<matrizVinilos[fila].length; columna++){
                if (matrizVinilos[fila][columna] != null){
                    contador+=1;
                }
            }
        }
        return contador;
    }

    public static String[][] agregarVinilo(String[][] matrizVinilos, String grupo, String disco, String fecha){
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]==null){
                matrizVinilos[fila][0]=grupo;
                matrizVinilos[fila][1]=disco;
                matrizVinilos[fila][2]=fecha;
                return matrizVinilos;}
        }
        return matrizVinilos;
    }

    public static boolean buscarArtista(String matrizVinilos[][], String artista){
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0].equals(artista)){
                return true;
            }
        }
        return false;
    }

    public static void mostrarColeccion (String[][] matrizVinilos){
        int contador=1;
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]!=null)
            {System.out.println("Fila "+contador+": "+matrizVinilos[fila][0]+" | "+matrizVinilos[fila][1]+" | "+matrizVinilos[fila][2]);
                contador++;}
        }
    }

    public static void mostrarTotal (String[][] matrizVinilos){
        int espacioOcupado = totalOcupados(matrizVinilos);
        System.out.println("Hay un total de: "+ espacioOcupado +" Vinilos");
    }

    public static int totalOcupados(String[][] matrizVinilos){
        int contador=0;
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]!=null){
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarDisponibles (String[][] matrizVinilos){
        int espacioDisponible = disponibles(matrizVinilos);
        System.out.println("Hay un total de: "+espacioDisponible +" en espacio disponible");
    }

    public static int disponibles(String[][] matrizVinilos){
        int contador=0;
        for(int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]==null){
                contador+=1;
            }
        }
        return contador;
    }

    public static void mostrarBusquedaArtista(String[][] matrizVinilos, String artista){
        if (buscarArtista(matrizVinilos, artista)){
            System.out.println("El artista "+artista+" si esta en la coleccion");
        } else {
            System.out.println("El artista "+artista+" no esta en la coleccion");
        }
    }

}