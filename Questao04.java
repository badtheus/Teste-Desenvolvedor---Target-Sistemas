	public class Questao04 {
    
		public static void main(String[] args) {
        double[] faturamento = {
            67836.43, // SP
            36678.66, // RJ
            29229.88, // MG
            27165.48, // ES
            19849.53  // Outros
        };

        double total = 0;
        for (double valor : faturamento) {
            total += valor;
        }

        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        for (int i = 0; i < faturamento.length; i++) {
            double percentual = (faturamento[i] / total) * 100;
            System.out.printf("Faturamento em %s: %.2f%%\n", estados[i], percentual);
        }
    }
}
