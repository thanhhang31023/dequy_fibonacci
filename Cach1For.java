package dequy.fibonacci;

//Dãy Fibonacci là một dãy số bắt đầu bằng hai số 0 và 1, và các số sau đó được tính bằng cách cộng hai số trước đó.
// Cụ thể, số Fibonacci thứ n (ký hiệu là F(n)) được tính bằng công thức sau:
//F(n) = F(n-1) + F(n-2)
//F(0) = 0 và F(1) = 1.

public class Cach1For {
          public static long fibo(int n) {
            if (n == 0 || n == 1) {
                return n;  //vì Fibonacci: F(0) = 0 và F(1) = 1
            }
            int fibo = 1;  // số Fibonacci thứ 2
            int prevFibo = 1;  //số Fibonacci thứ 1
              //khai báo và khởi tạo hai biến fib và prevFib để lưu trữ hai số Fibonacci gần nhất trong quá trình tính toán.

            for (int i = 2; i < n; i++) {
                int temp = fibo;  //lưu giá trị hiện tại của fib vào biến tạm temp
                fibo = fibo + prevFibo;  //cập nhật giá trị của fib
                prevFibo = temp; //cập nhật giá trị của prevFib để tính số Fibonacci tiếp theo
            }
            return fibo; // trả về giá trị số Fibonacci thứ n
        }

        public static void main(String[] args) {
            int n = 10; //  giả sử muốn tính số Fibonacci thứ 10

            if (n<0) {
                System.out.println( "Nhập số lớn hơn hoặc bằng 0");}
                else {
                System.out.println( "Số Fibonacci thứ " + n + " là " +fibo(n));
            }
        }
    }

