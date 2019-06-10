package de.mvitz.k8s.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final String hostName;

    public Application() throws UnknownHostException {
        this.hostName = InetAddress.getLocalHost().getHostName();
    }

    @GetMapping
    public String index() {
        return "Response from instance '" + hostName + "'!";
    }
}
