//Proyecto Final para Data Ops
//Aluma:Eglita R, Mical Pinedo Llerena

package proyecto_final_dataops;
//Paquete de dtos e/s datos por consola
import java.util.Scanner;
public class Proyecto_Final_DataOps{
  //Método principal  
  public static void main(String[] args){
     //Declarar variables
     int vt1,vt2,vt3;
     double sm,pt,c;
     String vendedor;
     //creando el objeto lectura
     Scanner lectura=new Scanner(System.in);
     //Entrada de datos
     System.out.print("Nombre de Vendedor:");
     vendedor=lectura.next();
     System.out.print("Sueldo Mensual:");
     sm=lectura.nextDouble();
     System.out.print("Venta 1:");
     vt1=lectura.nextInt();
     System.out.print("Venta 2:");
     vt2=lectura.nextInt();
     System.out.print("Venta 3:");
     vt3=lectura.nextInt();
     //Proceso de datos
     c=(vt1+vt2+vt3)*0.10;
     pt=sm+c;
     //Salida de datos
     System.out.println("La comision de la venta es       :"+c);
     System.out.println("El Sueldo mensual del vendedor es:"+pt);
   }  // Fin del método
}// Fin de la clase
