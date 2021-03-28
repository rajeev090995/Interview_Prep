package Program_practrice;


public class Sumoftwoprimenumber {


    public void checksumofprimenumber(int number) {

        boolean flag = false;

        for (int i = 2; i <= number / 2; i++) {


            if (checkprimenumber(i)) {

                int secondnumber = number - i;
                if (checkprimenumber(secondnumber)) {

                    if (i + secondnumber == number) {
                        System.out.println(" sum of two prime numbers  :- " + i + "+" + secondnumber + " = " + number);
                    }
                    else {
                        System.out.println( "Cannot be expressed as sum of two prime numbers");
                    }

                }


            }


        }

    }


    public boolean checkprimenumber(int num) {

        boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                flag = false;

                break;
            }

        }


        return flag;
    }


    public static void main(String[] args) {

        Sumoftwoprimenumber s1 = new Sumoftwoprimenumber();
        s1.checksumofprimenumber(36);



    }


}
