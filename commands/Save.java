package commands;

import collectionClass.HumanBeing;

import java.io.*;
import java.util.LinkedList;
//import com.google.code.gson.*;

public class Save extends Command {
    public Save() throws IOException {
        name = "save";
        help = "сохранить  коллекцию в файл";
    }

    private LinkedList<HumanBeing> citizens;
//    private Gson serializer;

    /**
     * Сохраняет коллекцию в файл
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        String collectionTxt="";
        if (!args.equals("")) {
            for (int i = 0; i < collection.size(); i++) {
                HumanBeing first = collection.get(i);
                collectionTxt+="id:" + first.id + ", " + "name:" + first.name + ", " + "coordinate x:" + first.coordinates.x + ", " + "coordinate y:" + first.coordinates.y + ", " + "creation date:" + first.creationDate + ", " + "real hero:" + first.realHero + ", " + "has tooth pick:" + first.hasToothpick + ", " + "impackt speed:" + first.impactSpeed + ", " + "soundtrack name:" + first.soundtrackName + ", " + "weapon type:" + first.weaponType + ", " + "mood:" + first.mood + ", " + "car cool:" + first.car.cool;
            }
            try (FileWriter file = new FileWriter(args, false);) {
                file.write(collectionTxt);
                file.flush();
            } catch (IOException ex) {
                System.out.println("Коллекция не может быть записана в файл.");
            }
        } else {
            for (int i = 0; i < collection.size(); i++) {
                HumanBeing first = collection.get(i);
                collectionTxt+="id:" + first.id + ", " + "name:" + first.name + ", " + "coordinate x:" + first.coordinates.x + ", " + "coordinate y:" + first.coordinates.y + ", " + "creation date:" + first.creationDate + ", " + "real hero:" + first.realHero + ", " + "has tooth pick:" + first.hasToothpick + ", " + "impackt speed:" + first.impactSpeed + ", " + "soundtrack name:" + first.soundtrackName + ", " + "weapon type:" + first.weaponType + ", " + "mood:" + first.mood + ", " + "car cool:" + first.car.cool;
            }
            try (FileWriter file = new FileWriter("C:\\Users\\777\\IdeaProjects\\lab5\\src\\data.txt", false);) {
                file.write(collectionTxt);
                file.flush();
            } catch (IOException ex) {
                System.out.println("Коллекция не может быть записана в файл.");
            }
            //save C:\Users\777\IdeaProjects\lab5\src\data.txt
//        try (BufferedWriter outputStreamWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(jsonCollection)))) {
//            outputStreamWriter.write(serializer.toJson(collection));
//        } catch (Exception ex) {
//            System.out.println("Коллекция не может быть записана в файл.");
//        }
        }
    }
}
