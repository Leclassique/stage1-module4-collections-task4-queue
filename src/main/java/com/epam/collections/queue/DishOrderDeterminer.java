package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++){
            queue.add(i);
        }
        int counter = 0;
        while (!queue.isEmpty()){
            Iterator<Integer> it = queue.iterator();
            while (it.hasNext()){
                Integer integer = it.next();
                counter++;
                if (counter % everyDishNumberToEat == 0){
                    result.add(integer);
                    it.remove();
                }
            }
        }

        return result;
    }
}