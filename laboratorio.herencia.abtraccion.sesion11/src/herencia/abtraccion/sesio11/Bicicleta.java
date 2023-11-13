package herencia.abtraccion.sesio11;

public  class Bicicleta extends vehiculo {

    String marco ;


    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
        this.marca = "gt";
        this.modelo = "1999";
        this.marco = "estandar";
    }

    @Override
    public int kilometrosrecorridos() {
        return (km());
    }


    public void andar() {
        System.out.println("1. andar en bicicleta");
    }

    public void picar() {
        System.out.println("2. picar bicicleta" );
    }

    public int km() {
        System.out.println("5. ver kilometraje bicicleta");
        return 50;
    }


    }

