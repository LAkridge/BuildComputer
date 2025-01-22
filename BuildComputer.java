package Buildapc;

public class BuildComputer
{
	public static void main(String[] args)
	{
		//public PC(String name, Monitor m, Motherboard mb, Case theCase){
        String name = new String("Ricardo");

        Resolution resolution = new Resolution(3860,1276);
        // public Monitor(String brandName, String model, Resolution resolution, double screenSize){
        Monitor m = new Monitor("HP","1AC",resolution, 42.3 )  ;

        Dimension dMotherboard = new Dimension(9.6, 12.0);
        //public Motherboard(String brandName, Dimension dMotherboard, String socketType)
        Motherboard mb = new Motherboard("Aseus",dMotherboard, "LGA1157");

        //public Case(String manufacture, int numberFans, String casetype, Dimension dimension)
        Dimension dimensionCase = new Dimension(5,5,5);
        Case theCase = new Case("HP",4,"Midtower",dimensionCase);

        PC myPC = new PC(name,  m,  mb, theCase);

        System.out.println(myPC);
	}
}