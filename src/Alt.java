public class Alt {

    public static void main(String[] args){
// 4.5
      for(int i = 0; i < 25; i++){
         System.out.println(i + "" + isPrime(i));
      }

// 4.6
      int a = 564505482;
      int b = 764283482;
          System.out.println("Intervalo entre " + a + " e " + b + " tem numeros primos? " + intervaloP(a, b));
    }
// 4.5
    public static boolean isPrime(int n){

        if (n <= 1) {
            return false;
            }
        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
// 4.6
    public static boolean intervaloP(int a, int b){

        for(int i = a; i <= b; i++){
            if(isPrime(i)) {
                System.out.println("Numero primo encontrado: " + i);
                    return true;
            }
        }
        return false;
    }
}
