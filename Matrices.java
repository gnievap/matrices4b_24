import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Matrices {
    // Para aprendizaje de las características de Arreglos Bidimensionales
    public static void main(String[] args) throws IOException{
        // Matriz cuadrada
        int[][] matriz1 = new int[3][3];
        int numero = 0;

        // Introducir valores a la matriz cuadrada
        System.out.println();
        for (int i = 0; i < 3; i++ ){
            for ( int j = 0; j < 3; j++ ){
                matriz1[i][j] = numero;
                numero++;
                System.out.print(matriz1[i][j] + "     ");
            }
            System.out.println();
        }

        // Matriz no cuadrada
        int[][] matriz2 = new int[3][5];
        numero = 10;
        System.out.println();
        for (int i = 0; i < matriz2.length; i++ ){
            for ( int j = 0; j < matriz2[i].length; j++ ){
                matriz2[i][j] = numero;
                numero++;
                System.out.print(matriz2[i][j] + "     ");
            }
            System.out.println();
        }

        // Ejemplo de una matriz construida con valores
        System.out.println();
        char[][] matriz3 = { {'a', 'b', 'c'}, {'d', 'e'}, {'f'},
                             {'g', 'h', 'i', 'j'}};
        for ( int i = 0; i < matriz3.length; i++ ){
            for( int j = 0; j < matriz3[i].length; j++){
                System.out.print(matriz3[i][j] + "    ");
            }
            System.out.println();
        }

        // Construcción de una matriz irregular desde teclado
        int[][] matriz4;
        int r, c; // renglones y columnas
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Construcción de una matriz irregular");
        System.out.println("Escribe el número de renglones:");
        entrada = bufer.readLine();
        r = Integer.parseInt(entrada);
        //Construir matriz4
        matriz4 = new int[r][];
        for ( int i = 0; i < matriz4.length; i++){
            System.out.println("Escribe columnas para renglón " + i + ":");
            entrada = bufer.readLine();
            c = Integer.parseInt(entrada);
            matriz4[i] = new int[c];
            for ( int j = 0; j < matriz4[i].length; j++ ){
                System.out.println("Escribe el valor de [" + i + "][" + j +"]: ");
                entrada = bufer.readLine();
                matriz4[i][j] = Integer.parseInt(entrada);
            }
        }
        System.out.println("Contenido de matriz4: ");
        for ( int i = 0; i < matriz4.length; i++ ){
            for( int j = 0; j < matriz4[i].length; j++){
                System.out.print(matriz4[i][j] + "    ");
            }
            System.out.println();
        }

    }
}