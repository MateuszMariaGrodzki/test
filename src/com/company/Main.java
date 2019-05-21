package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer ,String> posibbleChoice = new HashMap<>();
        posibbleChoice.put(0 , "1");
        posibbleChoice.put(1 , "2");
        posibbleChoice.put(2 , "3");
        posibbleChoice.put(3 , "4");
        posibbleChoice.put(4 , "5");

        for (Map.Entry<Integer , String> map: posibbleChoice.entrySet()) {
            System.out.println(map.getValue());
        }
    }
}
