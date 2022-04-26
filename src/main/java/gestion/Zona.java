package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
public class Zona {
	
	private String nombre;
	private Zoologico zoo ;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	public static int i = 0;
    
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public  String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Zona (String nombre) {
		this.nombre = nombre;
	}
	public Zona() {}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	int total = 0;
	public int cantidadAnimales() {
		return animales.size();
	}
}