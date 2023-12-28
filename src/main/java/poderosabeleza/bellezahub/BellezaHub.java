/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poderosabeleza.bellezahub;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseCarlos
 */
public class BellezaHub {
    public static void main(String[] args) {
        // Exemplo de vendas
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(50.0, 100, "123", "01/01/2023", "Cliente1", "ProdutoA"));
        vendas.add(new Venda(30.0, 150, "124", "02/01/2023", "Cliente2", "ProdutoB"));
        vendas.add(new Venda(20.0, 80, "125", "03/01/2023", "Cliente3", "ProdutoC"));

        // Calcular KPIs
        double receitaTotal = calcularReceitaTotal(vendas);
        double ticketMedio = calcularTicketMedio(vendas);
        int quantidadeTotal = calcularQuantidadeTotal(vendas);

        // Exibir resultados com dados adicionais
        System.out.println("Receita Total: $" + receitaTotal);
        System.out.println("Ticket Médio: $" + ticketMedio);
        System.out.println("Quantidade Total Vendida: " + quantidadeTotal);

        // Exibir dados adicionais
        for (Venda venda : vendas) {
            System.out.println("\nDetalhes da Venda:");
            System.out.println("Número de Nota: " + venda.getNumeroNota());
            System.out.println("Data de Emissão: " + venda.getDataEmissao());
            System.out.println("Nome do Cliente: " + venda.getNomeCliente());
            System.out.println("Nome do Produto: " + venda.getNomeProduto());
        }
    }

    private static double calcularReceitaTotal(List<Venda> vendas) {
        double receitaTotal = 0;
        for (Venda venda : vendas) {
            receitaTotal += venda.getValorTotal();
        }
        return receitaTotal;
    }

    private static double calcularTicketMedio(List<Venda> vendas) {
        if (vendas.isEmpty()) {
            return 0;
        }

        double receitaTotal = calcularReceitaTotal(vendas);
        return receitaTotal / vendas.size();
    }

    private static int calcularQuantidadeTotal(List<Venda> vendas) {
        int quantidadeTotal = 0;
        for (Venda venda : vendas) {
            quantidadeTotal += venda.quantidade;
        }
        return quantidadeTotal;
    }
}