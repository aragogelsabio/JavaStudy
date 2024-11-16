public class Trapecios {
    // Atributos de la clase
    double altura1;
    double altura2;
    double base;

    //Constructor del trapecio
    public Trapecios (double alturaDelTrapecio1, double alturaDelTrapecio2, double baseDelTrapecio){
      altura1 = alturaDelTrapecio1;
      altura2 = alturaDelTrapecio2;
      base = baseDelTrapecio;
    }
      
    //Método que calcula el área de los trapecios
    public double areaTrapecios (){
      return base * ((altura1 + altura2) / 2);
    }


    //Método que calcula el promedio del área de los trapecios
    public static double promedioTrapecios (double area1, double area2, double area3, double area4, double area5){
        return (area1 + area2 + area3 + area4 + area5)/5;
    }
  
  
  }