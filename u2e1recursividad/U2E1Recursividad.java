package u2e1recursividad;

import java.util.Scanner;


public class U2E1Recursividad {

    public static void main(String[] args) {
        U2E1Recursividad metodo = new U2E1Recursividad ();
        Scanner leer = new Scanner (System.in);
        int opc, x;
        
         do {
            System.out.println("\n\nElija una opcion: "
                    + "\n1.-Sucesión de Fibonacci."
                    + "\n2.-Mostrar del 1 al 10."
                    + "\n3.-factorial"
                    + "\n4.-Números en escalerita."
                    + "\n5.-Palindromos"
                    + "\n6.-Salir.");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese el tamaño de la serie");
                    x=leer.nextInt();
                    for (int i=0; i<x; i++) {
                        System.out.println(metodo.fibonacci(i));
                    }
                    
                    break;
                case 2:
                    metodo.opc2(1);
                    break;
                case 3: 
                    System.out.println("Ingrese un numero para ver su factorial: ");
                    x = leer.nextInt();
                    System.out.println("El factorial es: "+metodo.factorial(x));
                    break;
                case 4:
                    metodo.escalerita(10);
                    break;
                case 5:
         System.out.println(metodo.palidromos("ana",0,2));

         break;
                    
                    default:
            }
        } while (opc != 6);
    
                    
            }
           
           public void opc2(int x){
               if (x<=10){
                   System.out.print(x + " ");
                   opc2(x+1);
               }
           }
           public int fibonacci(int i){
    if (i>1){
       return fibonacci(i-1) + fibonacci(i-2);  //función recursiva
    }
    else if (i==1) {  // caso base
        return 1;
    }
    else if (i==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1;       
        
    }
    
}
          public double factorial(int n){
             
     if (n==0||n==1){
             return 1;
         } else{
             return n * factorial(n-1);
         }
    }   
          public void escalerita (int x){
              if (x > -1) {
            for (int i = 0; i <= x; i++) {
                System.out.print(" "+i);
            }
                  System.out.println(" ");
            escalerita(x - 1);
        }
          }
              
        public boolean palidromos(String palabra, int i, int fin) {
            
     if(i<palabra.length()){
         
        if (palabra.charAt(i) == palabra.charAt(fin)){ 
           System.out.println("es igual");
      return palidromos(palabra, i +1, fin-1);}
      
        else {
            System.out.println("no es igual");
      return false;
        } 
        
       } 
return true; 
 }   
         }
