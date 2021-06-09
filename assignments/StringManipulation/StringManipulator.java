public class StringManipulator {
    // public String trimAndConcat(String str1, String str2){
    //     return str1.trim() + str2.trim();
    // }
    // public Integer getIndexOrNull(String str, char ch1){
    //     Integer result = str.indexOf(ch1);
    //     if(result < 0){
    //         result = null;
    //     }
    //     return result;
    // }
    // public Integer getIndexOrNull(String str, String char){
    //     return str.indexOf(char);
    // }
    public String concatSubstring(String str1, Integer int1, Integer int2, String str2){
        return str1.indexOf(int1) + str2;
    }
}