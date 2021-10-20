//Crie uma classe Dados com um atributo privado do tipo array de Object.

package Java2_poo_atp26;

//Crie uma classe Dados com um atributo privado do tipo array de Object.
public class Dados {
    private Object[] dados;
    private int posicao = 0;
    private int tamanho = 5;

    //Crie uma inicialização do array para 5 posições dentro do do método construtor da classe
    public Dados() {
       this.dados = new Object[tamanho];
    }

    //Crie um método para mostrar quantos elementos já foram adicionados ao array.
    public int size(){
        return posicao;
    }

    //Crie um método para adicionar elementos ao array e que permita receber tanto objetos da classe pessoa quanto objetos da classe Aluno. Caso o array já tenha todas as posições ocupadas, deve ser adicionado mais 5 posições ao array.
    public String add(Object obj) {
        String mensagem;

        if (posicao < this.dados.length) {
            this.dados[posicao] = obj;
            posicao ++;
        } else {
            tamanho = tamanho * 2;
            Object[] dados2 = new Object[tamanho];
            
            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
    mensagem = "Aluno adicionado!";
    return mensagem;
    }

    //Crie um método para remover um elemento do array.
    public String remove(Object obj){
        for (int i = 0; i < posicao; i++) {
            if(dados[i].equals(obj)){
                organiza(i);
                return "Aluno removido!";
            }
        }
        return "Aluno não encontrado!";
    }
    
    public void organiza(int pos){
        for (int i = pos; i < posicao; i++) {
            this.dados[i] = this.dados[i+1];
        }
        posicao --;
    }

    //Crie um método para verificar se um determinado objeto já foi salvo no array.
    public boolean verifica(Object obj){
        for (int i = 0; i < posicao; i++) {
            if(dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }
}
