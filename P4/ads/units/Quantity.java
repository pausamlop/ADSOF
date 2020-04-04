package ads.units;
public enum Quantity {
        LENGTH{

        @Override
        public String toString() {
            return "L";

        }
    },
        TIME {
            @Override
            public String toString() {
                return "T";
            }
    };
}