package maths;

public class maths {
    public static void main(String[] args) {
        int x = 16;
        int y = 36;
        long myNum = 150000000L;
        int randomNum = (int) (Math.random() * y)+1;
        System.out.println("The root of 16 is: "+Math.sqrt(x));
        System.out.println("The root of 36 is: "+Math.sqrt(y));
        System.out.println("'"+Math.min(x, y)+"' is lower than '"+Math.max(x, y)+"'");
        System.out.println(Math.abs(x));
        System.out.println(Math.random());
        System.out.println(randomNum + " is a random number");
        System.out.println("The power of 16 is: "+ Math.pow(x,2));
        System.out.println(myNum + " is a long value");
        System.out.println("The root of 121 is: "+ Math.sqrt(121));
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
