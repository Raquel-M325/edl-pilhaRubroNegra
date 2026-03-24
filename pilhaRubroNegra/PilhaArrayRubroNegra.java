public class PilhaArrayRubroNegra implements PilhaRubroNegra {
    // Atributos
    private int capacidade;
    private Object[] arr;
    private int topRubro;
    private int topNegro;

    // Construtor
    public PilhaArrayRN(int capacidade){
        this.capacidade = capacidade;
        topRubro = -1;
        topNegro = capacidade;
        arr = new Object[capacidade];
    }

    public void pushR(Object o){ // Adiciona um elemento no final do array rubro (esq. para dir)
        // Implemente aqui
    }

    public void pushN(Object o){ // Adiciona um elemento no final da array negro (dir. para esq)
        // Implemente aqui
    }

    public Object popR() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array rubro

        return r;
    }

    public Object popN() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array negro

        return n;
    }

    public void grow() { // Aumenta a capacidade (duplicidade) do array geral, mantendo o array negro mais a direita
        
    }

    public void shirink() { // Diminui o array geral pela metade, mantendo o array negro mais a direita

    }

    public Object topR() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array rubro

        return r;
    }
    
    public Object topN() throws PilhaVaziaExcecao{ // Retorna o ultimo elemento do array negro

        return n;
    }
    public boolean isEmpty(){ // Retorna `true` se o array geral está vazio, caso contrário `false`

        return true;
    }

    public int size(){ // Retorna a quantidade de elementos do array geral

        return size;
    }
}