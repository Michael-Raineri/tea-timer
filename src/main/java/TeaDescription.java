public class TeaDescription {

    /**
     * Constructor for objects of class TeaDescription
     * @param nameOfTea  what the tea is called
     * @param typeOfTea  what kind of tea is it: White, Green, Black, etc
     * @param infusionTimeFirst  this is how long in seconds the fist infusion should take
     * @param infusionTimeNext  this is how long in seconds you should add for the next infusion
     * @param totalInfusionNo  how many infusions you can drink with this tea
     * @param gPer100ml  how many gramms you should use for each 100ml of hot water
     * @param tempC  How hot the temperature of water should be when infusing the tea
     */

    private String teaName;
    private String teaType;
    private int firstInfusionTime;
    private int nextInfusionTime;
    private int totalNoOfInfusions;
    private double gramsPer100ml;
    private int temperatureC;



    public TeaDescription(String nameOfTea, String typeOfTea, int infusionTimeFirst, int infusionTimeNext, int totalInfusionNo, double gPer100ml, int tempC)
    {
        teaName = nameOfTea;
        teaType = typeOfTea;
        firstInfusionTime = infusionTimeFirst;
        nextInfusionTime = infusionTimeNext;
        totalNoOfInfusions = totalInfusionNo;
        gramsPer100ml = gPer100ml;
        temperatureC = tempC;


    }

    public String getTeaDescriptionAll(){
        System.out.println("Name of tea: " + teaName);
        System.out.println("Type of tea: " + teaType);
        System.out.println("Length of first infusion: " + firstInfusionTime);
        System.out.println("Length of next infusion: " + nextInfusionTime);
        System.out.println("Total infusions per cup: " + totalNoOfInfusions);
        System.out.println("Grams per cup: " + gramsPer100ml);
        System.out.println("Temperature of the water: " + temperatureC + "C");

        return "";
    }

    /**
     * Returns the name of this tea
     */
    public String getTeaName()
    {
        return teaName;
    }

    /**
     * Returns the type of this tea
     */
    public String getTeaType()
    {
        return teaType;
    }

    /**
     * Returns how long the first infusion should take in seconds
     */
    public int getFirstInfusionTime()
    {
        return firstInfusionTime;
    }

    /**
     * Returns how long to add for each infusion after the first one
     */
    public int getnextInfusionTime()
    {
        return nextInfusionTime;
    }

    /**
     * Returns the total number of infusions you can dring from this tea
     */
    public int getTotalNoOfInfusions()
    {
        return totalNoOfInfusions;
    }

    /**
     * Returns the how many gramms that should be used for each 100ml of hot water
     */
    public double getGramsPer100ml()
    {
        System.out.println(gramsPer100ml);
        return gramsPer100ml;
    }

    /**
     * Returns the how hot the water of your tea should be when brewing
     */
    public int getTemperatureC()
    {
        return temperatureC;
    }{
    }
}

