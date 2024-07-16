import java.util.ArrayList;

public class Aeroportos<X> implements Cloneable{
    private ArrayList<Aeroporto<X>> vertices;
    private ArrayList<Voos<X>> voos;

    public Aeroportos() {
    this.vertices = new ArrayList<Aeroporto<X>>();
    this.voos = new ArrayList<Voos<X>>();
    }

    public void adicionarVertice(X dado){
        Aeroporto<X> novoAeroporto = new Aeroporto<X>(dado);
        this.vertices.add(novoAeroporto);
    }

    public  void adicionarAresta(Double peso, X dadoInicio, X dadoFim){
        Aeroporto<X> inicio = this.getVertice(dadoInicio);
        Aeroporto<X> fim    = this.getVertice(dadoFim);

        Voos<X> voos = new Voos<X>(peso, inicio, fim);
        inicio.adicionarArestaSaida(voos);
        fim.adicionarArestaEntrada(voos);
        this.voos.add(voos);
    }

    public Aeroporto<X> getVertice(X dado){
        Aeroporto<X> aeroporto = null;

        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                aeroporto = this.vertices.get(i);
                break;
            }
        }
        return aeroporto;
    }

    public ArrayList<Aeroporto<X>> listaVertices(){
        return vertices;
    }
}
