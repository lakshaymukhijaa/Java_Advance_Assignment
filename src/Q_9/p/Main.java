package Q_9.p;


import Q_9.p1.TwoDim;
import Q_9.p2.ThreeDim;

// as task mentioned Main class created
class Main {
    // main mthod called
    public static void main(String[] args) {
        TwoDim ref;
        ref = new TwoDim(3, 4);
        System.out.println(ref);
        ref = new ThreeDim(7, 9, 11);
        System.out.println(ref);
    }
}
