public class lab2 {
    public static int getSn1(int n) {
        if(n==1) {
            return 1;
        }else{
            int sum = getSn1(n-1);
            return sum + ((n%2==0 )? -n : n);
        }
    }
    public static int getSn2(int n ) {
        if(n==1 ) {
            return 1;
        }else {
            int temp = 1;
            int sum = getSn2(n-1);
            for (int i = 1; i <=n; i++) {
                temp *=i;
            }
            return sum+temp;
        }
    }
    public static int getSn3(int n ){
        if (n==1 ) {
            return 1;
        }else {
            int sum = getSn3(n-1);
            int temp = n*n;
            return sum + temp;
        }
    }
    public static double getSn4(double n ) {
        if (n==0) {
            return 1;
        }else{
            double temp = 1;
            double sum = getSn4(n-1);
            for (int i = 2; i <=n*2; i+=2) {
                temp *=i;
            }	return sum+ 1/ temp;
        }
    }
    public static double getSn1_1(double n ) {
        if(n==1) {
            return 1;
        }else {
            double sum = getSn1_1(n-1);
            return sum + Math.pow(-1, n+1)*n;
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-2)+ fibonacci(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getSn1(n));
        System.out.println(getSn2(n));
        System.out.println(getSn3(n));
        System.out.println(getSn1_1(n));
        System.out.println(getSn4(n));
        System.out.println(fibonacci(3));

    }
}

