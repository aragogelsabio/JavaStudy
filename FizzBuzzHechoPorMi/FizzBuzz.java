public class FizzBuzz{

/*
# **Fizz Buzz**

Fizz Buzz es una pregunta común en entrevistas para desarrolladores; ¡tan común que casi se ha vuelto un cliché!

El reto está diseñado para filtrar al 99.5% de los candidatos a trabajos de programación que no pueden usar su conocimiento de la programación de manera creativa para resolver problemas de código.

¿Quieres intentarlo?

Los números se reemplazarán por Fizz y Buzz según corresponda.

Escribe un programa **FizzBuzz.java** que imprima los números del 1 al 100… con una excepción:

- Para los múltiplos de 3, imprime Fizz en lugar del número.
- Para los múltiplos de 5, imprime Buzz.
- Para los números que son múltiplos de 3 y 5, imprime FizzBuzz.*/

public static void main(String[] args) {
 for(int i=1; i<=100; i++){
    if(i % 3 == 0 && i%5 == 0){
        System.out.println("FizzBuzz");
    }
    if(i % 3 == 0){
        System.out.println("Fizz");
    }
    if(i % 5 == 0){
        System.out.println("Buzz");
    }
    if(i % 3 !=0 && i % 5 !=0){
        System.out.println(i);
    }
 }
}
}