package petridish;

public class BacteriaColony {
    // The current number of organisms in the colony
    private long population = 0;

    // This is the only class that BacteriaColony depends on!
    private GrowthStrategy growthStrategy;

    public BacteriaColony(long population) {
        this.population = population;
    }

    // Notice that we don't have a setPopulation() method
    // The population can only be changed by calling grow()
    public long getPopulation() {
        return population;
    }

    public void grow() {
        /*
         * Because we didn't ask for a GrowthStrategy in the constructor, we are
         * trusting the user of BacteriaColony to call setGrowthStrategy() BEFORE
         * they try to call grow(). In case they don't, this null check prevents
         * the program from crashing.
         */
        if (growthStrategy != null) {
            population = growthStrategy.grow(population);
        }
    }

    public void setGrowthStrategy(GrowthStrategy growthStrategy) {
        this.growthStrategy = growthStrategy;
    }
}
