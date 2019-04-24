package lemur.lemur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.h2.server.web.WebServlet;

@SpringBootApplication
public class LemurApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemurApplication.class, args);
    }

}
