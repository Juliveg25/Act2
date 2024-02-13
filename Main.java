import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserte valores para x y y: ");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter x :");
        float x = myScanner.nextFloat();

        System.out.println("Enter y :");
        float y = myScanner.nextFloat();
        myScanner.close();
        evaluateFunction(x, y);
    }
    public static void evaluateFunction(float x, float y) {
        float quadraticEquation = x * x + 2 * x * y + y * y;
        if (quadraticEquation == 0) {
            System.out.println("Por metodo de factorizacion (x+y)^2=0 y los valores ingresados x = " + x + " y y = " + y + " satisfacen la ecuacion.");
        } else {
            System.out.println("Los valores ingresados no satisfacen la ecuacion ya que (x+y)^2 !=0 ");
        }
    }
}