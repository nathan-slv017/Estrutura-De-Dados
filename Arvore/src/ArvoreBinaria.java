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

    public void remover(T conteudo){
        try{
            NoBin<T> atual = this.raiz;
            NoBin<T> pai = null;
            NoBin<T> filho = null;
            NoBin<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoBinEsq();
                }else {
                    atual = atual.getNoBinDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado, bloco Try");
            }

            if(pai == null){

                if(atual.getNoBinDir() == null){
                    this.raiz = atual.getNoBinEsq();
                } else if(atual.getNoBinEsq() == null){
                    this.raiz = atual.getNoBinDir();
                } else{
                    for(temp = atual, filho = atual.getNoBinEsq();
                        filho.getNoBinDir() != null;
                        temp = filho, filho = filho.getNoBinEsq()
                    ){
                        if(filho != atual.getNoBinEsq()) {
                            temp.setNoBinDir(filho.getNoBinEsq());
                            filho.setNoBinEsq(raiz.getNoBinEsq());
                        }
                    }
                    filho.setNoBinDir(raiz.getNoBinDir());
                    raiz = filho;
                }

            } else if(atual.getNoBinDir() == null){
                if(pai.getNoBinEsq() == atual){
                    pai.setNoBinEsq(atual.getNoBinEsq());
                }else {
                    pai.setNoBinDir(atual.getNoBinEsq());
                }
            } else if(atual.getNoBinEsq() == null){
                if(pai.getNoBinEsq() == null){
                    pai.setNoBinEsq(atual.getNoBinDir());
                } else {
                    pai.setNoBinDir(atual.getNoBinDir());
                }
            }else  {
               for(
                       temp = atual, filho = atual.getNoBinEsq();
                       filho.getNoBinDir() != null;
                       temp = filho, filho = filho.getNoBinDir()
               ){
                   if(filho!= atual.getNoBinEsq()){
                       temp.setNoBinDir(filho.getNoBinEsq());
                       filho.setNoBinEsq(atual.getNoBinEsq());
                   }
                   filho.setNoBinDir(atual.getNoBinDir());
                   if(pai.getNoBinEsq() == atual){
                       pai.setNoBinEsq(filho);
                   }else {
                       pai.setNoBinDir(filho);
                   }
               }

            }

        } catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado, bloco Catch");
        }
    }

}
