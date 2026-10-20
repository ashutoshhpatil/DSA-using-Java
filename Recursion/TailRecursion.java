public class TailRecursion {
    void fun(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        fun(--num);
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        TailRecursion obj = new TailRecursion();
        obj.fun(2);
        System.out.println("End Main");
    }
}
