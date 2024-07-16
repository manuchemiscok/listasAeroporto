# Projeto Aeroportos e Voos

Este projeto é uma simulação de um sistema de gestão de aeroportos e voos. Ele utiliza Java para representar a estrutura de aeroportos e os voos entre eles. O projeto inclui classes para aeroportos, voos e uma interface de menu para interagir com o sistema.

## Estrutura do Projeto

- **Aeroporto**: Representa um aeroporto com uma lista de voos de entrada e saída.
- **Voos**: Representa um voo entre dois aeroportos com um peso (distância).
- **Aeroportos**: Gerencia um conjunto de aeroportos e voos.
- **Menu**: Fornece uma interface de usuário para interagir com o sistema.

## Classes

- **Aeroporto**
  - `X dado`: O nome ou identificador do aeroporto.
  - `ArrayList<Voos<X>> arestasEntrada`: Lista de voos que chegam ao aeroporto.
  - `ArrayList<Voos<X>> arestasSaida`: Lista de voos que saem do aeroporto.

- **Voos**
  - `Double peso`: A distância ou peso do voo.
  - `Aeroporto<X> inicio`: O aeroporto de origem do voo.
  - `Aeroporto<X> fim`: O aeroporto de destino do voo.

- **Aeroportos**
  - `ArrayList<Aeroporto<X>> vertices`: Lista de aeroportos.
  - `ArrayList<Voos<X>> voos`: Lista de voos.

- **Menu**
  - Interface de usuário para adicionar aeroportos, cadastrar voos, remover voos e listar voos.

## Como Usar

1. **Compile o Projeto**: Certifique-se de que você tem o JDK instalado e compile o projeto com `javac`.

   ```sh
   javac *.java

2. **Execute o Programa**: Execute a classe principal Main para iniciar o menu.

   ```sh
   java Main

3. **Interaja com o Menu:**:
   - 0: Sair do programa.
   - 1: Cadastro de aeroporto.
   - 2: Cadastro de voo.
   - 3: Remover voo (não implementado).
   - 4: Listar voos de um aeroporto.
   - 5: Inserir lista de voos pré-programada.
  
## Exemplos:
**Adicionar Aeroporto:**
- Opção: '1'
- Entrada: 'CNF'
- Adiciona o aeroporto de nome "CNF".
  
**Adicionar Voo:**
- Opção: '2'
- Aeroporto de destino: 'GRU'
- Distância:'500.0'.
- Adiciona um voo de CNF para GRU com distância de 500 km.
  
**Listar Voos:**
- Opção: '4'
- Entrada: 'CNF'
- Lista todos os voos que saem de CNF.

  
