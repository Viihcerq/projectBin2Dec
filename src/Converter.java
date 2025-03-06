public class Converter {
    private double decimal;


    public void converterBinaryFromDecimal(String binary){
        // eu recebo um numero binario do tipo String e guardo ele numa variavel chamada tamanho
        int length = binary.length();
        // aqui eu vou percorrer cada numero que entrar na variavel binario, assim vou poder converter pra decimal cada digito
        for (int i = 0; i < length; i++) {
            // aqui eu estou passando cada numero da variavel binaria, para uma variavel chamda digito, do tipo char, para que eu posso pegar cada digito de forma separada
            char digit = binary.charAt(i);

            // isso é usado para converter um caracter em um numero inteiro, muito util para usar em entradas de numeros diferentes binario, romanos e etc.
            // ele vai sempre retornar de acordo com o caracter que voce colocar, e vai retornar um inteiro
            // por exemplo digito = xx; ele vai retornar 20, por que ele converte a entrada romana em um int
            int value = Character.getNumericValue(digit);

            // aqui eu faço a conta do expoente, que precisa está de acordo com o tamanho do numero binario, por exemplo, se entrar o numero binario 101, o valor maximo do expoente vai ter 3 começando do zero
            // dai a vai ser 3 - 1 - 1 e iremos ter o valor do expoente para o primeiro digito e assim sussecivamente
            int exponent = length - 1 - i;

            // aqui eu fdaço a conta do valor(que é o digito que eu converti) veze a potencia de base dois, de acordo com o expoente e atribuo tudo isso a uma variavel decimal
            decimal += value * Math.pow(2, exponent);
        }
        System.out.println("Decimal do numero: " + binary + " é: " + decimal);
    }
}

