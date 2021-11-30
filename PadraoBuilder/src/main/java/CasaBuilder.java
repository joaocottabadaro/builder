public class CasaBuilder {

    Casa minhaCasa;

    public CasaBuilder() {
        minhaCasa = new Casa();
    }

    public Casa build() {
        if(minhaCasa.getPortas() == 0) {
            throw new IllegalArgumentException("Casa não tem porta");
        }

        if(minhaCasa.getTeto() == false) {
            throw new IllegalArgumentException("Casa não tem teto");
        }

        return minhaCasa;
    }

    public CasaBuilder setJanelas(int janelas) {
        minhaCasa.setJanelas(janelas);
        return this;
    }

    public CasaBuilder setPortas(int portas) {
        minhaCasa.setPortas(portas);
        return this;
    }
    public CasaBuilder setTeto(boolean teto) {
        minhaCasa.setTeto(teto);
        return this;
    }
    public CasaBuilder setAndares(int andares) {
        minhaCasa.setAndares(andares);
        return this;
    }

    public CasaBuilder setPiscina(boolean piscina) {
        minhaCasa.setPiscina(piscina);
        return this;
    }

    public CasaBuilder setGaragem(boolean garagem) {
        minhaCasa.setGaragem(garagem);
        return this;
    }



}
