enum Year {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30),
    OCT(31), NOV(30), DEC(31);
    private int day;

    Year(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}

public class Month {
    public static void main(String[] args) {
        Year year = Year.valueOf(args[0].substring(0, 3).toUpperCase());
        switch (year) {
            case JAN:
                System.out.println("It's January. In January " + year.getDay() + " day");
                break;
            case FEB:
                System.out.println("It's February. In February " + year.getDay() + " day");
                break;
            case MAR:
                System.out.println("It's March. In March " + year.getDay() + " day");
                break;
            case APR:
                System.out.println("It's April. In April " + year.getDay() + " day");
                break;
            case MAY:
                System.out.println("It's May. In May " + year.getDay() + " day");
                break;
            case JUN:
                System.out.println("It's June. In June " + year.getDay() + " day");
                break;
            case JUL:
                System.out.println("It's July. In July " + year.getDay() + " day");
                break;
            case AUG:
                System.out.println("It's August. In August " + year.getDay() + " day");
                break;
            case SEP:
                System.out.println("It's September. In September " + year.getDay() + " day");
                break;
            case OCT:
                System.out.println("It's October. In October " + year.getDay() + " day");
                break;
            case NOV:
                System.out.println("It's November. In November " + year.getDay() + " day");
                break;
            case DEC:
                System.out.println("It's December. In December " + year.getDay() + " day");
                break;
            default:
                System.out.println("Month not found");
                break;
        }
    }
}
