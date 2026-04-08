package modelo;

import javax.swing.JOptionPane;

/**
 * Classe Caminhão.
 *
 * @see Veículo
 */
public class Caminhao extends Veiculo {

    private int cargaMax;
    private int alturaMax;
    private int comprimento;

    /**
     * cnostrutor sem argumentos
     */
    public Caminhao() {
        this(0, 0, 0, 0, 0, 0);
    }

    /**
     * cnostrutor com argumentos
     *
     * @param peso
     * @param velocMax
     * @param preco
     * @param cargaMax
     * @param alturaMax
     * @param comprimento
     */
    public Caminhao(int peso, int velocMax, float preco, int cargaMax, int alturaMax, int comprimento) {
        super(peso, velocMax, preco);
        setCargaMax(cargaMax);
        setAlturaMax(alturaMax);
        setComprimento(comprimento);
    }

    /**
     * Modificador da carga máxima.
     *
     * @param cargaMax
     */
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    /**
     * Modificador da altura máxima.
     *
     * @param alturaMax
     */
    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    /**
     * Modificador do comprimento.
     *
     * @param comprimento
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Recuperador da carga máxima.
     *
     * @return Um inteiro com a carga máxima.
     */
    public int getCargaMax() {
        return cargaMax;
    }

    /**
     * Recuperador da altura máxima.
     *
     * @return Um inteiro com a altura máxima do caminhão.
     */
    public int getAlturaMax() {
        return alturaMax;
    }

    /**
     * Recuperador do comprimento.
     *
     * @return Inteiro com o comprimento do caminhão.
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * Pede ao usuario os dados do caminhão.
     */
    @Override
    public void leitura() {
        super.leitura();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Carga Maxima (ton):")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Altura Maxima (m):")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Comprimento (m):")));
    }

    /**
     * Mostra na tela os dados do caminhão.
     */
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    /**
     * Recuperador dos dados do caminhão.
     *
     * @return String
     */
    @Override
    public String paraString() {
        return (super.paraString()
                + "\nCarga Maxima: " + getCargaMax()
                + "ton\nAltura Maxima: " + getAlturaMax()
                + "m\nComprimento: " + getComprimento() + "m");
    }
}
