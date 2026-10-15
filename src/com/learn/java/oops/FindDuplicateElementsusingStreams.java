package com.learn.java.oops;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsusingStreams {

    private static List<Integer> findDuplicateElements(List<Integer> elements) {
        Set<Integer> duplicates = new HashSet<Integer>();
        List<Integer> duplicateElements = elements.stream().filter(e -> !duplicates.add(e)).distinct()
                .collect(Collectors.toList());
        return duplicateElements;
    }

    public static void main(String[] args) {

        List<Integer> inputElements = Arrays.asList(4, 2, 7, 2, 4, 9, 2, 7);
        List<Integer> result = FindDuplicateElementsusingStreams.findDuplicateElements(inputElements);
        System.out.println("Duplicate Elements : " + result);
    }
}
