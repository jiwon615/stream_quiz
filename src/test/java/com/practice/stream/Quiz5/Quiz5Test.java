package com.practice.stream.Quiz5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz5Test {

    private final Answer5 answer = new Answer5();
    private final Quiz5 quiz = new Quiz5();

    @DisplayName("5.1 모든 문자열의 길이를 더한 결과를 출력하여라.")
    @Test
    void quiz1() {
        // 10
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @DisplayName(" 5.2 문자열 중에서 가장 긴 것의 길이를 출력하시오.")
    @Test
    void quiz2() {
        // 4
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @DisplayName("5.3 임의의 로또번호(1~45)를 정렬해서 출력하시오.")
    @Test
    void quiz3() {
        assertThat(isCorrect(quiz.quiz3())).isTrue();
    }

    private boolean isCorrect(List<Integer> quiz) {
        List<Integer> answer = new ArrayList<>(quiz);
        Collections.sort(answer);
        return quiz.stream().distinct().count() == 6 && answer.equals(quiz);
    }

    @Test
    void quiz4() {
        assertThat(isEquals(quiz.quiz4(), answer.quiz4())).isTrue();
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