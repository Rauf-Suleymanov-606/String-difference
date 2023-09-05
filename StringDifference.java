public class StringDifference {
    public static char getNotExistingLetter(String s1, String s2) {

        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum += s1.charAt(i);
        }
        for (int j = 0; j < s2.length(); j++) {
            sum -= s2.charAt(j);

        }
        System.out.println(sum);


        return (char) Math.abs(sum);
    }
}
