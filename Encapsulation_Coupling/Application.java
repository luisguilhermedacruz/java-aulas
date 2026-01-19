package Encapsulation_Coupling;

import java.util.logging.Logger;

public class Application {
    private String appName;
    private LoggerService loggerService;

    Application(String appName, LoggerService loggerService){
        this.appName = appName;
        this.loggerService = loggerService;
    }

    public void run(){
        loggerService.log();
    }

    public static void main(String[] args) {
        LoggerService loggerService = new LoggerService("TEST MESSAGE! TEST MESSAGE!");
        Application app1 = new Application("TESTE APP!", loggerService);

        app1.run();
    }
}
