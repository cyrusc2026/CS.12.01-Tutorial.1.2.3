import java.util.List;
//I have neither given nor received unauthorized aid on this piece of work.
public class Scramble {
    public static String scrambleWord(String input){
        if (input.length() < 2) {
            return input;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length()-1; i++){
            if (input.charAt(i) == 'A' && (input.charAt(i+1) != (input.charAt(i)))) {
                answer.append(input.charAt(i + 1));
                answer.append(input.charAt(i));
                i++;
            }
            else answer.append(input.charAt(i));
        }
        if ( input.length() > 3){
            answer.append(input.charAt(input.length() - 1));
        }
        return answer.toString();
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
