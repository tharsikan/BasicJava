class Swmier{       // no handil
    public void m1(){
        // int i = 9/0;    // ArithmeticException
        System.out.println("m1 ok");
    }
    public void m2(){
        m1();
        System.out.println("m2 ok");
    }
    public void m3(){
        m2();
        int x =2/0;
    }
    public void m4(){
        m3();
    }
    public static void main(String[] args) {
        Swmier s = new Swmier();
        s.m4();
    }
}


// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Swmier.m1(Swmier.java:3)
//         at Swmier.m2(Swmier.java:6)
//         at Swmier.m3(Swmier.java:9)
//         at Swmier.m4(Swmier.java:12)
//         at Swmier.main(Swmier.java:16)

// m1 ok
// m2 ok
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Swmier.m3(Swmier.java:12)
//         at Swmier.m4(Swmier.java:15)
//         at Swmier.main(Swmier.java:19)