package model.dominioProblema;


public class Cancion
{
	
	
	public String nombre;
	public String albun;
	public int anoLanzamiento;
	public int codigo;
        public String interPrincipal;
	public String letra;

	public Cancion(String nombre, String albun, int anoLanzamiento, String letra, String interPrincipal,  int codigo ){
		this.albun = albun;
                this.anoLanzamiento = anoLanzamiento;
                this.codigo = codigo;
                this.interPrincipal = interPrincipal;
                this.letra = letra;
                this.nombre = nombre;
	}

}

