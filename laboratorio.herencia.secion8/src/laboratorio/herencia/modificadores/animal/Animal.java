package laboratorio.herencia.modificadores.animal;

public class Animal {
    protected String nombre;

    public Animal(String name) {
        this.nombre = name;
    }
    public Animal() {

    }
    public void dormir() {
        System.out.println(nombre + " estoy durmiendo.");
    }
    public static void main(String[]args){
        Animal animal = new Animal();
        animal.nombre();

    }
}
