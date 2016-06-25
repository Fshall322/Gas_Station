/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Repair
{
    char repairType;
    String repairTypeStr;
    double total;

    public Repair(char type)
    {
        switch(type)
        {
            case 'o': case 'O':
            repairTypeStr = "Oil Change";
            total=25;
            break;
            case 't': case 'T':
            repairTypeStr = "Tire Rotation";
            total=22;
            break;
            case 'b': case 'B':
            repairTypeStr = "Battery Check";
            total=15;
            break;
            case 'i': case 'I':
            repairTypeStr = "Break Inspection";
            total=5;
            break;
            default:
                repairTypeStr = "Oil Change";
                total=25;
                System.out.println("Error: Invalid Choice, Defaulting To Oil Change!");
        }
        repairType = type;
    }

    public Repair()
    {
        this('B');
    }

    public char getRepairType()
    {
        return repairType;
    }

    public double getTotal()
    {
        return total;
    }

    public String toString()
    {
        String output = "Repair Service:\n\tRepair Letter: "+repairType+"\n\tRepair Type: "+repairTypeStr+"\n\tPrice: $"+String.format("%.2f",total);
        return output;
    }
}
