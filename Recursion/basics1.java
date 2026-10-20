// To print the numbers from 1-10 (without using extra variable)

public class basics1 {
    void fun(int num) {
        if (num == 0)
            return;

        fun(num - 1);
        System.out.println(num);

    }

    public static void main(String[] args) {
        basics1 obj = new basics1();
        obj.fun(10);
    }
}
