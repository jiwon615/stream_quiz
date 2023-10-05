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
        // {"B"=1, "K"=1, "T"=1, "X"=1, "a"=2, "h"=1, "n"=1}
        assertThat(quiz.quiz1_secondTry()).isEqualTo(answer.quiz1());
    }

    @DisplayName("2.2 List에 저장된 단어들 중에서 단어의 길이가 2 이상인 경우에만, 모든 단어를 대문자로 변환하여 각 첫 글자만 스페이스로 구분한 하나의 문자열로 합한 결과를 반환하여라.")
    @Test
    void quiz2() {
        // T H A N K
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

}