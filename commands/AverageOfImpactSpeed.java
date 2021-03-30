package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class AverageOfImpactSpeed extends Command {
    public AverageOfImpactSpeed() {
        name = "average of impact speed";
        help = "вывести среднее значение поля impactSpeed для всех элементов коллекции";
    }

    /**
     * Выводит среднее значение поля impactSpeed для всех элементов коллекции
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            float sum = 0.0f;
            for (int i = 0; i < collection.size(); i++) {
                sum += collection.get(i).impactSpeed;
            }
            System.out.println("среднее значение поля impactSpeed для всех элементов коллекции: " + sum / (collection.size()));
        }
    }
}
