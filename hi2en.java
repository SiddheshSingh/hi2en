import java.util.HashMap;
import java.util.Map;

public class hi2en {

    private static final Map<String, String> vowels = new HashMap<String, String>() {{
        put("अ", "a");
        put("आ", "aa");
        put("इ", "i");
        put("ई", "ee");
        put("उ", "u");
        put("ऊ", "oo");
        put("ऋ", "ru");
        put("ए", "e");
        put("ऐ", "ai");
        put("ओ", "o");
        put("औ", "au");
    }};

    private static final Map<String, String> consonants = new HashMap<String, String>() {{
        put("क", "k");
        put("ख", "kh");
        put("ग", "g");
        put("घ", "gh");
        put("ङ", "ng");
        put("च", "ch");
        put("छ", "chh");
        put("ज", "j");
        put("झ", "jh");
        put("ञ", "ny");
        put("ट", "t");
        put("ठ", "th");
        put("ड", "d");
        put("ढ", "dh");
        put("ण", "nn");
        put("त", "t");
        put("थ", "th");
        put("द", "d");
        put("ध", "dh");
        put("न", "n");
        put("प", "p");
        put("फ", "ph");
        put("ब", "b");
        put("भ", "bh");
        put("म", "m");
        put("य", "y");
        put("र", "r");
        put("ल", "l");
        put("व", "v");
        put("श", "sh");
        put("ष", "sh");
        put("स", "s");
        put("ह", "h");
        put("क्ष", "ksh");
        put("त्र", "tr");
        put("ज्ञ", "jny");
    }};

    private static final Map<String, String> modifiers = new HashMap<String, String>() {{
        put("ा", "aa");
        put("ि", "i");
        put("ी", "ee");
        put("ु", "u");
        put("ू", "oo");
        put("ृ", "ru");
        put("े", "e");
        put("ै", "ai");
        put("ो", "o");
        put("ौ", "au");
        put("ं", "ng");
        put("ः", "h");
        put("्", "");
    }};

    private static final Map<String, String> fullstop = new HashMap<String, String>() {{ 

        put("।", ".");
        put("|", ".");
    }};

    public static String transliterate(String input) {
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            String currentChar = Character.toString(ch);
            if (vowels.containsKey(currentChar)) {
                output.append(vowels.get(currentChar));
            } else if (consonants.containsKey(currentChar)) {
                output.append(consonants.get(currentChar));
            } else if (modifiers.containsKey(currentChar)) {
                output.append(modifiers.get(currentChar));
            } else if (fullstop.containsKey(currentChar)) {
                output.append(fullstop.get(currentChar));
            } else {
                output.append(currentChar);
            }
        }

        return output.toString().trim();
    }
}
