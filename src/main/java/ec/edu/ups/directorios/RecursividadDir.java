/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.directorios;

import java.io.File;

/**
 *
 * @author alexr
 */
public class RecursividadDir {

    public static void main(String[] args) {
        String path = "C:\\Users\\alexr\\OneDrive\\Escritorio\\RD";
        File mainPath = new File(path);
        
        Directorios.renombrarCarpetas(mainPath);
        
    }
}
