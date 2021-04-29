package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.isBlank()) {
            return -1;
        }
        for (Character c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result += Integer.parseInt(c.toString());
            }
        }
        return result;
    }
}
