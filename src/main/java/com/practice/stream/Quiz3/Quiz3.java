package com.practice.stream.Quiz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz3 {

    private static final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    private static final List<Integer> numbers2 = Arrays.asList(3, 4);

    // 3.1 모든 숫자 쌍의 배열 리스트를 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]
    public List<Integer[]> quiz1() {
        // 방법1. 이중 포문 사용
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                list.add(new Integer[]{numbers1.get(i), numbers2.get(j)});
            }
        }

        // 방법2. Stream API 사용
        return numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new Integer[]{i, j})
                )
                .collect(Collectors.toList());
    }

    // 3.2 모든 숫자 쌍의 곱이 가장 큰 값을 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> 12
    public int quiz2() {
        // 방법1. 이중 포문 사용
        int maxSum = 0;
        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                maxSum = Math.max(numbers1.get(i) * numbers2.get(j), maxSum);
            }
        }

        // 방법2. Stream API 사용
        int ex1 = numbers1.stream()
                .flatMap(
                        i -> numbers2.stream().map(j -> new Integer[]{i, j})
                ).mapToInt(n -> n[0] * n[1])
                .max()
                .orElse(0);


        // 방법3. Stream API 더 간단하게 flatMapToInt로 간략화
        return numbers1.stream()
                .flatMapToInt(i -> numbers2.stream().mapToInt(j -> i * j))
                .max()
                .orElse(0);
    }

}
