public class MyMain{
    public static void main(String[] args) {
        int x = 12;
        MemParent MPobj = new MemParent();
        MemParent.MemChild MCobj = MPobj.new MemChild();                      // inside obj =>>>  new Child()
        System.out.println( MCobj.c);

        //StaticParent SPobj = new StaticParent();
        StaticParent.StaticChild SCobj = new StaticParent.StaticChild();    // just call =>>>  new Parent.Child() 
        System.out.println(SCobj.c);

        AnoParent APobj = new AnoParent(){
                            public Double print(){
                                return 0.767;
                            }
                            };
        System.out.println(APobj.print());

        MethodParent mp = new MethodParent();
        System.out.println(mp.x);
        mp.PMethod();
    }
}