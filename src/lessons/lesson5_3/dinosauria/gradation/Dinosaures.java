package lessons.lesson5_3.dinosauria.gradation;

import lessons.lesson5_3.dinosauria.gradation.coelurosauria.EvolutionLine;
import lessons.lesson5_3.dinosauria.gradation.coelurosauria.Predatorial;

public class Dinosaures implements EvolutionLine, Predatorial {

    @Override
    public boolean hasAncectors() {
        return false;
    }

    @Override
    public boolean predators() {
        return false;
    }
}
