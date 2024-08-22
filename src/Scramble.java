import java.util.List;

public class Scramble {
    public static String scrambleWord(String input){
        if (input.length() < 2) {
            return input;
        }
        String answer = "";
        for (int i = 0; i < input.length()-1; i++){
            if (input.charAt(i) == 'A' && (input.charAt(i+1) != (input.charAt(i)))) {
                answer += (input.charAt(i+1));
                answer += (input.charAt(i));
                i++;
            }
            else answer += (input.charAt(i));
        }
        if ( input.length() > 3){
            answer += input.charAt(input.length()-1);
        }
        return answer;
    }
    public static void scrambleOrRemove(List<String> wordList){
        for (int i = 0; i<wordList.size(); i++){
            String original = wordList.get(i);
            String altered = Scramble.scrambleWord(original);
            if (!original.equals(altered)) {
                wordList.set(i,altered);
            }
            else {
                wordList.remove(i);
                i-= 1;
            }

        }
    }
}
