package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int s=0;
        int k=0;
        int j=1;
        for (int i=0;i<=lengthOfLastNumber;i++){
            while (k<i){
                j*=10;
                k++;
            }
            int nine = 9 * j;
            s+= nine;
            System.out.println(s);

        }
        System.out.println(s);

    }
}
