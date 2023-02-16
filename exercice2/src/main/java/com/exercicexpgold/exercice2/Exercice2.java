/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice2;

/**
 *
 * @author SORO
 */


import java.util.List;
import java.util.stream.Collectors;

public class Exercice2 {
    public static String getString(List<Integer> list) {
        // Convertir la liste en un flux d'entiers
        return list.stream()
                   // Transformer chaque entier en une chaîne de caractères précédée par "e" ou "o"
                   .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                   // Collecter les chaînes de caractères transformées en une seule chaîne séparée par des virgules
                   .collect(Collectors.joining(","));
    }
}
