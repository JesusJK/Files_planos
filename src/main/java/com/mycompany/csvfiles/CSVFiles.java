package com.mycompany.csvfiles;
// Crear un archivo y exportarlo CSV y pasarlo a la Raiz
import com.mycompany.csvfiles.manageFiles.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class CSVFiles {
// Crear una clase que me permite leer el archivo
    public static void main(String[] args) throws FileNotFoundException {
        //  Crear una instancia para llamar al metodo que me lee el archivo
        File file = new File("./data.csv");
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        for(String line: data){
            String[] splited = new String[3];
            splited = line.split(";");
            System.out.println("Hola " + splited[1] + "tu codigo es:" + splited [0] + "y tu perseccion térmica es " + splited[2]);
        }
    }
}
