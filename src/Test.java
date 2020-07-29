public class Test {
    public static void main(String[] args) {
        System.out.println("main..."+testExcpeption());
    }
    public static int testExcpeption(){
        int result=1;
        try{
            System.out.println("try...");
            result=1/0;
            System.out.println("no");
        }catch (Exception e){
            System.out.println("catch...");
            return 0;
        }finally {
            System.out.println("finlly...");
            return result;
        }
    }
}
