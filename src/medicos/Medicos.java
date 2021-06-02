/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicos;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Medicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Clase miClase = new Clase();
        Scanner entrada = new Scanner(System.in);
        
        miClase.setNro_leg(entrada.nextLine());
        miClase.setNombre(entrada.nextLine());
        
        System.out.println("Nro_leg: = " + miClase.getNro_leg());
        System.out.println("Nombre = " + miClase.getNombre());
        
    }
}
       class Clase{
        private String Nro_leg;
        private String Nombre;
        
        public String getNro_leg(){
            return Nro_leg;
        }
        public void setNro_leg(String Nro_leg9){
            this.Nro_leg = Nro_leg;
        }
        public String getNombre() {
            return Nombre;
        }
        public void setNombre(String Nombre){
            this.Nombre = Nombre;
            
         
        }
    }
    

