public class RemoveAllWhitespacesFromString {
    public static void main(String[] args) {
        String str = "   Hello, World!  ";
        System.out.println("Original string: \"" + str + "\""); 
        String s = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                s += ch;
            }
        }
        System.out.println("Result after removing all whitespaces from the given string is : \""+s+"\"");
    }
}
