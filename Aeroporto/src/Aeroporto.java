import java.util.ArrayList;

public class Aeroporto<X> implements Cloneable{
    private X dado;
    private ArrayList<Voos<X>> arestasEntrada;
    private ArrayList<Voos<X>> arestasSaida;

    public Aeroporto(X valor){
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Voos<X>>();
        this.arestasSaida   = new ArrayList<Voos<X>>();
    }

    public X getDado(){
        return dado;
    }

    public void setDado(X dado){
        this.dado = dado;
    }

    public  void adicionarArestaEntrada(Voos<X> voos){
        this.arestasEntrada.add(voos);
    }

    public void adicionarArestaSaida(Voos<X> voos){
        this.arestasSaida.add(voos);
    }

    public ArrayList<Voos<X>> listaVoos() {
        return arestasEntrada;
    }
}
