import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.println("Insira um numero binario");
        String binario = le.nextLine();

        if (!binario.matches("[01]+")){
            System.out.println("Digite algo entre 1 ou 0");
            return;
        }else {
            conversorBinario(binario);
        }


    }

    public static void conversorBinario(String binario){
        double decimal = 0;
        int tamanho = binario.length();

        for (int i = 0; i < tamanho; i++) {
            char digito = binario.charAt(i);

            int valor = Character.getNumericValue(digito);

            int expoente = tamanho -1 -i;
            decimal += valor * Math.pow(2, expoente);
        }
        System.out.println("O valor decimal é: " + decimal);
    }
}