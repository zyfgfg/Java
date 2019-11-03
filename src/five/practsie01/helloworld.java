package five.practsie01;
//1.interface Inter{void  show();}
//
//class Outer{  你的代码;  }
//
//class OuterDemo{
//
//    public static void  main(String[] args){
//
//        Outer.method().show();
//
//    }
//
//}
//
//要求在控制台输出“HelloWorld”
public class helloworld {
        interface Inter{void  show();}

        static class Outer{
            public static  Inter method(){
                return new Inter(){
                        @Override
                        public void show(){
            System.out.println("HelloWorld");
        }};}}

        static class OuterDemo{

            public static void  main(String[] args){

                Outer.method().show();

            }

        }




    }


