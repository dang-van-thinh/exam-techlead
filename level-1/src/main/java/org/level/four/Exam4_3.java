package org.level.four;
public class Exam4_3 {
    public static void main(String[] args) {
//        String[] input1 = {"abcdefg", "abcde", "abcdef", "ab", "abc"};
//        String[] input1 = {"hello", "world", "jelly"};
        String[] input1 = {"programming", "programmer", "program"};
//        String[] input1 = {"abcd", "ab", "abcd", "ab", "abcd"};
        //Create counter for strings array
        int arr_counter = 0;
        //Set default shortest string
        String shortest_string = input1[0];
        //Create sub string var
        String sub_string = "";
        //Search REAL shortest string
        for(String test_string : input1)
        {
            arr_counter += 1;
            if(shortest_string.length() > test_string.length())
            {
                shortest_string = test_string;
            }
            System.out.println("arr_counter: " + arr_counter);
        }
        System.out.println("Shortest: " + shortest_string.length());
        //Check every substring can be in shortest string if it match with other string
        for(int i = 0;i < shortest_string.length(); i++)
        {
            for(int j = i; j <= shortest_string.length(); j++)
            {
                String sub_string_t = shortest_string.substring(i,j);
                //Sub counter to count number of sub string visible in other string
                int sub_counter = 0;
                for(String test_string : input1)
                {
                    int sub_index = test_string.indexOf(sub_string_t);
                    if(sub_index >= 0)
                    {
                        sub_counter += 1;
                    }
                }
                //All string have sub string
                if(sub_counter == arr_counter)
                {
                    //Check if sub string is longer than current sub string
                    if(sub_string_t.length() > sub_string.length())
                    {
                        sub_string = sub_string_t;
                    }
                }
            }
        }
        //Print
        System.out.println("Longest substring is " + sub_string + " with length: " + sub_string.length());
    }
}