public class Cronometro {

    public int crono(int segundos ){
        int segund = 0;
        for (int i = 0; i < segundos; i++) {
            segund=i+1;
           delaySegundos();
        }
      return segund;
    }

    public static void delaySegundos() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
    }

}
