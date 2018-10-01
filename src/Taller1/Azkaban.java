package Taller1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;


public class Azkaban {

    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long[] A = new Long[n];
        for (int i = 0; i < n; i++){
            A[i] = in.nextLong();
        }

        Stack<Integer> stack = new Stack<>();

        int[] ng = new int[n];

        for (int i = 0; i < n; i++){
            if (i == 0){
                stack.push(i);
            }
            else{
                int temp = stack.pop();
                while (A[temp] < A[i]){
                    ng[temp] = i+1;
                    if (stack.isEmpty()){
                        break;
                    }
                    temp = stack.pop();
                }
                if (A[temp] > A[i]){
                    stack.push(temp);
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()){
            ng[stack.pop()] = -1;
        }


        for (int i = n-1; i >= 0; i--){
            if (i == n-1){
                stack.push(i);
            }
            else{
                int temp = stack.pop();
                while (A[temp] < A[i]){
                    ng[temp] += i+1;
                    if (stack.isEmpty()){
                        break;
                    }
                    temp = stack.pop();
                }
                if (A[temp] > A[i]){
                    stack.push(temp);
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()){
            int temp = stack.pop();
            ng[temp] += -1;
        }

        for (int i = 0; i < n; i++){
            bw.write(ng[i] + " ");
            bw.flush();
        }

    }
}