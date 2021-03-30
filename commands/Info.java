package commands;

import collectionClass.HumanBeing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;

public class Info extends Command {
    public Info() {
        name = "info";
        help = "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }

    /**
     * Выводит в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)"
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) throws IOException {
        if (!args.equals("")) System.out.println("Команда не принимает аргументы");
        else {
            System.out.println("Тип коллекции: " + collection.getClass().getName());
            String fileName = "C:\\Users\\777\\IdeaProjects\\lab5\\src\\data.json";
            Path file = Paths.get(fileName);
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("Время создания коллекции: " + attr.creationTime());
            System.out.println("Количество элементов в коллеции: " + collection.size());
        }

    }
}
