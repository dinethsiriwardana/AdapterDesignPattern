public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.squarePeg = squarePeg;
    }


    @Override
    double getRadius() {
        return Math.sqrt(Math.pow((squarePeg.width / 2), 2) * 2);
    }
}

