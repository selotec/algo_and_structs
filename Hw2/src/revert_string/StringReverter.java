package revert_string;

import stack.StackImpl;

public class StringReverter {
    private StackImpl workStack;
    private String inputString;
    private int stringLen;


    public StringReverter(String inputString) {
        this.inputString = inputString;
        stringLen = inputString.length();
        workStack = new StackImpl(stringLen);
    }

    private void readToStack() {
        for (char ch : inputString.toCharArray()) {
            workStack.push(ch);
        }
    }

    public String revert() {
        StringBuilder result = new StringBuilder();

        readToStack();

        for (int i = 0; i < stringLen; i++) {
            result.append(workStack.pop());
        }

        return result.toString();
    }
}

class Test {
    public static void main(String[] args) {
        String testString1 = "Мама мыла раму!";
        String testString2 = "Анна";

        StringReverter sr1 = new StringReverter(testString1);
        System.out.println(testString1 + " -> " + sr1.revert());

        StringReverter sr2 = new StringReverter(testString2);
        System.out.println(testString2 + " -> " + sr2.revert());
    }
}
