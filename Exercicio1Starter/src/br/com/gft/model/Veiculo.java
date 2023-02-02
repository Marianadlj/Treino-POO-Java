package br.com.gft.model;

public class Veiculo {
    String Marca;
    String Modelo;
    String Placa;
    String Cor;
    float Km;
    boolean isLigado;
    int litrosCombustivel;
    int Velocidade;
    double Preco;

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, double preco) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Placa = placa;
        this.Cor = cor;
        this.Km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.Velocidade = velocidade;
        this.Preco = preco;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public float getKm() {
        return Km;
    }

    public void setKm(float km) {
        this.Km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.Velocidade = velocidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public int acelerar(){
        if(isLigado){
            Velocidade = Velocidade + 20;
        }
        return Velocidade;
    }

    public String abastecer(int combustivel){
        int necessidadeDoTanque = 60 - getLitrosCombustivel();

        if (combustivel > necessidadeDoTanque) {
            return "Mais combustível do que o necessário";
        } else {
            setLitrosCombustivel(litrosCombustivel + combustivel);
            return "Abastecido com sucesso!";
        }
    }
    public int frear(){
        if(Velocidade >= 20){
            Velocidade = Velocidade - 20;
        } else if (Velocidade > 0 && Velocidade < 20){
            Velocidade = 0;
        }
        return Velocidade;
    }

    public String pintar(String cor){
        Cor = cor;
        return Cor;
    }

    public boolean ligar(){
        if(!isLigado){
            isLigado = true;
            return true;
        }
        return true;
    }

    public boolean desligar(){
        if(Velocidade == 0){
            isLigado = false;
            return false;
        }
        return isLigado;
    }

}
