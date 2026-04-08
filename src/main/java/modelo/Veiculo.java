package modelo;

import javax.swing.JOptionPane;

/**
 * Classe Veículo.
 */
public class Veiculo {

    private int peso;
    private int velocMax;
    private float preco;

    /**
     * cnostrutor sem argumentos.
     */
    public Veiculo() {
        this(0, 0, 0);
    }

    /**
     * cnostrutor com argumentos.
     *
     * @param peso
     * @param velocMax
     * @param preco
     */
    public Veiculo(int peso, int velocMax, float preco) {
        setPeso(peso);
        setVelocMax(velocMax);
        setPreco(preco);
    }

    /**
     * Modificador do peso.
     *
     * @param peso Int
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Modificador da velocidade máxima.
     *
     * @param velocMax Int
     */
    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    /**
     * Modificador do preço.
     *
     * @param preco float
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * Recuperador do peso.
     *
     *
     * @return Inteiro com o peso do veículo.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Recuperador da velocidade máxima.
     *
     * @return Inteiro com a velocidade máxima do veículo.
     */
    public int getVelocMax() {
        return velocMax;
    }

    /**
     * Recuperador do preço.
     *
     * @return float com o preço do veículo.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Pede ao usuario os dados do veículo.
     */
    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Peso(Kg):")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Velocidade Maxima(Km/h):")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preco(US$):")));
    }

    /**
     * Mostra na tela os dados do veículo.
     */
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    /**
     * Recuperador dos dados do veículo.
     *
     * @return String
     */
    public String paraString() {
        return ("Peso: " + getPeso()
                + " Kg\nVelocidade Maxima: " + getVelocMax()
                + " Km/h\nPreco: US$" + getPreco());
    }
}
