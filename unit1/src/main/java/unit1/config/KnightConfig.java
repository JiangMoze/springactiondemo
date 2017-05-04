package unit1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import unit1.BraveKnight;
import unit1.Knight;
import unit1.Quest;
import unit1.SlayDragonQuest;


@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
