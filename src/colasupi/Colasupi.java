
package colasupi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colasupi {

   static int opcion  = 0;
   static int elemento = 0;
    public static void main(String[] args) {
      Clasecola cola = new Clasecola();
      Clasecola cajero1 = new Clasecola();
      Clasecola cajero2 = new Clasecola();
      Clasecola cajero3 = new Clasecola();
      Clasecola cajero4 = new Clasecola();
      BufferedReader leer = new BufferedReader
        (new InputStreamReader(System.in));      
      
        do {
          try {
              System.out.println("**** Elija una opcion ****");
              System.out.println("1- Ingresar elementos");
              System.out.println("2-Eliminar elementos");
              System.out.println("3- Ver si la cola esta vacia");
              System.out.println("4- Ver el frente de la cola");
              System.out.println("5- Borrar todo");
              System.out.println("6- Ver si la cola esta llena");
              System.out.println("7- Salir");
              opcion = Integer.parseInt(leer.readLine());
              
              if (opcion==1) {
                  if (cola.Colallena()) {
                      System.out.println("COLA ESTA LLENA NO SE PUEDEN INGRESAR ELEMENTOS");
                  } else
                  {
                      System.err.print("Digite un elemento: ");
                      elemento = Integer.parseInt(leer.readLine());
                      try {
                          cola.insertar(elemento);
                      } catch (Exception ex) {
                          Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
              }
          } catch (IOException ex) {
              Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
          }
            
            if (opcion==2) {
                if (cola.ColaVacia()) {
                    System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                } else
                {   try {
                    System.out.println(cola.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion==3) {
                if (cola.ColaVacia()) 
                    System.err.println("LA COLA ESTA VACIA");
                 else
                    System.err.println("LA COLA NO ESTA VACIA");
            }
            
            if (opcion == 4) {
                if (cola.ColaVacia()) {
                    System.err.println("LA COLA ESTA VACIA");
                } else
                {
                    try {
                        System.out.println("El frente es: " + cola.frente());
                    } catch (Exception ex) {
                        Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion == 5) {
                cola.Borrartodo();
            }
            
            if (opcion == 6) {
                if (cola.Colallena())
                    System.err.println("LA COLA ESTA LLENA");
                   else
                    System.err.println("LA COLA NO ESTA LLENA");
            }
            
        } while (opcion!=7);

    }

}
