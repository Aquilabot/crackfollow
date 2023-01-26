package com.crackfollow.crackfollow.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Paths;

@Configuration
public class CassandraConfig {
    @Value("${cassandra.secure-connect-path}")
    private String secureConnectPath;
    @Value("${cassandra.client-id}")
    private String clientId;
    @Value("${cassandra.client-secret}")
    private String clientSecret;
    @Value("${cassandra.token}")
    private String token;

    @Bean
    public CqlSession cqlSession() {
        return CqlSession.builder()
                .withCloudSecureConnectBundle(Paths.get(secureConnectPath))
                .withAuthCredentials(clientId, clientSecret)
                .build();
    }
}
