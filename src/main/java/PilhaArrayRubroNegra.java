public class PilhaArrayRubroNegra implements PilhaRubroNegra {
    // Atributos
    private int capacidade;
    private Object[] arr;
    private int topRubro;
    private int topNegro;

    // Construtor
    public PilhaArrayRubroNegra(int capacidade){
        this.capacidade = capacidade;
        topRubro = -1; //indice que está no começo, só que vazio
        topNegro = capacidade; //indice que está no final da lista
        arr = new Object[capacidade]; //lista
    }
    // Métodos

    public void pushR(Object o){ // Adiciona um elemento no final do array rubro
        if (topR()){
            grow();
        }
    }

    public void pushN(Object o){ // Adiciona um elemento no final do array negro
        if (topN()){
            grow();
        }
    }

    public Object popR() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array rubro
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha vermelha está vazia");
        }

        return arr[topRubro--]; //está crescente, para diminuir, terá que ir para esquerda/negativa
    }

    public Object popN() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array negro
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha preta está vazia");

        }
        return arr[topNegro++]; //já que está indo ao contrário, então para retirar precisa ir para direita/positivo
    }

    public void grow() {
        
    }

    public void shrink() { // Diminui o array geral pela metade, mantendo o array negro mais a direita

    }

    public Object topR() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array rubro
        if (isEmpty() == true){
            throw new PilhaVaziaExcecao("A pilha vermelha está vazia");
        }
       
        return arr[topRubro]; //indica o indice da lista

    }
    
    public Object topN() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array negro
        if (isEmpty() == true){
            throw new PilhaVaziaExcecao("A pilha preta está vazia");
        }
        
        return arr[topNegro]; //não importa se esteja invertido, só quero saber o indice da lista
    }

    public boolean isEmpty(){ // Retorna `true` se o array geral está vazio, caso contrário `false`
        if (topRubro == -1 && topNegro == capacidade){
            return true;
        } 

        return false;
    }

    public int size(){ // Retorna a quantidade de elementos do array geral
        return (topRubro + 1) + (capacidade - topNegro);
    }
}