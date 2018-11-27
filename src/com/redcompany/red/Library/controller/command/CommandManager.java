package com.redcompany.red.Library.controller.command;

import com.redcompany.red.Library.controller.command.impl.DefaultCommand;
import com.redcompany.red.Library.controller.command.impl.ViewBookCatalogCommand;
import com.redcompany.red.Library.controller.command.impl.ViewSingleCatalogRowCommand;

public class CommandManager {

    private static BasicCommand command = new DefaultCommand();

    public static BasicCommand defineCommand(String action){
        switch (action){
            case "view_catalog":
                command = new ViewBookCatalogCommand();
                break;
            case "single_row":
                command = new ViewSingleCatalogRowCommand();
                break;
            case "find_book":
                //command = new ViewBookCatalogCommand();
                break;
        }
        return command;
    }
}
