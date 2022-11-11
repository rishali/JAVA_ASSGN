public class Finalist implements Runnable
{
    int k1,k2,k3;
    int i1=0,i2=0,i3=0;

    @Override
        public void run() {
     long endTime = System.currentTimeMillis() + 10000;
     while (System.currentTimeMillis() < endTime) {
                synchronized (BakingCompetition.panel){
                    BakingCompetition.panel.add(1);
                    if(Thread.currentThread().getName()=="Finalist 1")
                    {
                        i1++;
                        System.out.println(Thread.currentThread().getName() +" "+ BakingCompetition.panel.size());

                    }
                    else if(Thread.currentThread().getName()=="Finalist 2")
                    {
                        i2++;
                        System.out.println(Thread.currentThread().getName() +" "+ BakingCompetition.panel.size());
                    }
                    else if(Thread.currentThread().getName()=="Finalist 3")
                    {
                        i3++;
                        System.out.println(Thread.currentThread().getName() +" "+ BakingCompetition.panel.size());
                    }

                    try {
                        BakingCompetition.panel.notifyAll();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }




     System.out.println(i1+" Finalist 1");
     System.out.println(i2+" Finalist 2");
     System.out.println(i3+" Finalist 3");

        }
    }

