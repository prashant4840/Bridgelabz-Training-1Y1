public class LC58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastword = arr[arr.length-1];
        return lastword.length();
    }
}
