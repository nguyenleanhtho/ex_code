package L02;

import java.util.ArrayList;

// chúng ta lấy tiền tố của str1 cộng cho hậu tố của str2 => với điều kiện bằng str2
public class L02_FindRemovsblelndices {

    public int[] getRemovableIndices(String str1, String str2) {
        int length = str2.length();
        ArrayList<Integer> positions_arrayList = new ArrayList<>();
        
     
        for (int i = 0; i <= length; i++) {
            String prefix = str1.substring(0, i);
            String suffix = str2.substring(i);

            //System.out.println("prefix " + i + " : " + prefix + " " + suffix + " : " + i + " suffix ");

            String str = prefix + suffix;

            if (str.equals(str2) && str1.endsWith(suffix)) {
                positions_arrayList.add(i);
            }

        }
        int[] positions_array = new int[positions_arrayList.size()];
        for (int i = 0; i < positions_arrayList.size(); i++) {
            positions_array[i] = positions_arrayList.get(i);
        }

        if(positions_array == null || positions_array.length == 0){
            positions_array = new int[]{-1};
        }
        return positions_array;

    }

    public static void main(String[] args) {
        String str1 = "aabbb";
        String str2 = "aabb";
        String str3 = "abdgggda";
        String str4 = "abdggda";
        String str5 = "mmgghh";
        String str6 = "mfggh";
        L02_FindRemovsblelndices md2 = new L02_FindRemovsblelndices();
        int[] array = md2.getRemovableIndices(str1, str2);
        for (int item : array) {
            System.out.println(item);
        }
        
        int[] array1 = md2.getRemovableIndices(str3, str4);
        for (int item : array1) {
            System.out.println(item);
        }
        
        int[] array2 = md2.getRemovableIndices(str5, str6);
        for (int item : array2) {
            System.out.println(item);
        }
        
        
        
//        System.out.println("Mang chi muc: " + Arrays.toString(md2.kyTuLoaiBo(str1, str2)));
    }

    // Test
    // str1: abdgggda    aabbb  mmgghh
    // str2: abdggda     aabb  mfggh
}
