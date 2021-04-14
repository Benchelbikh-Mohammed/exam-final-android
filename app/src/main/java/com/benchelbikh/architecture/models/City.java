package com.benchelbikh.architecture.models;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class City {

    String name;
    List<Range> rangesArray;

    Map<Range , Double> map;

    public City(String name) {
        this.name = name;
        rangesArray = new ArrayList<Range>();
        Range firstRange = new Range(0,6);
        Range secondRange = new Range(6,12);
        Range thirdRange = new Range(12,20);
        Range forthRange = new Range(20,Integer.MAX_VALUE);

        rangesArray.add(firstRange);
        rangesArray.add(secondRange);
        rangesArray.add(thirdRange);
        rangesArray.add(forthRange);

        map = new HashMap<>();

        if (this.name.equals("Rabat")) {
            map.put(firstRange, 2.0);
            map.put(secondRange , 4.0);
            map.put(thirdRange , 8.0);
            map.put(forthRange, 15.0);
        } else if (this.name.equals("Casa")) {
            map.put(firstRange, 2.5);
            map.put(secondRange , 4.5);
            map.put(thirdRange , 9.0);
            map.put(forthRange, 15.0);
        } else if (this.name.equals("Fes")) {
            map.put(firstRange, 3.0);
            map.put(secondRange , 4.5);
            map.put(thirdRange , 8.0);
            map.put(forthRange, 15.0);
        } else {
            map.put(firstRange, 1.0);
            map.put(secondRange , 3.0);
            map.put(thirdRange , 8.0);
            map.put(forthRange, 15.0);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public class Tarif {
        double value = 1;

        int rangeIndex ;

        public Tarif(int volume) {
            for (int i = 0; i < rangesArray.size() ; i++) {
                if (rangesArray.get(i).contains(volume)) {
                    rangeIndex = i;
                    break;
                }
            }

            while (rangeIndex > -1) {
                map.get(rangesArray.get(rangeIndex));
            }




        }


    }


}
