package contador;

public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Você deve fornecer exatamente dois parâmetros inteiros.");
            return;
        }

        try {
            int primeiroParametro = Integer.parseInt(args[0]);
            int segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro >= segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros fornecidos não são números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
