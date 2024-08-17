package coleccionVinilos;

public class ColeccionVinilos{
    public static void main (String [] args){
        //Prueba del codigo Auto Generada
        String[][] vinilos= new String[100][3];
        agregarVinilo(vinilos,"Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "AC-DC", "Back in Black", "1981");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");
        agregarVinilo(vinilos, "Led Zeppelin", "IV", "1971");
        agregarVinilo(vinilos, "Pink Floyd", "The Dark Side of the Moon", "1973");
        agregarVinilo(vinilos, "The Beatles", "Abbey Road", "1969");
        agregarVinilo(vinilos, "Queen", "A Night at the Opera", "1975");
        agregarVinilo(vinilos, "Nirvana", "Nevermind", "1991");
        agregarVinilo(vinilos, "The Rolling Stones", "Sticky Fingers", "1971");
        agregarVinilo(vinilos, "Metallica", "Master of Puppets", "1986");

        System.out.println("Espacio máximo de la coleccion: "+vinilos.length);

        mostrarTotal(vinilos);

        mostrarDisponibles(vinilos);
        String artista = "Queen";

        System.out.println("Buscando al artista: "+ artista);

        mostrarBusquedaArtista(vinilos, artista);

        mostrarColeccion(vinilos);


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