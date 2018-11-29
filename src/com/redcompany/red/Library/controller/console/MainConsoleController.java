package com.redcompany.red.Library.controller.console;


import com.redcompany.red.Library.controller.command.BasicCommand;

import java.util.Map;

import static com.redcompany.red.Library.controller.console.view.SimpleConsoleView.*;
import static com.redcompany.red.Library.controller.command.CommandManager.*;

public class MainConsoleController {


    public static void main(String[] args) {



        showBasicMenu();


        // simulate console input
       // int input = readUserInput(1);

     // deplicated   int input = readUserInput(2);

        Map<String, Object> userdata = readUserInput();

        Object userAction = userdata.get("user_action");

        BasicCommand command = defineCommand(convertString(userAction));
        command.performAction(userdata);


    }


    private static String convertString(Object obj){
    return (String)obj;
    }


}
