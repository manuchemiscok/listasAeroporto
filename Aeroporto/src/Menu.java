import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    Aeroportos<String> lista = new Aeroportos<String>();

    public void exibeMenu(){
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastro de aeroporto: ");
        System.out.println("2 - Cadastro de voo: ");
        System.out.println("3 - Remover voo: ");
        System.out.println("4 - Listar voos do aeroporto: ");
        System.out.println("5 - Inserir lista de voos pré-programada: ");
    }

    public void escolherMenu(){
        Scanner teclado = new Scanner(System.in);

        int opcao = teclado.nextInt();
        switch (opcao){
            case 0: return;

            case 1: System.out.println("Digite o nome do aroporto que deseja cadastrar: ");
                    String novoAeroporto = teclado.next();
                    lista.adicionarVertice(novoAeroporto);
                    break;

            case 2: System.out.println("Digite o nome do aeroporto de onde o voo irá sair: ");
                    String atual = teclado.next();
                    Aeroporto<String> aeroOrigem = lista.getVertice(atual);
                    System.out.println("Agora digite o aeroporto de destino: ");
                    String destino = teclado.next();
                    Aeroporto<String> aeroDestino = lista.getVertice(destino);
                    System.out.println("Digite quantos KM o avião irá percorrer: ");
                    Double km = teclado.nextDouble();
                    Voos<String> caminho = new Voos<String>(km, aeroOrigem, aeroDestino);
                    aeroOrigem.adicionarArestaEntrada(caminho);
                    aeroDestino.adicionarArestaSaida(caminho);
                    break;

            case 3: System.out.println();
                    break;

            case 4: System.out.println("Digite o nome do aeroporto que você deseja consultar: ");
                    String nome = teclado.next();
                    Aeroporto<String> objetivo = lista.getVertice(nome);
                    ArrayList<Voos<String>> voosProgramados = objetivo.listaVoos();
                    for (int i = 0; i < voosProgramados.size(); i++){
                        Voos<String> vooAtual = voosProgramados.get(i);
                        System.out.println("Destino: " + vooAtual.getFim().getDado() + " Numero: " + vooAtual.getPeso());
                    }
                    break;

            case 5: lista.adicionarVertice("BSB");
                    lista.adicionarVertice("CNF");
                    lista.adicionarVertice("GIG");
                    lista.adicionarVertice("GRU");
                    lista.adicionarVertice("SSA");

                    Voos<String> voo1 = new Voos<String>(4.0, lista.getVertice("GRU"), lista.getVertice("SSA"));
                    lista.getVertice("GRU").adicionarArestaEntrada(voo1);
                    lista.getVertice("SSA").adicionarArestaSaida(voo1);
                    Voos<String> voo2 = new Voos<String>(4.0, lista.getVertice("GIG"), lista.getVertice("BSB"));
                    lista.getVertice("GIG").adicionarArestaEntrada(voo2);
                    lista.getVertice("BSB").adicionarArestaSaida(voo2);
                    break;

            default:
                System.out.println("Valor inválido!");
        }
        exibeMenu();
        escolherMenu();
    }
}
