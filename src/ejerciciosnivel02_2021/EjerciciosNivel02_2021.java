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
        int contador1 = 0;
        
        for (int i=0; i < listaPalabras.length - 1; i++){ //el bucle que procesa todas las filas
            contador1 = 0; //inicializo el contador de diferencias antes de empezar el bucle interno
            for (int j=0; j < listaPalabras[0].length; j++){
                if (listaPalabras[i][j] == listaPalabras[i+1][j]){
                    System.out.println("SON IGUALES");
                }
                else{
                    System.out.println("SON DISTINTOS");
                    contador1++;  //las letras son diferentes
                }             
            }
            System.out.println("" +  contador1);
            if (contador1 != 1){  //si en algún momento las palabras se diferencian en más de un caracter devuelvo false
                return false;   
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
