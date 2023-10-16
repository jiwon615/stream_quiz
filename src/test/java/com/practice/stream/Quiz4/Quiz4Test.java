package com.practice.stream.Quiz4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz4Test {

    private final Answer4 answer = new Answer4();
    private final Quiz4 quiz = new Quiz4();

    @DisplayName("4.1 2020년에 일어난 모든 거래 내역을 찾아 거래값을 기준으로 오름차순 정렬하라.")
    @Test
    void quiz1() {
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @DisplayName("4.2 거래 내역이 있는 거래자가 근무하는 모든 도시를 중복 없이 나열하라.")
    @Test
    void quiz2() {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @DisplayName("4.3 서울에서 근무하는 모든 거래자를 찾아서 이름순서대로 정렬하라.")
    @Test
    void quiz3() {
        assertThat(quiz.quiz3()).isEqualTo(answer.quiz3());
    }

    @DisplayName("4.4 모든 거래자의 이름을 구분자(\",\")로 구분하여 정렬하라.")
    @Test
    void quiz4() {
        // Hwan,Hyuk,Kyu,Ming
        assertThat(quiz.quiz4()).isEqualTo(answer.quiz4());
    }

    @DisplayName("4.5 부산에 거래자가 있는지를 확인하라.")
    @Test
    void quiz5() {
        assertThat(quiz.quiz5()).isEqualTo(answer.quiz5());
    }

    @Test
    void quiz6() {
        assertThat(quiz.quiz6()).isEqualTo(answer.quiz6());
    }

    @Test
    void quiz7() {
        assertThat(quiz.quiz7()).isEqualTo(answer.quiz7());
    }

}