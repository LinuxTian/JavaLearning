public class ObjectTest1 {
    public static void main(String[] args) {
        myDate date = new myDate();
        System.out.println(date.getYear() + "." + date.getMonth() + "." + date.getDay());
    }
}
class myDate{
    private int year;
    private int month;
    private int day;

    //constructor
    myDate(){
        this(1970,1,1);
    }
    //constructor
    myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}