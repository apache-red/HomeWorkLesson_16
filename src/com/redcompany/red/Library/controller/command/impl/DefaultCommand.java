package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;

import java.util.Map;

public class DefaultCommand implements BasicCommand {
    @Override
    public void performAction(Map<String, Object> param) {
        System.out.println("Incorrect user input");
    }
}
