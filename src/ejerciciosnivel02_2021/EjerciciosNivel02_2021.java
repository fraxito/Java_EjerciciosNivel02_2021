/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel02_2021;

/**
 *
 * @author xp
 */
public class EjerciciosNivel02_2021 {


    
    public boolean esEscaleraDePalabras( char [][] listaPalabras){
        
        for (int i=0; i < listaPalabras[0].length  ; i++){
            if (listaPalabras[i][0] == listaPalabras[i+1][0]){
                System.out.println("SON IGUALES");
            }
            else{
                System.out.println("SON DISTINTOS");
            }
        }
        
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel02_2021 ejercicio = new EjerciciosNivel02_2021();
        char [][] listaPalabras = {
           {'P', 'A', 'T', 'A'},
           {'P', 'A', 'T', 'O'},
           {'R', 'A', 'T', 'O'},
           {'R', 'A', 'M', 'O'},
           {'G', 'A', 'M', 'O'},
           {'G', 'A', 'T', 'O'},
           {'M', 'A', 'T', 'O'}
        };
        System.out.println(ejercicio.esEscaleraDePalabras(listaPalabras));
    }
    
}
