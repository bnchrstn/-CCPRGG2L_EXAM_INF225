public class App {
    public static void main(String[] args) throws Exception {
        
        String fullName = "ben christian aceveda";

        removeLetters(fullName);

    }

    static void removeLetters(String str) {
        String result = removeConsonants(str, "", 0);
        System.out.println(result);
    }

    static String removeConsonants(String fullName, String result, int index) {
        if (index >= fullName.length()) {
          return result;
        }
        char letter = fullName.charAt(index);
        String vowels = "aeiou";
        int isVowel = vowels.indexOf(letter) >= 0 ? 0 : 1;
        return removeConsonants(fullName, isVowel == 1 ? result + letter : result, index + 1);
    }

}
