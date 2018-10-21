package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Tadeusz");

        System.out.println("Rozmiar: " + lista.size());

        lista.add("Mateusz");
        lista.add("Karol");

        System.out.println("Rozmiar: " + lista.size());

        for (String imie: lista){
            System.out.println("Imie: " + imie);
        }

        lista.remove("Jan");
        lista.remove(0);

        String imie = lista.get(2);
        System.out.println("Element o indeksie 2: " + imie);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        lista.clear();
    }

}
