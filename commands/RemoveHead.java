package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class RemoveHead extends Command {
    public RemoveHead() {
        name = "remove head";
        help = "вывести первый элемент коллекции и удалить его";
    }

    /**
     * Выводит и удаляет первый элемент из коллекции
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) throws IndexOutOfBoundsException{
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            try {
            Head head = new Head();
            head.work("", collection);
            RemoveFirst removeFirst = new RemoveFirst();
            removeFirst.work("", collection);
            }
            catch(IndexOutOfBoundsException i){
                System.out.println("В коллекции нет элементов");
            }
        }
    }
}
