public class Main {
        public static void main(String args[]) {
            new Thread(new Th1()).start();
            new Thread(new Th2()).start();
        }
    }

