package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class Clear extends Command {
    public Clear() {
        name = "clear";
        help = "очищает коллекцию";
    }

    /**
     * Удаляет все элементы коллекции
     *
     * @param args       не принимает аргументы
     * @param collection коллекция, которую нужно очистить
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            collection.clear();
            System.out.println("Коллекция очищена");
        }
    }
}