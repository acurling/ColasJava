
package colasupi;



public class Clasecola {
    
    // Atributos
    private static final int MAXTAM = 10; // variable constante
    private static int frente;
    private static int ultimo;
    private int []cola;
    
 public Clasecola()
 {
    frente = 0;
    ultimo = -1;
    cola = new int [MAXTAM];
 }   
 
 public void insertar(int elemento)throws Exception
 {
     if (!Colallena())
         cola[++ultimo] = elemento;
    else
         throw new Exception("LA COLA ESA LLENA");
 }
 
  public int eliminar()throws Exception
 {
     if (!ColaVacia())
       return cola[frente++];
    else
      throw new Exception("LA COLA ESTA VACIA");
 }

  public void Borrartodo()
  {
     frente = 0;
     ultimo = -1;
  }
  
  public int frente() throws Exception
  {
      if (!ColaVacia()) 
          return cola[frente];
      else
     throw new Exception("LA COLA ESTA VACIA");
  }
  
  
 public boolean Colallena()
 {
   return ultimo == MAXTAM - 1;
 }
 
 public boolean ColaVacia()
 {
   return frente > ultimo;
 }
}
