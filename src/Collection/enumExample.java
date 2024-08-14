package Collection;

public class enumExample {
    enum Week {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constant
        //everyone is public ,static and final
        //child enums cannot be created as they are final
        //type is week


        Week() {
            System.out.println("Construction called for " + this);

            //this is not public or protected , only private or default
            //why ? we don't want to create new objects
        }
    }

    public static void main(String[] args) {
        Week week;
        week= Week.Friday;
        System.out.println(week);//Friday
        System.out.println(week.ordinal());//4

        for(Week day : Week.values()){
            System.out.println(day);//all enums printed
        }
    }
}
