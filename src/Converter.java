public class Converter {


    public void convertToDecimal (String binary){
        double decimal = 0;
        int length = binary.length();

        if (length <= 8 && !verifyDigitBinary(binary)){
            for (int i = 0; i < length; i++) {
                char digit = binary.charAt(i);
                int value = Character.getNumericValue(digit);

                int exponent = length - 1 - i;
                decimal += value * Math.pow(2, exponent);
            }
            System.out.println("Decimal do numero: " + binary + " é: " + decimal);
        }
    }

    private boolean verifyDigitBinary(String binary) {
        if (!binary.matches("[01]+")){
            System.out.println("Digite algo entre 1 ou 0");
            return true;
        }
        return false;
    }

    public void convertToBinary(String numero){
        int numeroDecimal = Integer.parseInt(numero);
        String binary = "";
        if (numeroDecimal > 0) {
            while (numeroDecimal > 0) {
                binary = (numeroDecimal % 2) + binary;
                numeroDecimal = numeroDecimal / 2;
            }
            System.out.println("Binario do numero: " + numero + " é: " + binary);
        }else {
            System.out.println("Digite um numero maior que 0");
        }
    }
}

