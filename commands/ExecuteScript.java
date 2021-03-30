package commands;

import collectionClass.HumanBeing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class ExecuteScript extends Command {
    //HashSet<String> scriptsNames = new HashSet<>();

    public ExecuteScript() {
        name = "execute_script";
        help = "Запускает исполняемый скрипт";
    }

    /**
     * Исполняет указанный скрипт
     *
     * @param args       название скрипта
     * @param collection коллекция, которую нужно очистить
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) throws IOException, NullPointerException {
        if (args.equals("")) {
            System.out.println("Введите, пожалуйста, имя файла");
        } else {
            Path path = Paths.get(args);
            try (FileWriter file = new FileWriter("C:\\Users\\777\\IdeaProjects\\lab5\\script.txt", false);) {
                file.write("");
                file.flush();
            } catch (IOException ex) {
                System.out.println("Коллекция не может быть записана в файл.");
            }
            Scanner input = new Scanner(Paths.get("C:\\Users\\777\\IdeaProjects\\lab5\\script.txt"));
            try {
                input = new Scanner(path);
            } catch (IOException e) {
                System.out.println("Такого файла нет");
            }
            String line = "";
            String commanda = "";
            String arg = "";
            //collection.add(human);
//        System.out.println(collection);
//        for(HumanBeing humanBeing:collection){
//            humanBeing.display(humanBeing);
//        }
            while (!commanda.equals("exit") & input.hasNext()) {
                System.out.println("файл начал исполнение");
                line = input.nextLine();
                commanda = line.split(" ")[0];
                if (line.split(" ").length != 1) {
                    arg = line.split(" ")[1];
                } else {
                    arg = "";
                }
                switch (commanda) {
                    case ("help"):
                        Help help = new Help();
                        help.work(arg, collection);
                        break;
                    case ("head"):
                        Head head = new Head();
                        head.work(arg, collection);
                        break;
                    case ("info"):
                        Info info = new Info();
                        try {
                            info.work(arg, collection);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case ("add"):
                        Add add = new Add();
                        add.work(line + " " + (int) (Math.random() * 1000), collection);
                        break;
                    case ("averageOfImpactSpeed"):
                        AverageOfImpactSpeed averageOfImpactSpeed = new AverageOfImpactSpeed();
                        averageOfImpactSpeed.work(arg, collection);
                        break;
                    case ("clear"):
                        Clear clear = new Clear();
                        clear.work(arg, collection);
                        break;
                    case ("excuteScript"):
//                        ExecuteScript executeScript = new ExecuteScript();
//                        executeScript.work(arg, collection);
                        System.out.println("Вызванная рекурсия не осуществлается, вызывать скрипт из скрипта запрещено");
                        break;
                    case ("filterContainsName"):
                        FilterContainsName filterContainsName = new FilterContainsName();
                        filterContainsName.work(arg, collection);
                        break;
                    case ("printUniqueSoundtrackName"):
                        PrintUniqueSoundtrackName printUniqueSoundtrackName = new PrintUniqueSoundtrackName();
                        printUniqueSoundtrackName.work(arg, collection);
                        break;
                    case ("removeById"):
                        RemoveById removeById = new RemoveById();
                        removeById.work(arg, collection);
                        break;
                    case ("removeFirst"):
                        RemoveFirst removeFirst = new RemoveFirst();
                        removeFirst.work(arg, collection);
                        break;
                    case ("removeHead"):
                        RemoveHead removeHead = new RemoveHead();
                        removeHead.work(arg, collection);
                        break;
                    case ("save"):
                        Save save = new Save();
                        save.work(arg, collection);
                        break;
                    case ("show"):
                        Show show = new Show();
                        show.work(arg, collection);
                        break;
                    case ("updateId"):
                        UpdateId updateId = new UpdateId();
                        updateId.work(line, collection);
                        break;
                }
            }
            System.out.println("Указанный скрипт исполнен");
            //executeScript C:\Users\777\IdeaProjects\lab5\script
        }
    }
//    @Override
//    public void execute(String[] args, PriorityQueue<SpaceMarine> priorityQueue, CommandsManager commandsManager) {
//        if (args.length != 1) System.out.println("Команда принимает лишь один аргумент");
//        else {
//            commandsManager.setScript(true);
//            try {
//                String sfn = args[0];
//                commandsManager.setScriptFileName(sfn);
//                commandsManager.setScriptBufferedReader(new BufferedReader(new FileReader(commandsManager.getScriptFileName())));
//                String line = "";
//                while (true) {
//                    line = commandsManager.getScriptBufferedReader().readLine();
//                    String[] nargs = line.split(" ");
//                    if (nargs[0].equals("execute_script")) {
//                        if (!scriptsNames.contains(nargs[1])) {
//                            scriptsNames.add(sfn);
//                            CommandsManager.ExecuteCommand(nargs, priorityQueue);
//                        } else {
//                            System.out.println("Вы не можете выполнить команду в исполняемом скрипте, которая вызывает исполняемый скрипт, содержащий команду вызова другого исполняемого скрипта, который уже исполнялся ранее");
//                            System.out.println("Не удалось выполнить: execute_script " + sfn + ". Запущенные скрипты: " + scriptsNames);
//                        }
//                    }
//                    scriptsNames.add(sfn);
//                }
//            } catch (NullPointerException ignored) {
//            } catch (FileNotFoundException e) {
//                System.out.println("Файл не найден");
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        commandsManager.setScript(false);
//        scriptsNames.clear();
//    }
}