package dequy.fibonacci;

//Dãy Fibonacci là một dãy số bắt đầu bằng hai số 0 và 1, và các số sau đó được tính bằng cách cộng hai số trước đó.
// Cụ thể, số Fibonacci thứ n (ký hiệu là F(n)) được tính bằng công thức sau:
//F(n) = F(n-1) + F(n-2)
//F(0) = 0 và F(1) = 1.

public class Cach2Dequy {
    static long fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibo(n-1) + fibo(n-2);
        // Đệ quy nhị phân
    }

    public static void main(String[] args) {
        int n = 12;

        if (n<0) {
            System.out.println( "Nhập số lớn hơn hoặc bằng 0");}
        else {
            System.out.println( "Số Fibonacci thứ " + n + " là " +fibo(n));
        }

    }
}

