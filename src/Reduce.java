public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int start = 100;

        while(start > 0) {
            if(start % 2 == 0) {
                start /= 2;
            }
            else {
                start -= 1;
            }
            count++;
        }
        System.out.println("Steps it takes to reach 0 when starting at 100: " + count);
    }
}
