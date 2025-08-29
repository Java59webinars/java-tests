package toolkit;
public class TextNumberToolkit {
    /**
     * Check if two string have the same chars
     * CaseInsensitive
     * If impossible (return false)
     */
    static boolean isAnagramLettersOnly(String testString, String original){
        if (testString == null || original == null) return false;
        String testNorm = filterLettersToLower(testString);
        String origNorm = filterLettersToLower(original);
        if(testNorm.isEmpty() || origNorm.isEmpty() || testNorm.length() != origNorm.length()) return false;
        int[] freq = new int[256];
        for (char c: testNorm.toCharArray()){
            freq[c]++;
        }
        for (char c: origNorm.toCharArray()){
            freq[c]--;
        }
        for (int v: freq){
            if(v!=0) return false;
        }
        return true;
    }

    private static String filterLettersToLower(String rawString) {
        StringBuilder sb = new StringBuilder();
        for(char c: rawString.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }


}
