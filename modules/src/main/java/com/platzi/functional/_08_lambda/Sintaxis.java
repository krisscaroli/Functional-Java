package com.platzi.functional._08_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = Arrays.asList("Java","Functional");
        cursos.forEach(curso ->System.out.println(curso));
    }
}
