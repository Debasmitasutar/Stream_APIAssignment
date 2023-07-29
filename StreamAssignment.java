package Streams;

import java.util.Arrays;

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
    public static void main (String[] args){
        StreamAssignment streamDemoObj = new StreamAssignment();
       // streamDemoObj.forEachElement();
        streamDemoObj.doubleEachElement();

    }
}
