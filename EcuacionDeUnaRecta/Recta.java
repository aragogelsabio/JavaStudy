public class Recta{
    /*Este programa calcula la ecuación de una recta que pasa por los puntos A(x1,y1) y B(x2,y2) */
    //atributos de la recta
    double y2;
    double y1;
    double x2;
    double x1;
    double m; //*Pendiente de la recta */
    double b; //*Punto de intersección con el eje y */

    //Constructor de la recta
    public Recta(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2; 
    }

    //Método para calcular la pendiente de la recta
    public double pendiente(){
        m = (y2 - y1) / (x2 - x1);
        System.out.println("La pendiente de la recta que pasa por los puntos A(" + x1 + " , " + y1 + ") y B(" + x2 + " , " + y2 + ") es:" + m);
        return m;
    }

    //Método para calcular el punto de intersección con el eje y
    public double interseccion(){
        m = (y2 - y1) / (x2 - x1);
        b = y1 - (m * x1);
        System.out.println("El punto de intersección con el eje y de la recta que pasa por los puntos A(" + x1 + " , " + y1 + ") y B(" + x2 + " , " + y2 + ") es:" + b);
        return b;
    }

    //Método para dar la ecuación de la recta
    public void ecuacion(){
        m = (y2 - y1) / (x2 - x1);
        b = y1 - (m * x1);
        System.out.println("La ecuación de la recta que pasa por los puntos A(" + x1 + " , " + y1 + ") y B(" + x2 + " , " + y2 + ") es: y = " + m + "*x + " + b);
    }
}