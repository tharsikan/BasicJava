public class MethodParent{
    public int x = 120;
    public void PMethod(){
        final int y = 12;               // should be final becouse  
        class MethodChild{
            int z = 1;

            public void CMethod() {
                // z = 2;
                // y = 12;
                System.out.println(x + " "+ y +" "+z);
            }
        }
        new MethodChild().CMethod();    // we cant use outside of mehod
    }
}