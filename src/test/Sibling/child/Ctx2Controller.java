package test.Sibling.child;

import test.parent.HomeService;
import test.parent.IHomeService;

//@Controller
public class Ctx2Controller {

   // @Autowired
    IHomeService iHomeService;

    //@GetMapping("/home")
    //@ResponseBody
    public String getGreeting() {

        return iHomeService.getGreeting();
    }
}