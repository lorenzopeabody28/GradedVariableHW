public class Conditionals {
        public static void main(String[] args) {
            Conditionals MagicEightBall = new Conditionals();

        }
        public Conditionals () {
            String question = "Should I go fight an alligator?";
            System.out.println(question);

            int randomInt = (int)(Math.random() * 11);

            if (randomInt == 0) {
                System.out.println("It is certain");
            }
            else if (randomInt == 1) {
                System.out.println("Without a doubt");
            }
            else if (randomInt == 2) {
                System.out.println("Yes, definitely");
            }
            else if (randomInt == 3) {
                System.out.println("Outlook good");
            }
            else if (randomInt == 4) {
                System.out.println("Don't count on it");
            }
            else if (randomInt == 5) {
                System.out.println("My sources say no");
            }
            else if (randomInt == 6) {
                System.out.println("Very doubtful");
            }
            else if (randomInt == 7) {
                System.out.println("My reply is no");
            }
            else if (randomInt == 8) {
                System.out.println("Ask again later");
            }
            else if (randomInt == 9) {
                System.out.println("Better not tell you now");
            }
            else {
                System.out.println("Thy who laughs last didn’t get the joke.");
            }
        }
    }

