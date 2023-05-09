package petridish;

/**
 * Logistic growth is like exponential growth, but it takes
 * into account the reality that populations can't grow beyond
 * what their environment can support (the carrying capacity).
 *
 * Therefore, as the population nears its maximum, the rate
 * of growth declines. When graphed, the number of organisms
 * produces an S-shaped curve, as the population hovers around
 * its maximum level.
 *
 * See https://www.khanacademy.org/science/biology/ecology/population-growth-and-regulation/a/exponential-logistic-growth
 */
public class LogisticGrowth implements GrowthStrategy {
    // Number of organisms per time unit
    private double growthRate;
    // The carrying capacity of the environment
    private long maxPopulation;

    public LogisticGrowth(double growthRate, long maxPopulation) {
        this.growthRate = growthRate;
        this.maxPopulation = maxPopulation;
    }

    @Override
    public long grow(long initialPopulation) {
        double instantaneousGrowthRate = Math.log1p(growthRate);
        long numerator = initialPopulation * maxPopulation;
        double denominator = initialPopulation + (maxPopulation - initialPopulation) * Math.pow(Math.E, -1 * instantaneousGrowthRate);
        return Math.round(numerator / denominator);
    }

}
