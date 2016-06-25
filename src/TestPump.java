/**
 * Created by Frank Hall on 6/25/2016.
 */
public class TestPump
{
    public static void main(String[] args)
    {
        Pump pump1 = new Pump();
        Pump pump2 = new Pump("Premium 93 Octane",32);
        System.out.println("Gas One:\n"+pump1.toString());
        System.out.println("\nGas Two:\n"+pump2.toString());
    }
}
