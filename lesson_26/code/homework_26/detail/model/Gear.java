package homework_26.detail.model;

import java.util.Objects;

public class Gear extends Detail{

    private double radius;
    private int tooth;

    public Gear(int barCode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gear gear)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(radius, gear.radius) == 0 && tooth == gear.tooth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, tooth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gear{");
        sb.append("radius=").append(radius);
        sb.append(", tooth=").append(tooth);
        sb.append(", barCode=").append(barCode);
        sb.append(", size=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
