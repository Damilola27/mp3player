package practice;



public class Kata {
    int amountToPay;

    public int priceOfCopies(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            amountToPay = numberOfCopies * 1500;
        }
        if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            amountToPay = numberOfCopies * 1400;
        }
        if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            amountToPay = numberOfCopies * 1200;
        }
        if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            amountToPay = numberOfCopies * 1100;
        }
        if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            amountToPay = numberOfCopies * 1000;
        }
        if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            amountToPay = numberOfCopies * 900;

        }if (numberOfCopies > 200) {
            amountToPay = numberOfCopies * 800;
        }
                return amountToPay;

            }
        }