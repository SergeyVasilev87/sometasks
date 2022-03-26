import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ContestA {

    private final static char[] CHARS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int wordsCount = Integer.parseInt(bufferedReader.readLine());
        String[] s = bufferedReader.readLine().split(" ");
        ArrayList<Integer> integers = new ArrayList<>();

        for (String str: s) {
            integers.add(Integer.parseInt(str));
        }

        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;

        for (Integer integer: integers) {
            if (sum == 0) {
                sum += integer;
                int i = power(integer);
                stringBuilder.append(CHARS[i]);
            } else if (sum < integer) {
                int i = power(integer - sum);
                sum = integer;
                stringBuilder.append(CHARS[i]);
            } else if (sum > integer) {
                int i = power(sum - integer);
                sum = integer;
                stringBuilder.append(CHARS[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static int power(int i) {
        int numbOfPower = 0;
        while (i > 1) {
            i /= 2;
            numbOfPower++;
        }
        return numbOfPower;
    }
}
