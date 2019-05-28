public class Calculator {
        Carpet carpet;
        Floor floor;

        public Calculator(Floor floor, Carpet carpet)
        {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return (floor.length * floor.width * carpet.cost);
        }

}
