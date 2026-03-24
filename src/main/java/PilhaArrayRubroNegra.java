public class PilhaArrayRubroNegra implements PilhaRubroNegra {
    // Atributos
    private int capacidade;
    private Object[] arr;
    private int topRubro;
    private int topNegro;

    // Construtor
    public PilhaArrayRubroNegra(int capacidade){
        this.capacidade = capacidade;
        topRubro = -1;
        topNegro = capacidade;
        arr = new Object[capacidade];
    }
    // Métodos

    public void pushR(Object o){ // Adiciona um elemento no final do array rubro
        
    }

    public void pushN(Object o){ // Adiciona um elemento no final do array negro
        
    }

    public Object popR() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array rubro

        return null;
    }

    public Object popN() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array negro

        return null;
    }

    public void grow() {
        
    }

    public void shrink() { // Diminui o array geral pela metade, mantendo o array negro mais a direita

    }

    public Object topR() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array rubro
    
        return null;
    }
    
    public Object topN() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array negro

        return null;
    }

    public boolean isEmpty(){ // Retorna `true` se o array geral está vazio, caso contrário `false`

        return true;
    }

    public int size(){ // Retorna a quantidade de elementos do array geral

        return 0;
    }
}