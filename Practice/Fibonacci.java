// 问题描述
// Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

// 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

// 输入格式
// 输入包含一个整数n。
// 输出格式
// 输出一行，包含一个整数，表示Fn除以10007的余数。
// 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个
// 余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，
// 直接计算余数往往比先算出原数再取余简单。
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        
        int[] N=new int[1000001];
        N[1]=N[2]=1;
        for (int i = 3; i <1000001; i++) {
            N[i]=(N[i-1]+N[i-2])%10007;
        }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int mod;
        mod=N[n];
        System.out.println(mod);


    }
}