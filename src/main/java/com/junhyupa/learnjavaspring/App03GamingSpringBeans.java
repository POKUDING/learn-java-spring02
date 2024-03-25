package com.junhyupa.learnjavaspring;

import com.junhyupa.learnjavaspring.game.GameRunner;
import com.junhyupa.learnjavaspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.junhyupa.learnjavaspring.game")
public class GamingAppLauncherApplication {

     public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                    (GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
