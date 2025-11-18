import java.util.*;

class Distance {
    int feet;
    int inches;

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void addDistance(Distance d2) {
        int sumFeet = this.feet + d2.feet;
        int sumInches = this.inches + d2.inches;

        if (sumInches >= 12) {
            sumFeet++;
            sumInches = sumInches - 12;
        }

        System.out.println("Total Distance: " + sumFeet + " feet " + sumInches + " inches");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 6);
        d1.addDistance(d2);
    }
}