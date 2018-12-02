package com.redcompany.red.Library.controller.command;

import com.redcompany.red.Library.data.LibraryCommand;

import java.util.Map;

public interface BasicCommand {

    public void performAction(Map<String, Object> param , LibraryCommand libraryCommand);



}
