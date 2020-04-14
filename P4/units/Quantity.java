package units;

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
    },
        COMPOSITE {
            @Override
            public String toString() {
                return "C";
            }
    };
}