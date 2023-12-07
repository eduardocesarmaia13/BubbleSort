/*
Given an array of strings: {"zzxaoxyxovxvaxxvovvxoxbaoxnnxaxnmmaxnxo", "ggddoxxssakhhapaloyoooxkofhdaaokjkallds", "aoqoawttoyiiaexeoaoqewrtoyyuuaouytaiipo"}
        Determine which caracters we have in common across the strings.
        Expected result {"x","y","a","o"}
*/

public class ListaStrings {
    public static void main(String[] args) {
        String[] strings = {
                "zzxaoxyxovxvaxxvovvxoxbaoxnnxaxnmmaxnxo",
                "ggddoxxssakhhapaloyoooxkofhdaaokjkallds",
                "aoqoawttoyiiaexeoaoqewrtoyyuuaouytaiipo"
        };

        String variavelLetra = "";

        for (int num_palavra = 0; num_palavra < strings[0].length(); num_palavra++) {
            char palavra = strings[0].charAt(num_palavra);
            boolean letraIgual = true;

            for (int letra = 1; letra < strings.length; letra++) {
                if (strings[letra].indexOf(palavra) == -1) {
                    letraIgual = false;
                    break;
                }
            }

            if (letraIgual && variavelLetra.indexOf(palavra) == -1) {
                variavelLetra += palavra;
            }
        }

        System.out.println("Letras Iguais: " + variavelLetra);
    }
}
