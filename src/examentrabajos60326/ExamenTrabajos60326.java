/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrabajos60326;

/**
 *
 * @author Jun
 */
public class ExamenTrabajos60326 {

    private static String nombre;
    private static String descripción;
    private static String habilidades;
    private static Integer experiencia;
    private static String nivel;
    
    public ExamenTrabajos60326(String nombre, String descripción, String habilidades, Integer experiencia, String nivel){
        ExamenTrabajos60326.nombre = nombre;
        ExamenTrabajos60326.descripción = descripción;
        ExamenTrabajos60326.habilidades = habilidades;
        ExamenTrabajos60326.experiencia = experiencia;
        ExamenTrabajos60326.nivel = nivel;
    }
    
    public static int sueldo(){
      int Salario = 0;
      if(nivel.equalsIgnoreCase("jr")){
          Salario = 1000 * (1 + (experiencia / 10));
      } else if(nivel.equalsIgnoreCase("sr")){
          Salario = 1500 * (1 + (experiencia / 10));
      } else if(nivel.equalsIgnoreCase("Leader")){
          Salario = 2000 * (1 + (experiencia / 10));  
      } else if(nivel.equalsIgnoreCase("Boss")){
          Salario = 2500 * (1 + (experiencia / 10));
      }
      return Salario;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExamenTrabajos60326 Exam = new ExamenTrabajos60326("designer", "desarrollo de aplicaciones", "programación web", 3, "Leader");
        System.out.println(sueldo());
    }
    
}
