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
        /**
         * [{Trader:Hwan in Busan, year: 2020, value: 4900},
         *     {Trader:Ming in Gyeonggi, year: 2020, value: 7100},
         *     {Trader:Kyu in Seoul, year: 2020, value: 12000},
         *     {Trader:Ming in Gyeonggi, year: 2020, value: 40000}]
         */
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @DisplayName("4.2 거래 내역이 있는 거래자가 근무하는 모든 도시를 중복 없이 나열하라.")
    @Test
    void quiz2() {
        // ["Seoul", "Gyeonggi", "Busan"]
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @DisplayName("4.3 서울에서 근무하는 모든 거래자를 찾아서 이름순서대로 정렬하라.")
    @Test
    void quiz3() {
        // [Trader:Hyuk in Seoul, Trader:Kyu in Seoul]
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
        // true
        assertThat(quiz.quiz5()).isEqualTo(answer.quiz5());
    }

    @DisplayName("4.6 서울에 거주하는 거래자의 모든 거래 금액을 구하라.")
    @Test
    void quiz6() {
        // [30000, 12000, 5900]
        assertThat(quiz.quiz6()).isEqualTo(answer.quiz6());
    }

    @DisplayName("4.7 모든 거래 내역중에서 거래 금액의 최댓값과 최솟값을 구하라. 단, 최댓값은 reduce를 이용하고 최솟값은 stream의 min()을 이용하라.")
    @Test
    void quiz7() {
        // [40000, 4900]
        assertThat(quiz.quiz7()).isEqualTo(answer.quiz7());
    }

}