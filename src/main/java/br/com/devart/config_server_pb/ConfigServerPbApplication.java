package br.com.devart.config_server_pb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerPbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerPbApplication.class, args);
    }

}
