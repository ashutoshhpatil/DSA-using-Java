public class DoubleRecursion {
    int fun(int num) {
        if (num <= 1)
            return 1;

        return fun(num - 2) + fun(num - 1);
    }

    public static void Main(String[] args) {
        DoubleRecursion obj = new DoubleRecursion();
        int ret = obj.fun(8);
        System.out.println(ret);
    }
}
