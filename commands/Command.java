package commands;

import collectionClass.HumanBeing;

import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;

public abstract class Command {
    public String name;
    public String help;

    /**
     * Метод выполнения команды
     *
     * @param args       аргументы, принимаемые командой
     * @param collection коллекция, с которой работает пользователь
     */
    public abstract void work(String args, LinkedList<HumanBeing> collection) throws IOException;

    /**
     * @return имя команды
     */
    public String getName() {
        return name;
    }

    /**
     * @return описание работы команды
     */
    public String getHelp() {
        return help;
    }

}
