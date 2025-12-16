# 🖖 Pedra, Papel, Tesoura, Lagarto, Spock

## Descrição do Projeto

O **Pedra, Papel, Tesoura, Lagarto, Spock** (Rock, Paper, Scissors, Lizard, Spock) é uma expansão do clássico jogo "Pedra, Papel e Tesoura", popularizado pela série de televisão *The Big Bang Theory*.

Este projeto é uma implementação do jogo em **Java** com uma **Interface Gráfica de Usuário (GUI)**, utilizando a biblioteca Swing, onde o jogador compete contra o computador. O jogo adiciona duas novas opções, **Lagarto** e **Spock**, resultando em um total de 5 opções e 10 regras de vitória, tornando a jogabilidade mais complexa e divertida.

## 🛠 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias:

| Tecnologia | Versão | Propósito |
| :--- | :--- | :--- |
| **Java** | 17+ | Linguagem de programação principal. |
| **Swing/AWT** | Integrado ao JDK | Criação da Interface Gráfica de Usuário (GUI). |
| **Maven** | 3.x | Ferramenta de automação de construção e gerenciamento de dependências. |

## ✨ Regras do Jogo

O jogo segue as regras originais do "Pedra, Papel, Tesoura, Lagarto, Spock":

1.  **Tesoura** corta **Papel**
2.  **Papel** cobre **Pedra**
3.  **Pedra** esmaga **Lagarto**
4.  **Lagarto** envenena **Spock**
5.  **Spock** esmaga **Tesoura**
6.  **Tesoura** decapita **Lagarto**
7.  **Lagarto** come **Papel**
8.  **Papel** refuta **Spock**
9.  **Spock** vaporiza **Pedra**
10. **Pedra** quebra **Tesoura**

## ⚙ Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   **Java Development Kit (JDK)**: Versão 17 ou superior.
*   **Apache Maven**: Para construir e executar o projeto.

## 🚀 Instalação

Siga os passos abaixo para clonar o repositório e configurar o projeto:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/GilvanPedro/PedraPapelTesouraLagartoSpock.git
    cd PedraPapelTesouraLagartoSpock/PedraPapelTesouraLagartoSpock
    ```

2.  **Compile o projeto com Maven:**
    ```bash
    mvn clean install
    ```
    Este comando irá compilar o código e criar o arquivo JAR executável na pasta `target`.

## 🕹 Como Usar

Após a instalação, você pode executar o jogo diretamente a partir da linha de comando.

1.  **Execute o arquivo JAR:**
    ```bash
    java -jar target/PedraPapelTesouraLagartoSpock-1.0-SNAPSHOT.jar
    ```
    *Nota: O nome do arquivo JAR pode variar ligeiramente dependendo da versão do projeto.*

2.  **Interface Gráfica:**
    O jogo será iniciado em uma janela gráfica, onde você poderá interagir com os botões para fazer sua jogada e ver o resultado.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🧑‍💻 Autor

Este projeto foi desenvolvido por [Gilvan Pedro](https://github.com/GilvanPedro).
