public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() <= 2) {
            return false;
        }
       String last2 = x.substring(x.length()-2);
       if (last2.equals("ly")) {
        return true;
       }
       return false;
    }

    public String conCat(String s1, String s2) {
        if (s1.equals("")) {
            return s2;
        }
        else if (s2.equals("")) {
            return s1;
        }
        String last = s1.substring(s1.length()-1);
        String first = s2.substring(0,1);
        if (last.equals(first)) {
            return s1.substring(0,s1.length()-1) + s2;
        }
        else if (last != first) {
            String together = s1 + s2;
            return together;
        }
        return "";
    }

    public String withoutX(String s1) {
        String first = s1.substring(0,1);
        String last = s1.substring(s1.length()-1);
        if (first.equals("x") && last.equals("x")) {
            String news1 = s1.substring(1,s1.length()-1);
            return news1;
        }
        else if (first.equals("x")) {
            String news1 = s1.substring(1);
            return news1;
        }
        else if (last.equals("x")) {
            String news1 = s1.substring(0,s1.length()-1);
            return news1;
        }
        return s1;
    }

    public String fizzString(String s1) {
    String last = s1.substring(s1.length()-1);
    String first = s1.substring(0,1);
        if (last.equals("b") && first.equals("f")) {
            return "FizzBuzz";
        }
        else if (first.equals("f")) {
            return "Fizz";
        }
        else if (last.equals("b")) {
            return "Buzz";
        }
        return s1;
    }

    public String fizzString2(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        }
        else if (x % 3 == 0) {
            return "Fizz" + "!";
        }
        else if (x % 5 == 0) {
            return "Buzz" + "!";
        }
        else {
            String y = x + "!";
            return y;
        }

    }

}
