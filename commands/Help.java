package commands;

import collectionClass.HumanBeing;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;

public class Help extends Command {
    public Help() {
        name = "help";
        help = "выводит справку по доступным командам";
    }

    public static HashSet<Command> commands = new HashSet<>();

    /**
     * Выводит справку по командам
     *
     * @param args       не принимает аргументов
     * @param collection коллекция, с которой работает пользователь
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) throws IOException {
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            commands.add(new Add());
            commands.add(new AverageOfImpactSpeed());
            commands.add(new Clear());
            commands.add(new ExecuteScript());
            commands.add(new Exit());
            commands.add(new FilterContainsName());
            commands.add(new Head());
            commands.add(new Help());
            commands.add(new Info());
            commands.add(new PrintUniqueSoundtrackName());
            commands.add(new RemoveById());
            commands.add(new RemoveFirst());
            commands.add(new RemoveHead());
            commands.add(new Save());
            commands.add(new Show());
            commands.add(new UpdateId());
            for (Command command : commands) {
                System.out.println("Команда " + command.getName() + ": " + command.getHelp());
            }
        }
    }
}
