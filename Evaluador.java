import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//En la clase Evaluador, escribe el código para evaluar las calificaciones de un estudiante para tres materias distintas como mínimo.
        float calificacion1 =0f;
        float calificacion2 =0f;
        float calificacion3 =0f;
//Pide al usuario que ingrese la calificación del estudiante por cada materia y guarda cada valor en su variable.
        System.out.println("Ingrese notas de matematicas:");
        calificacion1 = sc.nextFloat();
        System.out.println("Ingrese notas de lenguaje");
        calificacion2 = sc.nextFloat();
        System.out.println("Ingrese notas de biologia");
        calificacion3 = sc.nextFloat();
//Utiliza estructuras condicionales (if, else if, else) para determinar y mostrar la calificación final correspondiente según las siguientes condiciones:
        if (calificacion1 <=3 && calificacion1 >0){
            System.out.println(" No Aprobado");
        }else if(calificacion1 >3 && calificacion1 <=5){
            System.out.println(" Insuficiente");
        }else if(calificacion1 >5 && calificacion1 <=9){// cambie 8 por nueve por que 9 quedaba en el invalido
            System.out.println("Aceptable");
        }else if(calificacion1 ==10){
            System.out.println("Excelente");
        } else {
            System.out.println("Dato no aceptado, es invalida por que los datos no son correctos");
        }
//2
        if (calificacion2 <=3 && calificacion2 >0){
            System.out.println(" No Aprobado");
        }else if(calificacion2 >3 && calificacion2 <=5){
            System.out.println(" Insuficiente");
        }else if(calificacion2 >5 && calificacion2 <=9){// cambie 8 por nueve por que 9 quedaba en el invalido
            System.out.println("Aceptable");
        }else if(calificacion2 ==10){
            System.out.println("Excelente");
        } else {
            System.out.println("Dato no aceptado, es invalida por que los datos no son correctos");
        }
// 3
        if (calificacion3 <=3 && calificacion3 >0){
            System.out.println(" No Aprobado");
        }else if(calificacion3 >3 && calificacion3 <=5){
            System.out.println(" Insuficiente");
        }else if(calificacion3 >5 && calificacion3 <=9){// cambie 8 por nueve por que 9 quedaba en el invalido
            System.out.println("Aceptable");
        }else if(calificacion3 ==10){
            System.out.println("Excelente");
        } else {
            System.out.println("Dato no aceptado, es invalida por que los datos no son correctos");
        }
            //"No Aprobado" si la calificación es 3 o menos.

//"Insuficiente" si la calificación es mayor que 3 pero menor o igual a 5.
//"Aceptable" si la calificación es mayor que 5 pero menor o igual a 8.
//"Excelente" si la calificación es 10.
//Si el usuario ingresa un número negativo o fuera del rango de 0 a 10, muestra un mensaje indicando que la entrada es inválida.


    }//este es fin de la llave main
}
