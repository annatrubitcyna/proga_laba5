package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class Exit extends Command {
    public Exit() {
        name = "exit";
        help = "завершает программу (без сохранения в файл)";
    }

    /**
     * Завершает работу с коллекций, выходит без сохранения
     *
     * @param args       не принимает аргументы
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {

    }
}
