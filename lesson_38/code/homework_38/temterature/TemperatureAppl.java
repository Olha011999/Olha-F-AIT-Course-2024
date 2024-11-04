package homework_38.temterature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TemperatureAppl {

    public static void main(String[] args) {

        List<Temperature> octoberT = new ArrayList<>();
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 25), 18));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 26), 16));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 27), 10));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 28), 16));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 29), 5));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 30), 3));
        octoberT.add(new Temperature(LocalDate.of(2024, 10, 31), 10));

        for (Temperature temperature : octoberT) {
            System.out.println(temperature);

        }



        List<Temperature> novemberT = new ArrayList<>();

        novemberT.add(new Temperature(LocalDate.of(2024, 11, 1), 9));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 2), 6));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 3), 3));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 4), 7));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 5), 3));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 6), 5));
        novemberT.add(new Temperature(LocalDate.of(2024, 11, 7), 1));

        for (Temperature temperature : novemberT) {
            System.out.println(temperature);

        }

        List<Temperature> allTemperatures = new ArrayList<>();
        allTemperatures.addAll(octoberT);
        allTemperatures.addAll(novemberT);

        double totalTemperature = 0;
        for (Temperature allTemperature : allTemperatures) {
            totalTemperature += allTemperature.getTemperature();
        }
        System.out.println("Total temperature: " + totalTemperature);

        double averageTemperature = totalTemperature/allTemperatures.size();
        System.out.println("Average temperature: " + averageTemperature);


        Temperature min = null;
        Temperature max = null;

        for (Temperature dayTemp : allTemperatures) {

            if (min == null || dayTemp.getTemperature()< min.getTemperature()){
                min = dayTemp;
            }
            if (max == null || dayTemp.getTemperature()> max.getTemperature()){
                max = dayTemp;
            }
        }
        if (min != null){
            System.out.println("The minimum temperature was: " + min);
        }
        if (max != null){
            System.out.println("The maximal temperature was: " + max);
        }
    }
}
