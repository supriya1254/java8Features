package test.child;

import test.parent.HomeService;

//@Controller
public class Ctx1Controller {

   // @Autowired
    HomeService homeService;

    //@GetMapping("/home")
    //@ResponseBody
    public String getGreeting() {

        return homeService.getGreeting();
    }
}