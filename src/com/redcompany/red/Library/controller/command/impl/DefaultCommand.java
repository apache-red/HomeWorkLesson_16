package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.data.LibraryCommand;


import java.util.Map;

public class DefaultCommand implements BasicCommand {
    @Override
    public void performAction(Map<String, Object> param,  LibraryCommand libraryCommand) {
        System.out.println("Incorrect user input");
    }
}
