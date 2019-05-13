package model.dominioProblema;
import java.util.*;
import java.io.*;
import java.nio.*;
import model.datos.Archivo;

public class Repertorio
{
	
	
	public ArrayList<Cancion> canciones;
	
	public void anadirCancion() {
		try{
                System.out.println("ingrese nombre de cancion");
                Scanner sc = new Scanner(System.in);
                String nombre = sc.nextLine();
                System.out.println("ingrese albun");
                String albun = sc.nextLine();
                System.out.println("ano lanzamiento");
                int anoLanzamiento = sc.nextInt();
                System.out.println("interprete principal");
                String interPrincipal = sc.nextLine();
                String letra = ingresarLetra();
                int codigo = generarCodigo();
                Cancion cancion = new Cancion(nombre,albun,anoLanzamiento,letra, interPrincipal, codigo);
                canciones.add(cancion);
                } catch(Exception e){
                System.out.println("no se ha podido agregar la cancion");
                }
	}

	public void quitarCancion() {
            try{
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el numero de la cancion que desea eliminar");
            int eliminar = sc.nextInt();
            canciones.remove(eliminar);
            }catch(Exception e){
            System.out.println("no se ha podido eliminar la cancion");
            }
        }
	
	public void mostrarCancion() {
            try{
            Archivo ar = new Archivo();
            ar.leerArchivo();
            }catch(Exception e){
            System.out.println("no se ha podido mostrar la cancion");
            }
	}
	
	public int generarCodigo() {
		int codigo = canciones.size()+1;
		return codigo;
	}

        public String ingresarLetra(){
            Archivo ar = new Archivo();
            return ar.agregarTexto();
        }
}
