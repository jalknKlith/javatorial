package codes;

public class maths {
    public static void main(String[] args) {
        int x = 16;
        int y = 20;
        int randomNum = (int) (Math.random() * 45)+1;
        System.out.println(Math.sqrt((double)x));
        System.out.println(Math.sqrt((double)y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(x));
        System.out.println(Math.random());
        System.out.println(randomNum);
        System.out.println(Math.pow(x,2));
    }
}

/*

import random
import math
x = 16
y = 20
randomNum = random.randint(0, 44)
print(math.sqrt(x))
print(math.sqrt(y))
print(min(x, y))
print(max(x, y))
print(abs(x))
print(random.random())
print(randomNum)
print(math.pow(x,2))

*/
