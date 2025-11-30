package L03;


public class L03_LongestCommonPrefix {

    public String longestCommonPrefix(String[] str) {
        int length = str.length;
        String strCurent = str[0];
        for (int i = 1; i < length; i++) {
            while (!str[i].startsWith(strCurent)) {
                int length_str = strCurent.length();
                strCurent = strCurent.substring(0, length_str - 1);
                
                
            }

        }

        return strCurent;
    }

    public static void main(String[] args) {
        L03_LongestCommonPrefix l03_LongestCommonPrefix = new L03_LongestCommonPrefix();
        String[] str_a = new String[]{"flow", "flow", "flow"};
        String result = l03_LongestCommonPrefix.longestCommonPrefix(str_a);
        System.out.println(result);

    }

}
