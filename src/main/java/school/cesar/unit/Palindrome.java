package school.cesar.unit;


public class Palindrome {

    public static boolean check (String word) {
        int length = word.length()-1;

        if (word.length() <= 1){
            return true;
        }

        if (word.charAt(0) == word.charAt(length)){
            return check(word.substring(1,length-1));

        }

        return false;
    }
}
