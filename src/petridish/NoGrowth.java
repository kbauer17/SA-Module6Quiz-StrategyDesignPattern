package petridish;

/**
 * This population never grows. It always remains
 * exactly the same, no matter how much time passes.
 */
public class NoGrowth implements GrowthStrategy {

    @Override
    public long grow(long initialPopulation) {
        return initialPopulation;
    }

}
