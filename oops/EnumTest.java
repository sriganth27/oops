package oops;
public class EnumTest {
    Day day;
    public EnumTest (Day day){
        this.day = day;
    }
    public void test(){
    switch (day){
        case MONDAY:
            System.out.println("moday is good");
            break;
        case TUESDAY:
            System.out.println("tuesday is very goood");
            break;
        default :
            System.out.println("all day ok");
    }
}
    public static void main(String[] args) {
        EnumTest firstday = new EnumTest(Day.MONDAY);
        firstday.test();
        EnumTest secondday = new EnumTest(Day.TUESDAY);
        secondday.test();
        Day.SATURDAY.days();
        Day.WEDNESDAY.days();
        Day.SUNDAY.days();
  }
}
