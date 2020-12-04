package test.child;

import test.parent.IHomeService;
//@Service
public class GreetingService implements IHomeService {
    @Override
    public String getGreeting() {
        return "Greeting for the day!";
    }
}
