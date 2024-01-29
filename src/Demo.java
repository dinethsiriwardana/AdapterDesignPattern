class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePeg squarePeg = new SquarePeg(4);

        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        if (roundHole.fits(adapter)) {
            System.out.println("Square peg fits into round hole.");
        } else {
            System.out.println("Square peg does not fit into round hole.");
        }
    }
}