package entenderObjeto;

public class Circulo {
    public double raio;
    public double Area (){
       return (Math.pow(raio, 2) * 3.14);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}

