enum Year {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
    OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    private int day;

    Year(int d) {
        day = d;
    }

    public int getDay() {
        return day;
    }
}

public class Month {
    public static void main(String[] args) {
        Year year = Year.APRIL;
        switch (year) {
            case JANUARY:
                System.out.println("It's January. In January " + year.getDay() + " day");
                break;
            case FEBRUARY:
                System.out.println("It's February. In February " + year.getDay() + " day");
                break;
            case MARCH:
                System.out.println("It's March. In March " + year.getDay() + " day");
                break;
            case APRIL:
                System.out.println("It's April. In April " + year.getDay() + " day");
                break;
            case MAY:
                System.out.println("It's May. In May " + year.getDay() + " day");
                break;
            case JUNE:
                System.out.println("It's June. In June " + year.getDay() + " day");
                break;
            case JULY:
                System.out.println("It's July. In July " + year.getDay() + " day");
                break;
            case AUGUST:
                System.out.println("It's August. In August " + year.getDay() + " day");
                break;
            case SEPTEMBER:
                System.out.println("It's September. In September " + year.getDay() + " day");
                break;
            case OCTOBER:
                System.out.println("It's October. In October " + year.getDay() + " day");
                break;
            case NOVEMBER:
                System.out.println("It's November. In November " + year.getDay() + " day");
                break;
            case DECEMBER:
                System.out.println("It's December. In December " + year.getDay() + " day");
                break;
            default:
                System.out.println("Month not found");
                break;
        }
    }
}
