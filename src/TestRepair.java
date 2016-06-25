/**
 * Created by Frank Hall on 6/25/2016.
 */
public class TestRepair
{
    public static void main(String[] args)
    {
        Repair repair1 = new Repair();
        Repair repair2 = new Repair('I');
        System.out.println("Repair:\n"+repair1.toString());
        System.out.println("\nRepair:\n"+repair2.toString());
    }
}
