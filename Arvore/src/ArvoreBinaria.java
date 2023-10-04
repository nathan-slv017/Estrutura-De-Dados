public class ArvoreBinaria<T extends Comparable<T>> {

    private NoBin<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoBin<T> novoNo = new NoBin<>(conteudo);

        this.raiz = inserir(this.raiz, novoNo);

    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoBinEsq(inserir(atual.getNoBinEsq(), novoNo));
        } else {
            atual.setNoBinDir(inserir(atual.getNoBinDir(), novoNo));
        }
        return atual;
    }

    public void exibirOrdem(){
        System.out.println("\n Exibindo em ordem");
        exibirOrdem(this.raiz);
    }

    private void exibirOrdem(NoBin<T> atual){
        if(atual != null){
            exibirOrdem(atual.getNoBinEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirOrdem(atual.getNoBinDir());
        }
    }
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo em ordem");
        exibirPosOrdem(this.raiz);
    }
    private void exibirPosOrdem(NoBin<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoBinEsq());
            exibirPosOrdem(atual.getNoBinDir());
            System.out.println(atual.getConteudo() + ",");
        }
    }
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo em ordem");
        exibirPreOrdem(this.raiz);
    }
    private void exibirPreOrdem(NoBin<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoBinEsq());
            exibirPreOrdem(atual.getNoBinDir());
        }
    }
}
