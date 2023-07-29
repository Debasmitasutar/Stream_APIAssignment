package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamAssignment {
    public void forEachElement(){
        int[] intArr = {2,3,4,5,10 ,6};
        Arrays.stream(intArr)
                .forEach(System.out::println);
    }
    public void doubleEachElement(){
        int[] intArr = {2,30,6,5,0,7,3};
        Arrays.stream(intArr)
                .map(element -> element * 2)
                .forEach(System.out::println);
    }
    public void doubleValueNewlist(){
        Object [] intArr = {7,8,9,48,9};
        List<Object> doubleList = Arrays.stream(intArr)
                                         .collect(Collectors.toList());
        for (Object number : doubleList) {
            System.out.println(number);
        }
    }
    public static void main (String[] args){
        StreamAssignment streamDemoObj = new StreamAssignment();
       // streamDemoObj.forEachElement();
       // streamDemoObj.doubleEachElement();
        streamDemoObj.doubleValueNewlist();

    }
}
