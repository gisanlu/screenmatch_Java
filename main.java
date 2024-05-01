
import java.util.Scanner;

public class main {

    public static void main(String[] args){
       /* System.out.println("Holi Boli");
        System.out.println("Película Orgullo y Prejuicio");*/ 

        //declaramos variables
        int fechaDeLanzamiento = 2005; //numeros enteros dato primitivo
        double evaluacion = 3.5; // numeros con decimales, dato primitivo
        boolean incluidoPlanBasico = true; // booleano, dato primitivo
        String nombre = "Orgullo y Prejuicio"; // String, objeto, es texto
        String sinopsis = """
                Orgullo y Prejuicio, un clásico de Jane Austen
                """;
        double mediaEvaluacionUsuario = 0;


        //estamos imprimiendo variables 
        System.out.println("Película "+ nombre);
        System.out.println("Año " + fechaDeLanzamiento);
        System.out.println("Rating " + evaluacion);
        System.out.println("Incluído en el plan Básico" + incluidoPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3.5 )/ 3;
        System.out.println("Media de evaluacion de Orgullo y Prejuicio " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula reciente");
        
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }
        for(int i = 0; i < 3; i++){ //este ciclo se romperá al llegar a 4 
            Scanner teclado = new Scanner(System.in); //ingreso de dato de usuario
            System.out.println("Ingresa tu evaluacion a esta pelicula"); //texto que mostrará al usuario
            double notaOrgulloPrejuicio = teclado.nextDouble(); //declaramos tipo de dato que ingresa el usuario
            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + notaOrgulloPrejuicio); //acumulando los valores ingresados
        }
        
        //afuera porque de lo contrario el promedio no resultaría correcta la operación 
        System.out.println(" la media de Orgullo y Prejuicio es: " + mediaEvaluacionUsuario / 3); //cuando rompe el ciclo, muestra el texto concatenado a el promedio de media evaluación, ya que se sumaron 3 valores, por ello la división es entre 3 
    }
    

}