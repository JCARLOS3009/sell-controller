/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poderosabeleza.bellezahub;

/**
 *
 * @author JoseCarlos
 */
class Venda {
    private double valor;
    int quantidade;
    private String numeroNota;
    private String dataEmissao;
    private String nomeCliente;
    private String nomeProduto;

    public Venda(double valor, int quantidade, String numeroNota, String dataEmissao, String nomeCliente, String nomeProduto) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.numeroNota = numeroNota;
        this.dataEmissao = dataEmissao;
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
    }

    public double getValorTotal() {
        return valor * quantidade;
    }

    // Adicione métodos getters para os novos atributos

    public String getNumeroNota() {
        return numeroNota;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
