package com.xc;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10 room, 1~100 2bae 10 num insert");
        int a[] = new int[5];
        int j = 2;
        /**
         * 내가 1년간 착각한 점.
         * for문에서 초기문, 조건문, 증감문이 있다면,
         * 초기문, 조건문, 블록문, 증감문, 조건문, 증감문, 조건문... 루프 순서다.
         * 조건문->증감문 순서가 아니다!
         */
        for (int i=0;i<a.length;i++){
            System.out.println("i: "+i);
            a[i] = j;
            System.out.println("a["+i+"]: "+a[i]);
            j += 2;
            System.out.println(j);
        }
        //동일한 향상된 for문. kotlin을 쓸때는 아예 이게 표준이고 위의 방식은 안되더라.
        //물론 kotlin이면 보통 Array.forEach{}를 사용함. 코드량도 줄어든다.
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("result count j: "+j);

        ArrayList d = new ArrayList<>();



    }
}
