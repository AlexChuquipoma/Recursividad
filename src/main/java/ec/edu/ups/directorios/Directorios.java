/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.directorios;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;

/**
 *
 * @author alexr
 */
public class Directorios {
    
    
    public static void renombrarCarpetas(File path){
        if(path.isDirectory()){
        String namePath = path.getName() + "_nuevo";
        File newPath = new File(path.getParentFile(), namePath);
        System.out.println(newPath);
        path.renameTo(newPath);
        
        System.out.println(path.getName()+"----"+namePath);
            
        File[] subDirectorios = newPath.listFiles();
        System.out.println(subDirectorios);
        if(subDirectorios !=null){
            renombrarSubCarpetas(subDirectorios, 0);
            
            }
        }

    }
    
    public static void renombrarSubCarpetas(File[] subdirectorios, int index){
        if(index < subdirectorios.length){
            File subdirectorio = subdirectorios[index];
            renombrarCarpetas(subdirectorio);
            renombrarSubCarpetas(subdirectorios, index +1);
            
        }
    }
}
