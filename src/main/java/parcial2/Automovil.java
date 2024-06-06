package parcial2;

public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int ano, int numeroPuertas, TipoCombustible tipoCombustible) {
    //public Automovil(int numeroPuertas, TipoCombustible tipoCombustible, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String imprimirInformacion(){
        return numeroPuertas + tipoCombustible;
    }
}