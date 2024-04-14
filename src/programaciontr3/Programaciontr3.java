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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
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
            archivo = new File("F:\\MisTareas\\Archivo de texto Etica en el ID Digital.txt");
            
            // Creo los flujos
            if (archivo.exists()) {
                flujo1 = new FileInputStream(archivo);
                disflujo1 = new DataInputStream(flujo1);
                System.out.println("El archivo existe ");
                
                System.out.println("Ejercicio B: Salto 50 bytes hacia delante y lee los 50 siguientes");
                disflujo1.skipBytes(50);
                byte[] arrayBytes = new byte[50];
                disflujo1.read(arrayBytes);
                for(byte b : arrayBytes){
                    System.out.println(b+"");
                }
                System.out.println("Ejercicio C: Lee 15 cadenas de caracteres");
                System.out.println("Leo 15 cadenas de caracteres siguientes:");
                for(int i=0; i < 15; i++){
                    String cadena = disflujo1.readUTF();
                    System.out.println(cadena);
                }
                
                
             
                
                
            } else {
                throw new FileNotFoundException("No existe el archivo " + archivo.getName());
            }
            }catch(FileNotFoundException e){
                System.out.println("No se pudo encontrar el archivo"+e.getMessage());
            }
        
    
    }}
