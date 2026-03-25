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
        if (topRubro + 1 == topNegro){
            grow();
        }

        Object pushR_acrescentado = arr[++topRubro] = o; //"o" é o valor, vai continuar crescendo

        if(size() < capacidade / 3){
            shrink();
        }

        return pushR_acrescentado;
    }

    public void pushN(Object o){ // Adiciona um elemento no final do array negro
        if (topNegro - 1 == topRubro){
            grow();
        } 

        Object pushN_acrescentado = arr[--topNegro] = o; //cresce de forma invertida, esse sinal primeiro faz que cresça e depois o indice do elemento colocado

        if (size() < capacidade / 3){
            shrink();
        }

        return pushN_acrescentado;
    }

    public Object popR() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array rubro
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha vermelha está vazia");
        }

        Object popR_retirado = arr[topRubro--]; //está crescente, para diminuir, terá que ir para esquerda/negativa
        
        if (size() < capacidade / 3){
            shrink();
        }

        return popR_retirado;
    }

    public Object popN() throws PilhaVaziaExcecao{ // Remove e retorna o ultimo elemento do array negro
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha preta está vazia");

        }

        Object popN_retirado = arr[topNegro++]; //já que está indo ao contrário, então para retirar precisa ir para direita/positivo, pega primeiro o elemento e depois tira naquela direção

        if (size() < capacidade / 3){ //pouca coisa no array sendo usada, então diminua
            shrink();
        }

        return popN_retirado;

    }

    public void grow() {
        int novo_capacidade = capacidade * 2;
        Object novo_arr[] = new Object[novo_capacidade];

        //com aumento da capacidade, irá funcionar agora o push, usando a nova lista
    
        for (int i = 0; i <= topRubro; i++){
            novo_arr[i] = arr[i];
        }

        int tamanho_arr_P = capacidade - topNegro; //para saber o tamanho exato da lista preta, usarei de forma temporária
        int novo_top_P = novo_capacidade - tamanho_arr_P; //para inverter de forma crescente! sendo um novo topNegro

        for (int i = 0; i < tamanho_arr_P; i++){
            novo_arr[novo_top_P + i] = arr[topNegro + i]; //na lista antiga tem que estar com top antigo, da mesma forma a lista nova tem que estar com top novo!
        }

        arr = novo_arr;
        capacidade = novo_capacidade;
        topNegro = novo_top_P;

    }

    public void shrink() { // Diminui o array geral pela metade, mantendo o array negro mais a direita
        int reducao = capacidade / 2; //metade da lista

        if (reducao < size()){ //se a lista reduzir mais do que a quantidade de elemento, pode gerar erro, a redução tem que ser menor do que os elementos usados na lista
            return;
        }

        Object novo_arr[] = new Object[reducao];

        for (int i = 0; i <= topRubro; i++){
            novo_arr[i] = arr[i];
        }

        int tamanho_arr_P = capacidade - topNegro;
        int novo_top_P = reducao - tamanho_arr_P;

        for (int i = 0; i < tamanho_arr_P; i++){
            novo_arr[novo_top_P + i] = arr[topNegro + i];
        }

        arr = novo_arr;
        capacidade = reducao;
        topNegro = novo_top_P;

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
