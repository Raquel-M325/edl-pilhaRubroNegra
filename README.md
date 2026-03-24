# Pilha Rubro-Negra com Array

## Descrição

Este projeto consiste na implementação de uma estrutura de dados que simula duas pilhas dentro de um único array:

* **Pilha Rubro (R)**: cresce da esquerda para a direita
* **Pilha Negro (N)**: cresce da direita para a esquerda

O objetivo é otimizar o uso de memória utilizando um único array compartilhado entre as duas pilhas.

---

## Como começar (fork do repositório)

1. Faça um fork deste repositório para sua conta
2. Clone o fork para sua máquina (ou abra um Codespaces):

   ```bash
   git clone <url-do-seu-fork>
   ```
3. Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, VS Code)
4. Localize a classe `PilhaArrayRubroNegra`, na pasta `src/main/java/`
5. Implemente :D

---

## Estrutura da classe

A classe já possui os seguintes atributos:

* `capacidade`: tamanho do array
* `arr`: array que armazena os elementos
* `topRubro`: topo da pilha rubro (inicia em -1)
* `topNegro`: topo da pilha negro (inicia em `capacidade`)

---

## Estratégia de implementação (ordem recomendada)

Implente as funções mais simples primeiro.

* `topN()`
* `topR()`
* `size()`
* `isEmpty()`

Eles são essenciais para os testes. Depois implemente as funções `push`,`pop`, `grow` e `shrink`.

Quando tiver algo para enviar para o repositório principal, faça um __Pull Request__ em [edl-pilhaRubroNegra](https://github.com/anabs-escolar/edl-pilhaRubroNegra)

---

## Dicas importantes

* Nunca permita que `topRubro` ultrapasse `topNegro`
* Sempre atualize os índices corretamente após inserção/remoção
* Teste cada método isoladamente antes de avançar
* Use prints ou debug para acompanhar o comportamento

---

## Executando Testes

| Comando             | Uso              |
| ------------------- | ---------------- |
| `mvn test`          | roda todos testes      |
| `mvn clean test`    | limpa compilação antiga e compila novamente    |
| `mvn install`       | build completo   |
| `mvn -Dtest=Classe`  | teste específico |
| `-X` / `-e`         | debug            |

Exemplo de uso:

- Todos os testes
```bash
mvn test
```

- Rodar teste específico
```bash
mvn test -Dtest=PushNTest
```

---

## Conclusão

A implementação exige atenção ao controle de índices e ao redimensionamento do array. Seguir a ordem sugerida ajuda a evitar erros e facilita a validação da estrutura.

---
