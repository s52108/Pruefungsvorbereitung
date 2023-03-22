package online.UebungsblattStrings.Grossbuchstaben;

import online.UebungsblattStrings.CSVParser.CSVParser;

import static online.UebungsblattStrings.Grossbuchstaben.Grossbuchstaben.wortanfangGross;

public class GrossbuchstabenDemo {

    public static void main(String[] args) {
        String text = "Java ist cool,,,,,!";
        wortanfangGross(text);


        CSVParser neu = new CSVParser("as;sd;df;gh;hj;");
        System.out.println("neu.countComma() = " + neu.countComma());
        String[] result = neu.parse();
        for (String column : result) {
            System.out.println(column);
        
        
    }
}}
