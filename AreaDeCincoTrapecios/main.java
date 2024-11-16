public class main{
    public static void main(String[] args) {
    
      //Creación de los trapecios
      Trapecios figura1 = new Trapecios(2, 5.4, 10);
      Trapecios figura2 = new Trapecios(4, 8, 10);
      Trapecios figura3 = new Trapecios(3, 7, 10);
      Trapecios figura4 = new Trapecios(5, 8, 10.1);
      Trapecios figura5 = new Trapecios(5, 3, 2);
      
      //Cálculo del área de los trapecios llamando el método areaTrapecios
      double area1 = figura1.areaTrapecios();
      double area2 = figura2.areaTrapecios();
      double area3 = figura3.areaTrapecios();
      double area4 = figura4.areaTrapecios();
      double area5 = figura5.areaTrapecios();

      //Impresión del área de cada trapecio
      System.out.println("El área del trapecio 1 es: " + area1);
      System.out.println("El área del trapecio 2 es: " + area2);
      System.out.println("El área del trapecio 3 es: " + area3);
      System.out.println("El área del trapecio 4 es: " + area4);
      System.out.println("El área del trapecio 5 es: " + area5);

      //Cálculo del promedio del área de los trapecios
      double promedio= Trapecios.promedioTrapecios(area1, area2, area3, area4, area5);
      System.out.println ("El promedio del área de los cinco trapecios es:" + promedio);
      }



     }