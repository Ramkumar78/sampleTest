package DataTypesAndLoops;

public class PlayWithString {

    public int stringLengthFinder(String test) {
        int textLength = test.length();
        System.out.println(textLength);
        return textLength;

    }

    public char findCharAt(String text, int a) {

        char c;
        if (a < stringLengthFinder(text)) {
            c = text.charAt(a);
            return text.charAt(a);
        } else {
            char b = 0;
            return b;
        }


    }

    public int findIndexOfChar(String text, String ch, int index) {
        index = text.indexOf(ch);
//        System.out.println(index);
        return text.indexOf(ch);
    }

    public String extractStringwithOneIndex(String s, int i) {

        return s.substring(i);
    }


    public String extractStringwithTwoIndex(String s, int i, int j) {

        return s.substring(i, j);
    }

    public String extractStringwithStringLiteral(String s, String X) {

        return s.substring(s.indexOf(X));
    }


}
