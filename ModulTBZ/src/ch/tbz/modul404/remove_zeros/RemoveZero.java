package ch.tbz.modul404.remove_zeros;

public class RemoveZero {
    public static String removeZero(String str){
        int leading = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' == str.charAt(i)) {
                leading++;
            }else{
                break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.replace(0, leading, "");
        str = stringBuilder.toString();
        return str;
    }
}
