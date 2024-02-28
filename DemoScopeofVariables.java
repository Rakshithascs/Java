package week_2;
class Hospital
{

    String patientName;
    int patientid;
    static String DocName="Dr. Murthy";
    void sethospital(String pN ,int pld)
    {
        patientName=pN; patientid=pld;
    }
    String getpatientName()
    {
        return patientName;
    }
    int getpatientid()
    {
        return patientid;
    }
}
public class DemoScopeofVariables
{
    public static void main(String args[])
    {
        String hospitalName="Apollo Hospital";
        Hospital patient1=new Hospital();
        patient1.sethospital("Anita Joseph",101);
        System.out.println("The patient" +patient1.getpatientName()+" With the Id"+patient1.getpatientid()+" is treated by" +patient1.DocName+"at"
        +hospitalName);
    }
}