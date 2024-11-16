public class ReverseString {
    public static void main(String[] args) {
        String str = "Anushka" , nstr = "";
        char ch;
        System.out.println("Original word: ");
        System.out.println("Anushka");
        for (int i = 0;i < str.length(); i++) { 
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("reversed string: " + nstr);
    }

}
