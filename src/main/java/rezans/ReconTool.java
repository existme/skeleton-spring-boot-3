package rezans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReconTool implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("here");
        System.out.println(Arrays.toString(args));
    }

}
