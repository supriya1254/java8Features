package test.child;

import test.parent.IHomeService;

//@Configuration
//@ComponentScan("com.baeldung.ctx1")
//@EnableAutoConfiguration
public class Ctx1Config {

  //  @Bean
    public IHomeService homeService() {
        //return new GreetingService();
        return new GreetingService();
    }
}