package com.practice.stream.Quiz6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz6Test {

    private final Answer6 answer = new Answer6();
    private final Quiz6 quiz = new Quiz6();

    @DisplayName("6.1 stuArr에서 불합격(150점 미만)한 학생의 수를 남자(true)와 여자(false)로 구별하여라. (Boolean, List)")
    @Test
    void quiz1() {
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @Test
    void quiz2() {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

}