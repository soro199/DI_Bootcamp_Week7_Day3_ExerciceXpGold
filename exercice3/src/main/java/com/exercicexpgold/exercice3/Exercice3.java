/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice3;

/**
 *
 * @author SORO
 */

import java.util.List;

public class Exercice3 {
    public static <T extends Comparable<T>> T findMaximalElement(List<T> list, int begin, int end) {
        // Vérifier si l'intervalle spécifié est valide
        if (begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Intervalle non valide");
        }

        // Définir un maximum initial en utilisant le premier élément de l'intervalle
        T max = list.get(begin);
        // Boucler sur les éléments restants de l'intervalle
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            // Si l'élément courant est supérieur au maximum actuel, le mettre à jour
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        // Retourner le maximum trouvé
        return max;
    }
}
