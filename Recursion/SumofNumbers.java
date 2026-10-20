public class SumofNumbers {
    int fun(int num) {
        if (num == 1)
            return 1;
        return num + fun(--num);
    }

    public static void main(String[] args) {
        SumofNumbers obj = new SumofNumbers();
        int ret = obj.fun(5);
        System.out.println(ret);
    }
}
