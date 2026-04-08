package modelo;

import javax.swing.JOptionPane;

/**
 * Classe Carro de Passeio.
 *
 * @see Veículo
 */
public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    /**
     * cnostrutor sem argumentos.
     */
    public CarroPasseio() {
        this(0, 0, 0, "", "");
    }

    /**
     * cnostrutor com argumentos.
     *
     * @param peso
     * @param velocMax
     * @param preco
     * @param cor
     * @param modelo
     */
    public CarroPasseio(int peso, int velocMax, float preco, String cor, String modelo) {
        super(peso, velocMax, preco);
        setCor(cor);
        setModelo(modelo);
    }

    /**
     * Modificador da cor.
     *
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Modificador do modelo
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Recuperador da cor.
     *
     * @return String com a cor do carro de passeio.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Recuperador da modelo.
     *
     * @return String com o modelo do carro de passeio.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Pede ao usuario os dados do carro de passeio.
     */
    @Override
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("Cor:"));
        setModelo(JOptionPane.showInputDialog("Modelo:"));
    }

    /**
     * Mostra na tela os dados do carro de passeio.
     */
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    /**
     * Recuperador dos dados do carro de passeio.
     *
     * @return String
     */
    @Override
    public String paraString() {
        return (super.paraString() + "\nCor: " + getCor()
                + "\nModelo: " + getModelo());
    }
}
