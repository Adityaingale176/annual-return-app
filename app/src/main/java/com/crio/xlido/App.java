/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.xlido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Test your code by ading commands in sample_input/sample_input_one.txt
        // Run run.sh script using "bash run.sh" in your terminal.
        if (args.length == 1){
            List<String> commandLineArgs = new LinkedList<>(Arrays.asList(args));
            String inputFile = commandLineArgs.get(0).split("=")[1];
            try {
                List<String> file_commands = Files.readAllLines(Paths.get(inputFile));
                // Execute the commands
                new App().run(file_commands);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }        

        // OR
        // Test your code by adding commands in this list
        List<String> inplace_commands = new LinkedList<>(){
            {
            }
        };

        new App().run(inplace_commands);
 
    }
    public void run(List<String> commands){

        Iterator<String> it = commands.iterator();
        while(it.hasNext()){
            String line = it.next();
                if(line == null){
                    break;
                }
                List<String> tokens = Arrays.asList(line.split(","));

                try {
                    //Execute Services
                    switch(tokens.get(0)){
                        case "CREATE_USER":
                        break;
                        case "CREATE_EVENT":
                        break;
                        case "DELETE_EVENT":
                        break;
                        case "ADD_QUESTION":
                        break;
                        case "DELETE_QUESTION":
                        break;
                        case "UPVOTE_QUESTION":
                        break;
                        case "REPLY_QUESTION":
                        break;
                        case "LIST_QUESTIONS":
                        break;
                        default:
                            throw new RuntimeException("INVALID_COMMAND");
                }
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
        }
    }
}