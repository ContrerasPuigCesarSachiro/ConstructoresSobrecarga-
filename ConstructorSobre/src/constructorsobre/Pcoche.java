/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsobre;

/**
 *
 * @author sachs
 */
public class Pcoche {
    void imprimeCoche(Coche gas)
   {
     //   gas.nombre equivale en este caso a gas.getNombre()
     System.out.println("\nNombre: " + gas.nombre );
     System.out.println("Litros de gasolina: " + gas.getGasolina() +"\n" );

   }

   public static void main(String args[])
   {
      Pcoche prog = new Pcoche( );
      /* Se declaran dos objetos de la clase Coche */
      Coche gas1,gas2;

      /* Se utiliza el constructor por omisión */
      gas1 = new Coche( );
      prog.imprimeCoche(gas1);

     /* Se utiliza el segundo constructor de Coche */
      gas2 = new Coche("Neon",14);
      prog.imprimeCoche(gas2);

     /* Se utiliza el tercer constructor de Coche */
      gas1 = new Coche(gas2);

      gas1.setGasolina(20);
      gas2.setGasolina(19.99f);

      prog.imprimeCoche(gas1);
      prog.imprimeCoche(gas2);
   }

}
