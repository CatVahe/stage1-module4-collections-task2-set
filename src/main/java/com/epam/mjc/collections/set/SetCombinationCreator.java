package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinSet = new HashSet<>(firstSet);
        combinSet.retainAll(secondSet);
        combinSet.removeAll(thirdSet);

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        combinSet.addAll(thirdSet);
        return combinSet;
    }
}
