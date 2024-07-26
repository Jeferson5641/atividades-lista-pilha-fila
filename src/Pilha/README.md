<h1>Pilha Ligada Simples em Java</h1>
Este repositório contém uma implementação de uma pilha ligada simples em Java, seguindo os princípios da orientação a objetos. A pilha é implementada como uma classe separada, com métodos para inserir, remover, imprimir, copiar e inverter a pilha.

<h3>Estrutura do Projeto</h3>
O projeto é composto por quatro classes:

<strong>Pilha.java:</strong> Interface que define os métodos que uma pilha deve implementar.<br/>
<strong>Node.java:</strong> Classe que representa um nó da pilha.<br/>
<strong>PilhaLigada.java:</strong> Classe que implementa a pilha ligada.<br/>
<strong>Main.java:</strong> Classe que demonstra o uso da pilha ligada.<br/>

<h3>Métodos da Pilha</h3>
A pilha ligada implementa os seguintes métodos:

<strong>push(int elemento):</strong> Insere um elemento no topo da pilha.<br/>
<strong>pop():</strong> Remove o elemento do topo da pilha e retorna seu valor.<br/>
<strong>imprimir():</strong> Imprime todos os elementos da pilha.<br/>
<strong>copiar():</strong> Cria uma cópia da pilha.<br/>
<strong>inverter():</strong> Inverte a ordem dos elementos da pilha.<br/>

<h3>Uso da Pilha</h3><br/>
Para usar a pilha ligada, basta criar uma instância da classe PilhaLigada e chamar os métodos desejados. Por exemplo:

java

PilhaLigada pilha = new PilhaLigada();<br/>
pilha.push(1);<br/>
pilha.push(2);<br/>
pilha.push(3);<br/>
pilha.imprimir(); // imprime "3 2 1"<br/>
pilha.inverter();<br/>
pilha.imprimir(); // imprime "1 2 3"<br/>

<h3>Compilação e Execução</h3>
Para compilar e executar o projeto, basta usar o comando javac para compilar as classes e java para executar a classe Main.<br/>
Foi usado a <strong>IDE Intelij</strong> para codificar e compilar.<br/>
Está sendo executado em <strong>Java JDK 17.0.9</strong>, para evitar problemas recomenda-se o uso da mesma versão.
