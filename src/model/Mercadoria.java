package model;

public class Mercadoria {
    double custo;
    double frete;
    double despesas;
    double valorVenda;

    //somar custo, frete, despesas

    public double percentualLucro(double custo, double frete, double despesas, double valorVenda){

        return ((valorVenda - (custo + frete + despesas)) / valorVenda) * 100;
    }





    //gets e sets

    public double getCusto() {
        return custo;
    }

    public double getDespesas() {
        return despesas;
    }

    public double getFrete() {
        return frete;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
