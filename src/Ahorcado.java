import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase scanner para que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        // estructura de control: iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }
        // estructura de control: iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            // String.valueOf(letrasAdivinadas) es la palabra entera y se utiliza cuando se tienen una palabra de chars
            System.out.println("Palabra a adivinar : " + String.valueOf(letrasAdivinadas) + " ("+palabraSecreta.length()+ " letras )");
            System.out.println("Introduce una letra, por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0)); // Este metodo scanner.next().charAt(0) solo toma una letra
            // si la persona escribe muchas letras solo va a tomar 1
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }
                if (!letraCorrecta) {
                    intentos++;
                    System.out.println("!Incorrecto! Te quedan: " + (intentosMaximos - intentos) + " intentos.");
                }
                if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    palabraAdivinada = true;
                    System.out.println("Felicidades, has adivindado la palabra secreta: " + palabraSecreta);
                }
            }    
                if (!palabraAdivinada) {
                    System.out.println("!Que pena te has quedado suin intentos! Game Over");
                }
                scanner.close();
          
        }

    }

