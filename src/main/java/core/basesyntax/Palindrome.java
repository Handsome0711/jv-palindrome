package core.basesyntax;

public class Palindrome {
    public boolean isPalindrome(String text) {
        StringBuilder resultText = new StringBuilder(text
                .toLowerCase()
                .replaceAll("[^A-Za-zА-Яа-я0-9]", ""));
        return resultText.toString().equals(resultText.reverse().toString());
    }
}
