/**
 * @author Rian Mateus
 * @version 1.0
 * Esta classe representará um carro (objeto de nossa realidade), bem como sua marca e preço
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Carro {
    // Aqui irão as subclasses referentes ao carro (marca, modelo e preço em reais)
    private String marca;
    private String modelo;
    private double preco;

    // Aqui faremos um construtor (para criar um novo objeto da classe Carro) e definir os valores das propriedades
    public Carro(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    // métodos getter e setter para obter as propriedades
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // método para imprimir as informações sobre o carro
    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

        /* método para formatar o preço em reais utilizando as seguintes bibliotecas
         java.text.DecimalFormat -> Segue link da documentação pra mais informações: @see <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/DecimalFormat.html">
         java.text.NumberFormat -> Segue link da documentação pra mais informações: @see <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/NumberFormat.html">
         java.util.locale -> Segue link da documentação pra mais informações: @see <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Locale.html">
        */
        NumberFormat formatoMoeda = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String precoFormatado = formatoMoeda.format(preco);

        System.out.println("Preço: " + precoFormatado);
    }

    public static void main(String args[]) {
        // Criando uma instância para alocar na memória um bloco para armazenar os campos "marca", "modelo" e "preco".
        Carro meuCarro = new Carro("Creta", "Hyundai", 85000.0);

        meuCarro.imprimirInformacoes();
    }
}