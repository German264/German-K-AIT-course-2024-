package homework_33.Days;

public enum Days {

    SUNDAY("Sunday", 1, "non-working day"), MONDAY("Monday", 2, "working day"), TUESDAY("Tuesday", 3, "working day"), WEDNESDAY("Wednesday", 4, "working day"), THURSDAY("Thursday", 5,"working day"), FRIDAY("Friday", 6, "working day"), SATURDAY("Saturday", 7, "non-working day");

    // fields
    private String name;
    private int number;
    private String type;

    Days(String name, int number, String type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Days{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Days plusDays(int quantity){
        int n = this.ordinal();
        int index = n + quantity;
        Days[] days = Days.values();
        int res = index % days.length;
        return days[res];
    }
}
