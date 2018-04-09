package com.rfeoi.scrapt.script.fileInterpreter;

import com.rfeoi.scrapt.script.interpreter.Command;
import com.rfeoi.scrapt.script.interpreter.Executor;
import com.rfeoi.scrapt.script.interpreter.Interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInterpreter extends Interpreter {
    public FileInterpreter(Executor executor) {
        super(executor);
    }

    public void readFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            commands.put(line, new Command(line, executor));
        }
        reader.close();
    }

    public void execute(String executedSpirit){
        for (Command command : commands.values()){
            command.executeCommand(executedSpirit);
        }
    }

}
