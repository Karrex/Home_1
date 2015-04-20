public class Month {
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

        public static void hello(Year year) {
            System.out.println("Hello, It's " + year + ", month number - " + (year.ordinal() + 1) + ". In " + year +
                    " " + year.getDay() + " day,");
        }
    }

    public static void main(String[] args) {
        Year year = Year.valueOf(args[0].substring(0, 3).toUpperCase());
        Year.hello(year);
    }
}
