package com.practice.stream.Quiz3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz3Test {

    private final Answer3 answer = new Answer3();
    private final Quiz3 quiz = new Quiz3();

    @DisplayName("3.1 모든 숫자 쌍의 배열 리스트를 반환하여라.")
    @Test
    void quiz1() {
        assertThat(isEquals(quiz.quiz1(), answer.quiz1())).isTrue();
    }

    @Test
    void quiz2() {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    private boolean isEquals(List<Integer[]> quiz, List<Integer[]> answer) {
        if (quiz.size() != answer.size()) {
            return false;
        }

        for (int i = 0; i < answer.size(); i++) {
            if (!Arrays.deepEquals(quiz.get(i), answer.get(i))) {
                return false;
            }
        }
        return true;
    }

}