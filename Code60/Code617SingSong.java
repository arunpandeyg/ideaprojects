package Code60;
//12day Christmas song

public class Code617SingSong {
    public static void main(String[] args) {
    Song song = new Song();
    song.getVerses();
    }

}

class Song{
    private static  String[] verses;
    private static int day;
    private String suffix;

    public Song(){
        day = 1;
        suffix = "st";
        verses = new String[]{
                " ",                          // this verses changes based on the day.
                "A partridge in a pear tree",
                "Two turtle doves",
                "Three French hens ",
                "Four calling birds",
                "Five gold rings",
                "Six geese a-laying ",
                "Seven swans a-swimming",
                "Eight maids a-milking",
                "Nine ladies dancing",
                "Ten lords a-leaping",
                "Eleven pipers piping",
                "Twelve drummers drumming"
        };
    }

    public void getVerses(){
        //looping through all 12 days
        int ALL_DAYS = 12;
        for (int c = 0; c < ALL_DAYS; c++){
            setSuffix();
            System.out.println(getFirstVerse(c + 1));

            //loop through verses from the end, and print correct number of verses based on what days
            // xmas it is.
            for (int i = day; i > 0; i--){
                if (i == 1 && day !=1)
                    System.out.println("and " + verses[1]);
                    else
                    System.out.println(verses[i]);
            }
            setDay();
            System.out.println();
            getDay();

        }
    }


    public String getFirstVerse(int currentDay){
        return "On the " + currentDay + getSuffix() + " day of Christmas my true love gave to me";
    }
    public static void setDay(){
        day++;
    }
    public static int getDay(){
        return day;
    }


    public  void setSuffix(){
        switch (day){
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case  3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
                break;

        }
    }
    public String getSuffix(){
        return suffix;
    }
}

