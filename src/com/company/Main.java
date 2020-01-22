package com.company;

public class Main {


    public static void main(String[] args) {

        String str1 = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. " +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. " +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч." +
                " Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. " +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. " +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";

        String str2 = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        for (int key = 1; key < str2.length(); key++) {
            char[] charSimbols = str1.toCharArray();
            StringBuilder str3 = new StringBuilder();
            for (int i = 0; i < charSimbols.length; i++) {
                for (int j = 0; j < str2.length(); j++) {
                    char[] alphabet = str2.toCharArray();
                    if (Character.isLowerCase(charSimbols[i])) {
                        alphabet = str2.toLowerCase().toCharArray();
                    }
                    if (charSimbols[i] == alphabet[j] && (j + key) < alphabet.length) {
                        charSimbols[i] = alphabet[j + key];
                        break;
                    } else if (charSimbols[i] == alphabet[j] && (j + key) >= alphabet.length) {
                        charSimbols[i] = alphabet[(j + key) - alphabet.length];
                        break;
                    }
                }
                str3.append(charSimbols[i]);
            }
            System.out.println(str3);
        }
    }
}



