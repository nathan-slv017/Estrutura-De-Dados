public class NoBin<T> {

    private T conteudo;
    private NoBin<T> noBinEsq;
    private NoBin<T> noBinDir;

    NoBin(T conteudo){
        this.conteudo = conteudo;
        this.noBinEsq = this.noBinDir = null;
    }

    public NoBin<T> getNoBinEsq() {
        return noBinEsq;
    }

    public void setNoBinEsq(NoBin<T> noBinEsq) {
        this.noBinEsq = noBinEsq;
    }

    public NoBin<T> getNoBinDir() {
        return noBinDir;
    }

    public void setNoBinDir(NoBin<T> noBinDir) {
        this.noBinDir = noBinDir;
    }

    @Override
    public String toString() {
        return "NoBin{" +
                "conteudo=" + conteudo +
                '}';
    }
}
