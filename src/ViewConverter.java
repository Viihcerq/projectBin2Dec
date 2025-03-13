import java.util.Scanner;

public class ViewConverter {

    Converter converter = new Converter();
    Scanner le = new Scanner(System.in);

    public void showConverter(){

        System.out.println("1- Conversão de decimal para binario: \n" +
                "2- Conversão de binario para decimal: ");
        int choice = le.nextInt();
        le.nextLine();

        switch (choice){
            case 1:
                System.out.println("Insira um numero binario");
                String binario = le.nextLine();
                converter.convertToDecimal(binario);
                break;

            case 2:
                System.out.println("Insira um numero decimal");
                String decimal = le.nextLine();
                converter.convertToBinary(decimal);
                break;

            default:
                System.out.println("Digito errado");
        }
    }
}
