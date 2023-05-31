package pl.coderslab;

//Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w napisie str wszystkich wystąpień napisu forReplace przez napis replacement.

public class Main06 {

    public static void main(String[] args) {

        String str = "Java programowanie, Java kurs, Java jest spoko";
        String newStr = replaceStr(str, "java", "****");
        System.out.println(newStr);

    }

    static  String replaceStr(String str, String forReplace, String replacement) {

        return str.replaceAll("(?i)" + forReplace, replacement);
    }
}
