package com.example.myapplication.domain;

public class WelcomeMessage {
    public String createWelcomeMessage(int id) {
        return String.format("Hello world from section: %d.", id);
    }
}
