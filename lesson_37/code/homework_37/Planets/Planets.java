package homework_37.Planets;

import java.util.Objects;

public class Planets {

    private String name;
    private double distanceToSun;// mln km
    private double weight;// 10 ^ 24 kg
    private int numberOfSatellites;

    public Planets(String name, double distanceToSun, double weight, int numberOfSatellites) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.weight = weight;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planet)) return false;
        return Double.compare(distanceToSun, planet.distanceToSun) == 0 && Double.compare(weight, planet.weight) == 0 && numberOfSatellites == planet.numberOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToSun, weight, numberOfSatellites);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToSun=").append(distanceToSun);
        sb.append(", weight=").append(weight);
        sb.append(", numberOfSatellites=").append(numberOfSatellites);
        sb.append('}');
        return sb.toString();
    }
}
