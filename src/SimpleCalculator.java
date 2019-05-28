public class SimpleCalculator {
        double firstnumber;
        double secondnumber;

        public double getFirstnumber()
        {
            return firstnumber;
        }
        public void setFirstnumber(double firstnumber){
            this.firstnumber=firstnumber;
        }
        public double getSecondnumber()
        {
            return secondnumber;
        }
        public void setSecondnumber(double secondnumber){
            this.secondnumber=secondnumber;
        }
        public double getAdditionResult(){
            double result=firstnumber+secondnumber;
            return result;
        }
        public double getSubtractionResult(){
            double result=firstnumber-secondnumber;
            return result;
        }
        public double getMultiplicationResult(){
            double result=firstnumber*secondnumber;
            return result;
        }
        public double getDivisionResult(){
            if(secondnumber==0){
                return 0;
            }
            double result=firstnumber/secondnumber;
            return result;
        }
        public static void main(String[] args)
        {
            SimpleCalculator calculator= new SimpleCalculator();
            calculator.setFirstnumber(5.0);
            calculator.setSecondnumber(4);
            System.out.println("add= " +calculator.getAdditionResult());
            System.out.println("subtract= "+calculator.getSubtractionResult());
            System.out.println("multiply= "+calculator.getMultiplicationResult());
            System.out.println("division= "+calculator.getDivisionResult());
        }
}
