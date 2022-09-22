public class LongestCommonPrefix {

    public String commonPrefix(String[] str){
        if (str.length == 0)
            return "";
		String prefix = str[0];
        //System.out.println(prefix);
		for (int i = 1; i < str.length; i++)

			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
                //System.out.println(prefix);
				if (prefix.isEmpty())
                    return "";
			}
		return prefix;
    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        LongestCommonPrefix Long=new LongestCommonPrefix();
        String str1=Long.commonPrefix(str);
        System.out.println(str1);



    }
}
