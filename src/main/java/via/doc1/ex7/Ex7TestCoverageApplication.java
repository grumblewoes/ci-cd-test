package via.doc1.ex7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex7TestCoverageApplication {

    @RequestMapping("/")
    public String index() {
        return "<body><h1>DevOps and Cloud</h1> " +
                "<h2>Dockerizing Spring Boot Backend Application (exercise 7).</h2>" +
                "<p>With Docker, we can containerize SEP4 back-end and front-end applications.</p></body>";
    }
    public static void main(String[] args) {
        SpringApplication.run(Ex7TestCoverageApplication.class, args);
    }

}
