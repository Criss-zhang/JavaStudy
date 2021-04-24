package package02.enmu;

public enum Operation {
    PLUS{
        @Override
        public double eval(double x, double y) {
            return x +y;
        }
    },
    MINUS{
        @Override
        public double eval(double x, double y) {
            return x -y;
        }
    },
    TIMES{
        @Override
        public double eval(double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        @Override
        public double eval(double x, double y) {
            return x / y;
        }
    };

    public abstract double eval(double x,double y);
}
