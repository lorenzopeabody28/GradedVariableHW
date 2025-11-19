public class MadLib {

    public static void main(String[] args){
        System.out.println("Story Time");
        MadLib myStory= new MadLib();
    }
    public MadLib(){
        String classmate;
        classmate = "Bob";
        String friend;
        friend = "Niem";
        String city;
        city = "Kingston";
        String noun;
        noun = "sunscreen";
        String adjective;
        adjective = "fantastic";
        String pluralNoun;
        pluralNoun = "hat collection";
        String pluralAnimal;
        pluralAnimal = "gorillas";
        boolean trueOrFalse;
        trueOrFalse = true;
        boolean truth;
        truth = false;
        float decimalBiggerThan1;
        decimalBiggerThan1 = 67.67f;
        float chanceToLive;
        chanceToLive = 0.01f;
        int number1;
        number1 = 67;
        int number2;
        number2 = 4;
        int number3;
        number3 = 41;
        int wholeNumberBetween1And4;
        wholeNumberBetween1And4 = 3;
        String miltonTeacher;
        miltonTeacher = "Tyler";
        String miltonDean;
        miltonDean = "Mrs. Latham";
        char letterGrade;
        letterGrade = 'A';
        String season;
        season = "spring";
        String feeling;
        feeling = "annoyed";
        String doctorn;
        doctorn = "Jeff Hamswell";

        String myStory = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn an "
                +letterGrade+ "- in P.E. class. My good friend " +friend+ " said " +
                "he got attacked by one of the " +pluralAnimal+ ", but I think he was " +
                "telling a " +truth+ " story. When I asked him about it, he just said "
                +number3+ ". I was a little " +feeling+ ", and I decided to fight all "
                +number1+ " " +pluralAnimal+ " at once. In my fight with them I destroyed " +number3+
                " of them, but once I got to the " +number1+ "th, I had lost all of my teeth. A doctor named "
                +doctorn+ " said I had a " +chanceToLive+ "% chance to live, but I luckily survived. The end!";

        System.out.println(myStory);

    }
}
