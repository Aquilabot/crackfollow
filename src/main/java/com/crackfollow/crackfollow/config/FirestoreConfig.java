package com.crackfollow.crackfollow.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class FirestoreConfig {
    @Bean
    public void init() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("src/main/resources/key.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);
    }
}
