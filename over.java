   interface S {
    void k();
   }
   
   abstract class A implements S{
    public void k(){
        System.out.println("RAm RAm");
    }
    void csll(){
        System.out.println("Hi");
    }
    abstract void call();
        
    }
    
    class over extends A {
        public void call(){
            System.out.println("HI");
        }
        void dis(){
            System.out.println("Hello");
        }
       static void b(){
            System.out.println("Hello Vi");
        }
        static{
            System.out.println("RAd");
        }
        public static void main(String[] args) {
       


        }
    }
