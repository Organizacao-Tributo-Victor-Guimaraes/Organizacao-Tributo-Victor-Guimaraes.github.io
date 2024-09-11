public class InterpretadorSemantico {
    public double interpret(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input inválido. Formato esperado: 'numero operador numero'");
        }

        double operadorEsquerdo = parseNumber(parts[0]);
        String operador = parts[1];
        double operadorDireito = parseNumber(parts[2]);

        return calculate(operadorEsquerdo, operador, operadorDireito);
    }

    private double parseNumber(String number) {
        try {
            return Double.parseDouble(number.replace(",", "."));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Número inválido: " + number);
        }
    }

    private double calculate(double operadorEsquerdo, String operador, double operadorDireito) {
        switch (operador) {
            case "mais":
                return operadorEsquerdo + operadorDireito;
            case "menos":
                return operadorEsquerdo - operadorDireito;
            case "divide":
                return operadorEsquerdo / operadorDireito;
            case "multiplica":
                return operadorEsquerdo * operadorDireito;
            default:
                throw new UnsupportedOperationException("Operador não suportado: " + operador);
        }
    }
}
