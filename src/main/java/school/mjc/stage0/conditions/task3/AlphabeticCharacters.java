package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {

    public void vowelDeterminer(char character) {
        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            if (isVowel(character)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    private boolean isVowel(char character) {
        return character == 'a' || character == 'A'
                || character == 'e' || character == 'E'
                || character == 'i' || character == 'I'
                || character == 'o' || character == 'O'
                || character == 'u' || character == 'U'
                || character == 'y' || character == 'Y';
    }
}