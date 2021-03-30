package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class UpdateId extends Command {
    public UpdateId() {
        name = "update id";
        help = " обновить значение элемента коллекции, id которого равен заданному";
    }

    /**
     * Обновляет значение элемента коллекции, id которого равен заданному
     *
     * @param args       id элемента
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        System.out.println("Элемент обновлен");
        if (!args.equals("")) {
            System.out.println("Введите дополнительные аргументы");
        } else {
            RemoveById removeById = new RemoveById();
            removeById.work(args.split(" ")[args.split(" ").length - 1], collection);
            Add add = new Add();
            add.work(args, collection);
        }
    }
    //updateId Ann 10 35 True True 90.0 Name1 BAT CALM True 4
}
