package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int i=0,i2=1,i3;
        System.out.println(i);
        System.out.println(i2);
        if (lastFibonacci==3){
            System.out.println(i2);
        }else {
            for (i=0; i<lastFibonacci; ++i){
                i3=i+i2;
                System.out.println(i3);
                i=i2;
                i2=i3;
            }
        }

    }
}
