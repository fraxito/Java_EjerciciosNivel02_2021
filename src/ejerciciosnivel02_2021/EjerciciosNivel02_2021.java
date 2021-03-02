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

    public String quitaAcentos(String cadena){
        // p�jaro
        // pajaro
        //cadena = cadena.toLowerCase();
        cadena = cadena.replace('�', 'a');
        cadena = cadena.replace('�', 'e');
        cadena = cadena.replace('�', 'i');
        cadena = cadena.replace('�', 'o');
        cadena = cadena.replace('�', 'u');
        cadena = cadena.replace('�', 'u');
        
        cadena = cadena.replace('�', 'A');
        cadena = cadena.replace('�', 'E');
        cadena = cadena.replace('�', 'I');
        cadena = cadena.replace('�', 'O');
        cadena = cadena.replace('�', 'U');
        cadena = cadena.replace('�', 'U');       
        
        
        return cadena;
    }
    
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
            if (contador1 != 1){  //si en alg�n momento las palabras se diferencian en m�s de un caracter devuelvo false
                return false;   
            }
        }
        
        return true;
    }
    
    public int costeErroresADN(String uno, String dos){
        //primera versi�n, usando los dos Strings que me pasan
        int coste = 0;  // coste de los errores
        
        for (int i = 0; i < uno.length(); i++) {
            if (uno.charAt(i) == '-' || dos.charAt(i) == '-') {
                coste = coste + 2; // coste += 2;
            } else{
                if (uno.charAt(i) == 'G' && dos.charAt(i) != 'C') {coste++;}
                if (uno.charAt(i) == 'C' && dos.charAt(i) != 'G') {coste++;}
                if (uno.charAt(i) == 'A' && dos.charAt(i) != 'T') {coste++;}
                if (uno.charAt(i) == 'T' && dos.charAt(i) != 'A') {coste++;}
            }
        }
        return coste;
    }
    
    /**
     * Encuentra el n�mero que est� duplicado en una lista de ints
     * usando el algoritmo de Floyd
     * @param listaNumeros
     * @return 
         0  1  2  3  4    */
    //  [1, 3, 2, 4, 3]
    public int findDuplicate(int [] listaNumeros){
        int tortuga = listaNumeros[0];
        int liebre = listaNumeros[0];
        boolean iguales = false;
        while (!iguales){
            tortuga = listaNumeros[tortuga];
            liebre = listaNumeros[listaNumeros[liebre]];
            if (tortuga == liebre){
                iguales = true;
            }
        }
        int aux1 = listaNumeros[0];
        int aux2 = tortuga;
        while (aux1 != aux2){
            aux1 = listaNumeros[aux1];
            aux2 = listaNumeros[aux2];
        }
        return aux1;
    }
    
    public int strStr(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = quitaAcentos(str1);
        str2 = quitaAcentos(str2);
        
        int posicion = -1;
        //suponemos que no hay acentos y que todo es min�sculas
        for (int i=0; i< str1.length(); i++){
            
            if (str1.charAt(i) == str2.charAt(0)){
                posicion = i;
                int j=0; //indice para buscar en el str2
                while ( (j < str2.length() && i<str1.length()) && str1.charAt(i) == str2.charAt(j)){
                    j++;
                    i++;
                }
                //el while ha terminado y puede haber salido por varias razones
                //la primera, que alguno de los dos lenght se haya terminado
                //la segunda, que alguna letra sea distinta
                
                if (j >= str2.length()){
                    //si ha salido porque ya no ten�a m�s letras en el str2, significa
                    //que el str2 est� dentro del str1, y adem�s su posici�n est� guardada
                    //en posicion
                    return posicion;
                }
                if (i >= str1.length()){
                    //si ha salido porque ya no ten�a m�s letras en el str1, significa
                    //que el str2  NO est� dentro del str1
                    return -1; 
                }                
                if (str1.charAt(i) != str2.charAt(j)){
                    i = posicion; //optimizaci�n Claudia
                    posicion = -1; 
                }
            }
        }
        
        return posicion;
    }
    
    
    public String calculadoraRPN( String [] entrada){
    
        String [] pila  = new String [100];
        int posicionPila = 0; //indica el sitio de la pila en el que toca insertar o leer
        
        for (int i=0; i< entrada.length; i++){
            
            if (entrada[i] != "+" && entrada[i] != "-" &&entrada[i] != "*" &&entrada[i] != "/" ){
                //System.out.print(entrada[i] + " ");
                //es un operando, tengo que meterlo en la pila
                pila[posicionPila] = entrada[i];
                posicionPila++;
            }
            else{ //es una operaci�n
                if (posicionPila - 2 >= 0){
                    Double operando1 = Double.valueOf(pila[posicionPila - 1]);
                    Double operando2 = Double.valueOf(pila[posicionPila - 2]);
                    if (entrada[i] == "+"){
                        operando1 = operando1 + operando2;
                    }
                    if (entrada[i] == "*"){
                        operando1 = operando1 * operando2;
                    }
                    if (entrada[i] == "-"){
                        operando1 = operando1 - operando2;
                    }
                    if (entrada[i] == "/"){
                        if (operando2 == 0){
                            return "No se puede dividir entre cero, imb�cil";
                        }
                        else{
                            operando1 = operando1 / operando2;
                        }
                    }
                    posicionPila = posicionPila - 2;
                    pila[posicionPila] = operando1+"";  //guardo el resultado en la casilla correspondiente
                    posicionPila++;
                } 
                else{
                    return "ERROR";
                }
            }
            
        }
        
        
        
        
        return pila[0];
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
//        System.out.println(ejercicio.esEscaleraDePalabras(listaPalabras));
//        
//        System.out.println(ejercicio.findDuplicate(new int[]{3,2,3,4,1}));
//        System.out.println(ejercicio.findDuplicate(new int[]{4,2,3,4,1}));
//        System.out.println(ejercicio.findDuplicate(new int[]{1,1,3,4,1}));
//        
        System.out.println(ejercicio.strStr("hola Helios!", "el"));
        System.out.println(ejercicio.strStr("hola Mundo", "Mun"));
        System.out.println(ejercicio.strStr("hola MynMu", "Mun"));
        System.out.println(ejercicio.strStr("hola MMunn", "Mun"));
        System.out.println(ejercicio.strStr("Mumn", "mun"));
        
        System.out.println(ejercicio.calculadoraRPN( new String[]{"4", "2","/", "5", "*"} ) );
     }
    
}
