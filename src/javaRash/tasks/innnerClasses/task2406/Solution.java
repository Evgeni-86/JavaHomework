package javaRash.tasks.innnerClasses.task2406;

import java.math.BigDecimal;

/*
Наследование от внутреннего класса
*/

class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public class Apt3Bedroom extends Building.Apartments {
        public Apt3Bedroom(Building building) {
            building.super();
        }
    }

    public class BigHall extends Building.Hall{
        public BigHall(Building building, BigDecimal bigDecimal) {
            building.super(bigDecimal);
        }
    }

}

class Test {
    public static void main(String[] args) {
        Solution.BigHall bigHall = new Solution().new BigHall(new Solution().new Building(), new BigDecimal("123"));
    }
}