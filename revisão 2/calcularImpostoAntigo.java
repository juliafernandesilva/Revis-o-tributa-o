public class SimuladorTributario {
    
    // Método estático: calcula imposto com alíquota antiga
    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
    }
    
    // Método estático: calcula imposto com alíquota proposta
    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * (aliquotaProposta / 100.0);
    }
    
    // Método estático: calcula a diferença entre os impostos
    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return Math.abs(impostoProposto - impostoAntigo);
    }
    
    // Método não estático: imprime status do diálogo político
    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }
    
    // Método principal
    public static void main(String[] args) {
        // Valor de faturamento de exemplo
        double faturamento = 50_000_000.00;
        
        System.out.println("=== Análise de Tributação de Fintechs ===");
        System.out.printf("Faturamento Base: R$ %.2f%n", faturamento);
        System.out.println();
        
        // ========== PROPOSTA A: 9% -> 15% ==========
        System.out.println("-- Proposta A (9% -> 15%) --");
        double impostoAntigo_A = calcularImpostoAntigo(faturamento, 9);
        double impostoProposto_A = calcularImpostoProposto(faturamento, 15);
        double diferenca_A = calcularDiferenca(impostoAntigo_A, impostoProposto_A);
        
        System.out.printf("Imposto Antigo (9%%): R$ %.2f%n", impostoAntigo_A);
        System.out.printf("Imposto Proposto (15%%): R$ %.2f%n", impostoProposto_A);
        System.out.printf("Aumento de Imposto: R$ %.2f%n", diferenca_A);
        System.out.println();
        
        // ========== PROPOSTA B: 15% -> 20% ==========
        System.out.println("-- Proposta B (15% -> 20%) --");
        double impostoAntigo_B = calcularImpostoAntigo(faturamento, 15);
        double impostoProposto_B = calcularImpostoProposto(faturamento, 20);
        double diferenca_B = calcularDiferenca(impostoAntigo_B, impostoProposto_B);
        
        System.out.printf("Imposto Antigo (15%%): R$ %.2f%n", impostoAntigo_B);
        System.out.printf("Imposto Proposto (20%%): R$ %.2f%n", impostoProposto_B);
        System.out.printf("Aumento de Imposto: R$ %.2f%n", diferenca_B);
        System.out.println();
        
        // ========== ANÁLISE DE DIÁLOGO ==========
        System.out.println("-- Análise de Diálogo --");
        SimuladorTributario simulador = new SimuladorTributario();
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
    }
}