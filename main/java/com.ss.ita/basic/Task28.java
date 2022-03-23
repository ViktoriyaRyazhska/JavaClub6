public class Solution {
    public static int sequence(int n) {
        int frst=0,sek=1,thr=0;
        for(int i=2;i<n;i++){
            thr=(frst+sek)%3;
            frst=sek;
            sek=thr;
        }
        return thr%3;
    }
}