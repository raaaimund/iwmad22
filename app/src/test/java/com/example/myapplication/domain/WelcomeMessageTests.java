package com.example.myapplication.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WelcomeMessageTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void createWelcomeMessage_creates_correct_message(int messageId) {
        final WelcomeMessage welcomeMessage = new WelcomeMessage();
        final String expectedWelcomeMessage = String.format("Hello world from section: %d.", messageId);

        String actualMessage = welcomeMessage.createWelcomeMessage(messageId);

        assertEquals(expectedWelcomeMessage, actualMessage);
    }
}
