package com.redcompany.red.Library.controller.console;


import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.controller.console.view.SimpleConsoleView;
import com.redcompany.red.Library.data.LibraryCommand;
import com.redcompany.red.Library.data.LibraryData;
import com.redcompany.red.Library.entity.Library;

import java.util.Map;

import static com.redcompany.red.Library.controller.console.view.SimpleConsoleView.*;
import static com.redcompany.red.Library.controller.command.CommandManager.*;

public class MainConsoleController {


    public static void main(String[] args) {

        // создаю БД библиотек
        LibraryCommand libraryData = new LibraryData();

        //создаем консоль
        SimpleConsoleView consoleView = new SimpleConsoleView();
        // запускаем
        consoleView.startConsoleView();
        // получаем сформированный запрос от пользователя в виде Map
        Map<String, Object> userdata = consoleView.readUserInput();
        // Получаем запрос из Map и записываем его в userAction
        Object userAction = userdata.get("user_action");

        // парсим команду и оправляем ее в контроллер обратно получаем модифицированную
        // команду в зависимости от запроса
        BasicCommand command = defineCommand(convertString(userAction));

        // полиморфически вызывается метод
        command.performAction(userdata, libraryData);

//while (true){


        // simulate console input
        // int input = readUserInput(1);

        // deplicated   int input = readUserInput(2);


//    Map<String, Object> userdata = readUserInput();
//
//    Object userAction = userdata.get("user_action");
//
//    BasicCommand command = defineCommand(convertString(userAction));
//    command.performAction(userdata);

  //  }

}


    private static String convertString(Object obj) {
        return (String) obj;
    }


}
