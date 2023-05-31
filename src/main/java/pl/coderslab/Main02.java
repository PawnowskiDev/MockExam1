package pl.coderslab;

//Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanych w parametrze length.
//Przykład dla napisu Naucz się programować od podstaw oraz ilości znaków 2 otrzymamy Na.

public class Main02 {

    public static void main(String[] args) {

        String str = "Ala ma kota a kot ma Ale";
        int length = 11;

        System.out.println(shorten(str, length));
    }

    static String shorten(String str, int length) {

        if (str.length() <= length) {
            return str;
        } else
        return str.substring(0, length);
    }
}
