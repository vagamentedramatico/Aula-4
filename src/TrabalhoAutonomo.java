public class TrabalhoAutonomo {

    public static void main(String[] args){

///////////////////////////////////////
        
// 6
    primeInterval(1,6);
// 5
    primeNum(4);
// 4
    sumDiv(6);
// 3
    numDiv(6);
// 2
    sumFor(10);
// 1
    sumWhile(10);
    }

///////////////////////////////////////

// 6
    public static void primeInterval (int x, int y) {

        int rangeMin = x;
        int rangeMax = y;
        int count = 2;
        boolean isPrime = true;

        while (rangeMin <= rangeMax){
            while (count <= rangeMin / 2){
                if (rangeMin % count == 0){
                    isPrime = false;
                    break;
                }
                count = count + 1;
                }
                if(isPrime)
                    System.out.println("True");
                else
                    System.out.println("False");

        rangeMin = rangeMin + 1;
        }
    }
// 5
    public static void primeNum (int n) {

        int count = 2;
        boolean isPrime = true;

        while (count <= n / 2){
            if (n % count == 0){
                isPrime = false;
                break;
                }
            count = count + 1;
            }
            if(isPrime)
                System.out.println("True");
            else
                System.out.println("False");
    }
// 4
    public static void sumDiv (int n) {

        int sum = 0;
        int count = 1;

        while (count < n){
            if (n % count == 0) {
                sum = sum + (n / count);
            }
            count = count + 1;
        }
        System.out.println(sum);
    }
// 3
    public static void numDiv (int n) {

        int sum = 0;
        int count = 1;

        while (count <= n){
            if (n % count == 0) {
                sum = sum + 1;
            }
            count = count + 1;
        }
        System.out.println(sum);
    }
// 2
    public  static void sumFor (int n) {

        int sum = 0;

        for (int count = 1; count <= n; count++) {
            sum = sum + count;
        }
        System.out.println(sum);
    }
// 1
    public static void sumWhile (int n){

        int count = 1;
        int sum = 0;

        while (count <= n){
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);
    }

}
