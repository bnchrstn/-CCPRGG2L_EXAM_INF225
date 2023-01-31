public class App {
    public static void main(String[] args) throws Exception {
        
        String fullName = "ben christian aceveda";

        removeLetters(fullName);

    }

    static void removeLetters(String str) {
        String result = removeLetters(str, "", 0);
        System.out.println(result);
    }

    static String removeLetters(String fullName, String result, int index) {
        if (index >= fullName.length()) {
          return result;
        }
        char letter = fullName.charAt(index);
        String vowels = "aeiou";
        int isVowel = vowels.indexOf(letter) >= 0 ? 0 : 1;
        return removeLetters(fullName, isVowel == 1 ? result + letter : result, index + 1);
    }

}
