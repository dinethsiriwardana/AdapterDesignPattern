public class RoundHole {
    double radius;

    RoundHole(double radius) {
        this.radius = radius;
    }

    boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}
