package ir.myplayground.petclinic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("petclinic.secret")
public record SecretConfigurations(String publicKey, String privateKey) { }
