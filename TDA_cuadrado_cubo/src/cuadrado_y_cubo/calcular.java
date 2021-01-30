package cuadrado_y_cubo;//Paquete 

public class calcular {//Clase pública
    int num;//Declaración de la variable
    
    public calcular(int num){//Declaración del método constructor
        
    }//Parentesis que cierura el método constructor
    
    public void cuadrado(int num){//Creación de la clase cuadrado
        int cuadrado=num*num;//Operación
        System.out.println("El cuadrado del número es:" +cuadrado);//Mensaje al usuario
    }//Parentesis que cierra la clase cuadrado.

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void cubo(int num){//Creación de la clase cubo
        int cubo=num*num*num;//Operación
        System.out.println("El cubo del número es:" +cubo);//Mensaje al usuario
    }//Parentesis que cierra la clase cubo.
}//Parentesis que cierra la clase calcular 
