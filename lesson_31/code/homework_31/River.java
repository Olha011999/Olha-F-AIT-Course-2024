package homework_31;

import java.util.Objects;

public class River implements Comparable<River>{

    private String name;
    private double length;
    private double depth;

    public River(String name, double length, double depth) {
        this.name = name;
        this.length = length;
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof River river)) return false;
        return Double.compare(length, river.length) == 0 && Double.compare(depth, river.depth) == 0 && Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, depth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("River{");
        sb.append("name='").append(name).append('\'');
        sb.append(", length=").append(length);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(River o) {
        return this.getName().compareTo(o.getName());
    }
}
