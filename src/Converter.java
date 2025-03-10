public class Converter {
    private double decimal;


    public void converterBinaryFromDecimal(String binary){
        int length = binary.length();
        if (length <= 8){
            for (int i = 0; i < length; i++) {
                char digit = binary.charAt(i);
                int value = Character.getNumericValue(digit);

                int exponent = length - 1 - i;
                decimal += value * Math.pow(2, exponent);
            }
            System.out.println("Decimal do numero: " + binary + " é: " + decimal);
        }
    }


}

