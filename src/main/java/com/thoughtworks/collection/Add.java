package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sumOfEvens = 0;
        int start = 0;
        int end = 0;
        if (leftBorder <= rightBorder) {
            start = leftBorder;
            end = rightBorder;
        }
        else if (leftBorder > rightBorder) {
            start = rightBorder;;
            end = leftBorder;
        }
        else {
            throw new NotImplementedException();
        }
        for (int index = start; index <= end; index++) {
            if (index % 2 == 0)
                sumOfEvens += index;
        }
        return sumOfEvens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumOfOdds = 0;
        int start = 0;
        int end = 0;
        if (leftBorder <= rightBorder) {
            start = leftBorder;
            end = rightBorder;
        }
        else if (leftBorder > rightBorder) {
            start = rightBorder;;
            end = leftBorder;
        }
        else {
            throw new NotImplementedException();
        }
        for (int index = start; index <= end; index++) {
            if (index % 2 == 1)
                sumOfOdds += index;
        }
        return sumOfOdds;
    }

}
