public class Clock
{
    public static int Past(int h, int m, int s)
    {
        int milliseconds = (h*60*60*1000)+(m*60*1000)+(s*1000);

        return milliseconds;
    }
}