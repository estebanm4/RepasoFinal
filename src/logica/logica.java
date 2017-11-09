package logica;

import datos.Schema;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class logica {

    private Schema esquema;

    public logica(Schema esquema) {
        this.esquema = esquema;
    }

    public void leerEsquema(String nomArch) throws FileNotFoundException {
        File archivo = new File(nomArch);
        Scanner lectura = new Scanner(archivo);
        lectura.useDelimiter(",");
        String cadena = "";

        while (lectura.hasNext()) {
            cadena = lectura.next().trim();
            System.out.println(cadena);
        }
    }

    public void leerKey(String nomArch) throws FileNotFoundException {
        File archivo = new File(nomArch);
        Scanner lectura = new Scanner(archivo);
        lectura.useDelimiter(",");
        String cadena = "";

        while (lectura.hasNext()) {
            cadena = lectura.next().trim();
            System.out.println(cadena);
        }
    }
    
    public void leerForeingKey (String nomArch) throws FileNotFoundException{
        File archivo = new File(nomArch);
        Scanner lectura = new Scanner(archivo);
        lectura.useDelimiter(",");
        String cadena = "";
        
        while (lectura.hasNext()){
            cadena = lectura.next().trim();
            System.out.println(cadena);
        }
    }
    
    public void leerColumna(String nomArch) throws FileNotFoundException{
        File archivo = new File(nomArch);
        Scanner lectura = new Scanner(archivo);
        lectura.useDelimiter(",");
        String cadena = "";
        
        while (lectura.hasNext()){
            cadena = lectura.next().trim();
            System.out.println(cadena);
        }
    }
}
