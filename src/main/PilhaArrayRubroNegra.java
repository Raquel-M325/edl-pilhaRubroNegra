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

    public void pushR(Object o){
        if (topRubro +1 == topNegro){
            grow();
        }
        arr[++topRubro] = o;
    }
    public void pushN(Object o){
        if (topRubro+1 == topNegro){
            grow();
        }
        arr[--topNegro] = o;
    }

    public Object popR() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array rubro

        return r;
    }

    public Object popN() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array negro

        return n;
    }

    public void grow() {
        int n_cap = capacidade*2;
        Object n_arr[] = new Object[n_cap];

        for(int i=0; i <= topRubro; i++)
            n_arr[i] = arr[i];
        
        int tamNegro = capacidade - topNegro;
        int n_topNegro = n_cap - tamNegro;

        for(int i=0; i < tamNegro; i++)
            n_arr[n_topNegro + i] = arr[topNegro + i];

        topNegro = n_topNegro;
        capacidade = n_cap;
        arr = n_arr;
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