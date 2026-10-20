public class NonTailRecursion2 {
    int fun(int num) {
        if (num == 0)
            return 1;

        return 5 + fun(--num);
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        NonTailRecursion2 obj = new NonTailRecursion2();
        int ret = obj.fun(2);
        System.out.println(ret);
        System.out.println("End Main");

    }
}
