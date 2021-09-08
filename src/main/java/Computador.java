public class Computador implements Cloneable {
    private String placaMae;
    private String memoria;
    private String fonte;
    private String processador;
    private String gabinete;

    public Computador(String placaMae, String memoria, String fonte, String processador, String gabinete){
        this.placaMae = placaMae;
        this.memoria = memoria;
        this.fonte = fonte;
        this.processador = processador;
        this.gabinete = gabinete;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public Computador clone() throws CloneNotSupportedException{
        Computador computadorClone = (Computador) super.clone();
        return computadorClone;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "placaMae='" + placaMae + '\'' +
                ", memoria='" + memoria + '\'' +
                ", fonte='" + fonte + '\'' +
                ", processador='" + processador + '\'' +
                ", gabinete='" + gabinete + '\'' +
                '}';
    }
}
