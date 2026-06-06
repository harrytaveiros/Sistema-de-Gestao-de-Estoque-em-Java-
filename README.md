# Sistema de Gestão de Estoque em Java 📦

Uma aplicação interativa de terminal desenvolvida em Java que simula um sistema de gerenciamento de estoque de produtos, operando através de um menu de opções contínuo.

## 🚀 Tecnologias e Conceitos Utilizados
* **Java**
* **Programação Orientada a Objetos (POO):** Classes, objetos e encapsulamento.
* **Estruturas de Repetição e Decisão:** Uso de `do-while` e `switch-case` para criar um menu interativo.
* **Tratamento de Buffer:** Limpeza de buffer do `Scanner` durante entradas consecutivas de strings e números.

## ⚙️ Funcionalidades do Sistema
O programa inicia solicitando os dados do primeiro produto. Em seguida, exibe um menu iterativo com as seguintes opções:
1. **Adicionar estoque:** Soma uma quantidade válida ao estoque atual.
2. **Remover estoque:** Subtrai uma quantidade do estoque, possuindo validação de segurança para impedir estoque negativo.
3. **Exibir informações:** Mostra o status atualizado do produto.
4. **Criar novo produto:** Sobrescreve o objeto atual com um novo produto em memória.
0. **Sair:** Encerra o loop e finaliza a aplicação.

## 🛠️ Como Executar
1. Clone este repositório.
2. Compile os arquivos Java simultaneamente:
   ```bash
   javac Produto.java Main.java
   ```
3. Execute a aplicação:
   ```bash
   java Main
   
