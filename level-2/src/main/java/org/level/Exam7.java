package org.level;

import java.util.*;

public class Exam7 {
    public static void main(String[] args) {
calculator(input());
    }

    static  Map<String, List<Double>>  input(){
        Map<String, List<Double>> students = new HashMap<>();
        students.put("Thinh",Arrays.asList(10.0,4.0,8.0));
        students.put("Tuan",Arrays.asList(9.0,8.5,7.0,6.0));

        System.out.println(students);
        return students;
    }

    static void calculator(Map<String,List<Double>> input){
        for (Map.Entry<String,List<Double>> student: input.entrySet()) {
            String nameStudent = student.getKey();
            List<Double> points = student.getValue();

            double sum = 0;
            for (Double point: points ) {
                sum +=point;
            }

            double result = sum / points.size();

            System.out.println("Diem trung binh cua hoc sinh "+nameStudent+" : "+result);
        }
    }
}
