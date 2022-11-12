package main.java.regex;

import java.math.BigDecimal;
import java.util.Optional;

public class ValidateMonetaryValueWithRegex {
    public static void main(String[] args) {
        String valor =  "999999999.00";
//        System.out.println(valor.matches("(?:\\.|[0-9])*"));
//        System.out.println(valor.matches("[+]?[0-9]+\\.[0-9]+[0-9]+"));
        System.out.println(valor);
        System.out.println("É um valor monetário válido para o pix ? " + isValidValor(valor));
        Optional.ofNullable(valor)
                .filter(ValidateMonetaryValueWithRegex::isValidValor)
                .map(BigDecimal::new)
                .ifPresent(System.out::println);

        var teste = !(true && true && true);
        System.out.println(teste);
    }

    private static boolean isValidValor(String valor){
        //regex aceita apenas valores numéricos positivos e com duas casas decimais separada por ponto.
        return valor != null ? valor.matches("[+]?\\d+\\.\\d\\d") : false;
    }
}
