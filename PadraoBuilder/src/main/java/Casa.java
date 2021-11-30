public class Casa {

    private int janelas;
    private int portas;
    private int andares;
    private boolean piscina;
    private boolean garagem;
    private boolean teto;

    public Casa() {
        teto = false;
        portas = 0;

    }
    public boolean getTeto() {
        return teto;
    }

    public void setTeto(boolean teto) {
        this.teto = teto;
    }



    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean getGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }


}
