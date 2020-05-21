
import java.util.stream.IntStream;

public class FindIndexOfElementInArr {
    public static void main(String[] args) {
        System.out.println(getIdx(new char[]{'a','b','c'}, 'r'));
    }
    

    public static int getIdx(char[] ds, char c) {
        int len = ds.length;
        return IntStream.range(0, len).filter(i -> c == ds[i]).findFirst().orElse(-1);
    }
}