package herencia.abtraccion.sesio11;

public  abstract class vehiculo {

    String marca;
    String modelo;

    public vehiculo(String marca, String modelo) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void vehiculoscredos() {
        System.out.println("bicileta gt model 1999 y carro bmw model 2030"  );
    }

    public void kilometrostotales() {
        System.out.println(" para ver los kilometrostales de cada vehiculo escoja la opcion 5 o 6");
    }
    public abstract int kilometrosrecorridos();
}



