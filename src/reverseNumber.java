public class reverseNumber {

    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse num is:: " + rev);

        // Reversing a number using string buffer
        int num1 = 12345;

//        StringBuffer sbf = new StringBuffer(num1);
//        sbf.reverse();


        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());


    }

}
