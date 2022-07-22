package com.platzi.functional._15_streams_intro;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = Arrays.asList("Java","Fronted","Backend");
        for (String course: courseList){
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi: "+newCourseName);
        }

        Stream<String> coursesStream=Stream.of("Java",
                "FronEnd",
                "Backend",
                "FullStack");
        //Stream<Integer> courseLengthStream = coursesStream.map(course ->course.length());
        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);
        Stream<String> emphasisCourses = coursesStream.map(course -> course+"!");
       // Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));
        emphasisCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();
        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);

    }
}
