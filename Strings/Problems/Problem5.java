import java.util.Arrays;
public class Problem5 {

    // Optimized one
    public static void main(String[] args) {
        String str1 = "listena";
        String str2 = "silente";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
    




    // public static void main(String[] args) {
    //     String str1 = "bdcea";
    //     String str2 = "abcde";

    //     if(isAnagrams(str1,str2)){
    //         System.out.println(str1 + ", " + str2 + " are Anagrams.");
    //     } else {
    //         System.out.println(str1 + ", " + str2 + " are not Anagrams.");
    //     }
    // }

    // public static boolean isAnagrams(String a, String b){
    //     if(a.length() == b.length()){
    //         int count = 0;
    //         for (int i = 0; i < a.length(); i++) {
    //             char ch = a.charAt(i);
    //             int flag = 0;

    //             for (int j = 0; j < b.length(); j++) {
    //                 if(ch == b.charAt(j)){
    //                     flag = 1;
    //                     count++;
    //                     b = b.replaceFirst(Character.toString(ch), "");
    //                     break;
    //                 }
    //             }

    //             if(flag == 0){
    //                 return false;
    //             }
    //         }

    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
}
