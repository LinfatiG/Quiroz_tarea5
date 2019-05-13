package model.dominioProblema;
import java.util.*;

public class InteraccionUsuario
{	
    Repertorio rp = new Repertorio();
	public void menu() {
            int op = 0;
            do{
		System.out.println("ingrese opcion");
                System.out.println("1- ver cancion");
                System.out.println("2- eliminar cancion");
                System.out.println("3- agregar cancion");
                System.out.println("4- salir");
                Scanner sc = new Scanner(System.in);
                try{
                op = sc.nextInt();
                llamadaMetodos(op);
                }catch(Exception e){
                System.out.println("opcion mal ingresada");
                }
            } while(op != 4);
	}
	
	public void llamadaMetodos( int op) {
		
            switch(op){
                case 1:
                    rp.mostrarCancion();
                    break;
                case 2:
                    rp.quitarCancion();
                    break;
                case 3:
                    rp.anadirCancion();
                    break;
                case 4:
                    salir();
                default:
                    System.out.println("opcion mal ingresada");
                    break;
            }
            
	}
	
	public void salir() {
		System.exit(0);
	}

}
