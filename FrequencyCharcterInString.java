public class FrequencyCharcterInString {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Frequency of character 'l' in the string is : "+frequencyCharacter('l',str));
    }
    // Function to find frequency of a char in a given string
    private static int frequencyCharacter(char c, String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
