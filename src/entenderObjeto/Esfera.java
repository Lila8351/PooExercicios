package entenderObjeto;

public class Esfera extends Circulo {
    //herdando parametro da classe circulo

    @Override
    public double Area() {
        return super.Area()*4;
        //referencia a area da classe superior, Circulo
        //Alem disso, o metodo foi alterado (*4) portant é polimorfismo.
        //Porque além de herdar os atributos da classe Circulo (heranca)
        //o metodo empregado (calculo da area) é subscrito, implementado
        //de um jeito diferente.
    }

    public Esfera(double raio) {
        super(raio);
        //o construtor cria o objeto
        //nao e necessario, e nem vai dar certo, "replicar" a funcao.

    }
}
