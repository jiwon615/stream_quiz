package com.practice.stream.Quiz2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz2Test {

    private final Answer2 answer = new Answer2();
    private final Quiz2 quiz = new Quiz2();

    @DisplayName("2.1 List에 저장된 단어들의 접두사가 각각 몇개씩 있는지 Map<String, Integer>으로 변환하여라.")
    @Test
    void quiz1() {
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @Test
    void quiz2() {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

}