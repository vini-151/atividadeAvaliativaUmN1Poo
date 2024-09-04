package vision;

import model.Mercadoria;

import javax.swing.*;
import java.io.Console;

public class venda {

    public static  void main(String[] args){
        Mercadoria produto = new Mercadoria();

        produto.setCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria", "Valor")));
        produto.setFrete((Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do frete", "Valor"))));
        produto.setDespesas((Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das despesas", "Valor"))));
        produto.setValorVenda((Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do produto", "Valor"))));


        System.out.println(produto.percentualLucro(produto.getCusto(),
                produto.getFrete(),
                produto.getDespesas(),
                produto.getValorVenda()));

    }

}
