public class SumofDigits {
    int sum = 0;

    int sumDigit(int num) {
        if (num == 0)
            return sum;

        sum = sum + num % 10;
        num = num / 10;
        sumDigit(num);
        return sum;
    }

    public static void main(String[] args) {
        SumofDigits obj = new SumofDigits();
        int ret = obj.sumDigit(1234);
        System.out.println(ret);
    }
}
