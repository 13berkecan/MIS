public class app2 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%s%n%n", "N", "N^2", "N^3", "N^4");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d%-10d%-10d%d%n", 
            i, i*i, i*i*i, i*i*i*i);
        }
    }
}

/*
2-	Write a Java application that uses looping to print the following table of
values:
N   N^2 N^3 N^4
1   1   1   1
2   4   8   16
3   9   27  81
4   16  64  256
5   25  125 625
*/