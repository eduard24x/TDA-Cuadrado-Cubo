package cuadrado_y_cubo;//Paquete

import java.util.Scanner;//Importación del Scanner

public class TDA_cuadrado_cubo {//Clase pública

    public static void main(String[] args) {//Clase void
        int num;//Declaración de la variable
        
        Scanner quien=new Scanner (System.in);//Creación del Scanner
        calcular dias;//Creación del objeto
    
        System.out.println("Introduzca el número: ");//Mensaje al usuario
        num=quien.nextInt();//Leer número introducido
        
        dias=new calcular(num);//instanciación del objeto
        
        System.out.println("El numero introducido es:" +num);//Mensaje al usuario
        dias.cuadrado(num);//Llamada del método cuadrado
        dias.cubo(num);//Llamada del método cubo
    }//Parentesis que cuerra la clase public void
}//Parentesis que cierra la clase void