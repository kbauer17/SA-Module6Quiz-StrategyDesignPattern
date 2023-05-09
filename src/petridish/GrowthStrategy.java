package petridish;

public interface GrowthStrategy {
    /**
     * Receives the initial population of organisms,
     * applies a growth formula, and returns the new
     * population after growth has occurred.
     *
     * @param initialPopulation Initial population
     * @return New population after growth occurs
     */
    long grow(long initialPopulation);
}
