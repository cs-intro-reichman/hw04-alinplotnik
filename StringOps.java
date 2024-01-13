public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string = "MMMM";
        char chr = 'M';
        int[] result = allIndexOf(string, chr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
    }
}

    public static String capVowelsLowRest (String string) {
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ((ch >= 65) && (ch <= 90)){   //if big letter
                if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85){ //if aeiou
                    ans = ans + ch; //add as is
                }
                else{
                    ans = ans + ((char)(ch + 32)); //add as lowercase 
                }
            }
            else if ((ch >= 97) && (ch <= 122) || ch == 32){
            if (ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) {                             // if small letter or space
                    ans = ans + ((char)(ch - 32)); //add as uppercase
            }
            else {                             // if its any other char
                ans = ans + ch;                // add as is
            }
        }
    } 
        return ans;
}

    public static String camelCase (String string) {
        int i = 0;
        int length = string.length();

            while (i < length && string.charAt(i) == ' ' ) {  //if the string starts with spaces we will skip them
                i++;
            }

        String ans = "";
            while (i < length) {

        char ch = string.charAt(i);

                if (ch == ' '){

             while (i < length && string.charAt(i) == ' ' ) {  //if there are spaces we will skip them
                        i++;
                }

                if (i < length){
                    ch = string.charAt(i);
                    if (ch >='a' && ch <= 'z'){
                        ans += (char)(ch - 32);
                    }else {
                        ans += ch;
                    }
                    
                }
                i++;
            }
             else if (ch >= 'A' && ch <= 'Z'){
                ans += (char)(ch + 32);
                i++;
             }
             else {
                ans += ch;
                i++;
             }
        }
        return ans;
 }
    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }

        int[] ans = new int[count];
        int currentIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                ans[currentIndex] = i;
                currentIndex++;
            }
        }

        return ans;
    }
}
