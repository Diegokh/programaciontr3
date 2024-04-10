/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaciontr3;

/**
 *
 * @author alumnado
 */

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Programaciontr3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
      /* //Ruta del archivo
        String rutaArchivo = "E:\\MisTareas\\Archivo_de_texto_Etica_en_el_ID_Digital.txt";
        //Objeto File
        File archivo= new File(rutaArchivo);
        
        System.out.println("Ejercicio 1");*/
        
         FileInputStream flujo1 = null;
        DataInputStream disflujo1 = null;
        File archivo = null;
        
        try {
            // Ruta del archivo
            archivo = new File("E:\\MisTareas\\Archivo de texto Etica en el ID Digital.txt");
            
            // Creo los flujos
            if (archivo.exists()) {
                flujo1 = new FileInputStream(archivo);
                disflujo1 = new DataInputStream(flujo1);
                
             
                
                System.out.println("El archivo existe ");
            } else {
                throw new FileNotFoundException("No existe el archivo " + archivo.getName());
            }
            }catch(FileNotFoundException e){
                System.out.println("No se pudo encontrar el archivo"+e.getMessage());
            }
    
    }}
